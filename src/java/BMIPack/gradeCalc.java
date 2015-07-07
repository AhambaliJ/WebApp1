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
@WebServlet(name = "gradeCalc", urlPatterns = {"/gradeCalc"})
public class gradeCalc extends HttpServlet {

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
            
            double mid = Double.parseDouble(request.getParameter("mid")) * 0.3;
            double fin = Double.parseDouble(request.getParameter("fin")) * 0.3;
            double pro = Double.parseDouble(request.getParameter("pro")) * 0.4;
            
            double avgMark = mid + fin + pro;
            
            String grade = null;
            String result = null;
            int point = 0;
            
            if(avgMark>=90 && avgMark<= 100)
            {
                result = "Pass!";
                grade = "A";
                point = 4;
            }
            else if(avgMark>=80 && avgMark<=89)
            {
                result = "Pass!";
                grade = "B";
                point = 3;
            }
            else if(avgMark>=70 && avgMark<=79)
            {
                result = "Pass!";
                grade = "C";
                point = 2;
            }
            else if(avgMark>=60 && avgMark<=69)
            {
                result = "Pass!";
                grade = "D";
                point = 1;
            }
            else if(avgMark>=0 && avgMark<=59)
            {
                result = "Fail!";
                grade = "F";
                point = 0;
            }
            else
                out.println("Mark entered is not valid");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet gradeCalc</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet gradeCalc at " + request.getContextPath() + "</h1>");
            out.println("Average : " + avgMark);
            out.println("Grade : " + grade);
            out.println("Point : " + point);
            out.println("Result : " + result);
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
