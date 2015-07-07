/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMIPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kensiv
 */
@WebServlet(name = "PreviewSurvey", urlPatterns = {"/PreviewSurvey"})
public class PreviewSurvey extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String number = request.getParameter("number");
           
            String PrefedMusic = null;
            
            int easy = 0,rock = 0,jazz =0,classic = 0,folk =0,heavy =0;
            if(request.getParameter("easy") != null)
            {
                if(PrefedMusic == null)
                    PrefedMusic = "Easy Listening";
                else
                    PrefedMusic +=" & Easy Listening";
            }
            if(request.getParameter("rock") != null)
            {
                if(PrefedMusic == null)
                    PrefedMusic = "Rock n' Roll";
                else
                    PrefedMusic +=" & Rock n' Roll";
            }
            if(request.getParameter("jazz") != null)
            {
                if(PrefedMusic == null)
                    PrefedMusic = "Jazz";
                else
                    PrefedMusic +=" & Jazz";
            }
            if(request.getParameter("class") != null)
            {
                if(PrefedMusic == null)
                    PrefedMusic = "Classical";
                else
                    PrefedMusic +=" & Classical";
            }
            if(request.getParameter("folk") != null)
            {
                if(PrefedMusic == null)
                    PrefedMusic = "Folk";
                else
                    PrefedMusic +=" & Folk";
            }
            if(request.getParameter("heavy") != null)
            {
                if(PrefedMusic == null)
                    PrefedMusic = "Heavy Metal";
                else
                    PrefedMusic +=" & Heavy Metal";
            }
            
            int musicFav = Integer.parseInt(request.getParameter("musicFav"));
            String FavedMusic = null;
            if(musicFav == 1)
                FavedMusic = "Fifties";
            else if(musicFav == 2)
                FavedMusic = "Sixties";
            else if(musicFav == 3)
                FavedMusic = "Seventies";
            else if(musicFav == 4)
                FavedMusic = "Eighties";
            else if(musicFav == 5)
                FavedMusic = "Nineties";
            else if(musicFav == 6)
                FavedMusic = "Tens";
            
            int musicDay = Integer.parseInt(request.getParameter("musicDay"));
            String DayMusic = null;
            if(musicDay == 1)
                DayMusic = "Mondays";
            else if(musicDay == 2)
                DayMusic = "Tuesdays";
            else if(musicDay == 3)
                DayMusic = "Wednesdays";
            else if(musicDay == 4)
                DayMusic = "Thursdays";
            else if(musicDay == 5)
                DayMusic = "Fridays";
            else if(musicDay == 6)
                DayMusic = "Saturdays";
            else if(musicDay == 7)
                DayMusic = "Sundays";
                
            int listen = Integer.parseInt(request.getParameter("listen"));
            String Listen = null;
            if(listen == 1)
                Listen = "every day";
            else if(listen == 2)
                Listen = "one day a week";
            else if(listen == 3)
                Listen = "2 or 3 days";
            else if(listen == 4)
                Listen = "4 or 5 days";
            
            int placePref = Integer.parseInt(request.getParameter("placePref"));
            String PrefedPlace = null;
            if(request.getParameter("home") != null)
            {
                if(PrefedPlace == null)
                    PrefedPlace = "at home";
                else
                    PrefedPlace +=" & at home";
            }
            if(request.getParameter("car") != null)
            {
                if(PrefedPlace == null)
                    PrefedPlace = "in my car";
                else
                    PrefedPlace +="  & in my car";
            }
            if(request.getParameter("work") != null)
            {
                if(PrefedPlace == null)
                    PrefedPlace = "at work";
                else
                    PrefedPlace +=" & at work";
            }
            
            String comment = request.getParameter("comment");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PreviewSurvey</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PreviewSurvey at " + request.getContextPath() + "</h1>");
            out.println("Your name is " + name +"<br/>");
            out.println("Your e-mail is " + email +"<br/>");
            out.println("Your contact number is " + number +"<br/>");
            out.println("Your preferred music is/are " + PrefedMusic +"<br/>");
            out.println("Your favorite music is " + FavedMusic +"<br/>");
            out.println("Your like to listen music on " + DayMusic +"<br/>");
            out.println("Your listen to WARNARadio " + Listen +"<br/>");
            out.println("Your like to listen music " + PrefedPlace +"<br/>");
            out.println("Your comment/suggestion to us is " + comment +"<br/>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
