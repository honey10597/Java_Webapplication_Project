/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Faculty;
import modal.FacultyDAO;
import modal.Forgot;
import modal.ForgotDAO;

/**
 *
 * @author Honey
 */
public class forgot extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
             response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String Email=request.getParameter("email");
        String Password=request.getParameter("password");
        String User=request.getParameter("select_box");
        
        Forgot f=new Forgot();
        
        ForgotDAO fdao=new ForgotDAO();
        
        System.out.println(Email+" "+Password+" "+User);
        
        if(User.equals("Student"))
        {
          if (fdao.update(Email, Password, User)) {
            out.println("<script>");
            out.println("alert('Data successfully saved');");
            out.println("</script>");
               RequestDispatcher rd = request.getRequestDispatcher("index1.jsp");         
//            student std = sdao.getStudentData(Email);
//                
//            session.setAttribute("user",std.getUser());
//            session.setAttribute("std", std);
//            
            response.sendRedirect("index1.jsp");
            rd.include(request, response);
        }
       else {
            RequestDispatcher rd = request.getRequestDispatcher("forgot_password.jsp");
            out.println("<script>");
            out.println("alert('failed');");
            out.println("</script>");
            rd.forward(request, response);
             
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(forgot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(forgot.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(forgot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(forgot.class.getName()).log(Level.SEVERE, null, ex);
        }
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
