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
import javax.servlet.http.HttpSession;
import modal.Faculty;
import modal.FacultyDAO;
import modal.student;
import modal.studentDAO;

/**
 *
 * @author Honey
 */
public class signup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String User = request.getParameter("select_box");
        String Student_id = request.getParameter("id");
        String Name = request.getParameter("name");
        String Email = request.getParameter("email");
        String Password = request.getParameter("pass");
        String Confirm_password = request.getParameter("c_pass");
        String Mobile_no = request.getParameter("mob");
        
        System.out.println(User+" "+Student_id+" "+Name+" "+Email+" "+Password+" "+Confirm_password+" "+Mobile_no);
        
        studentDAO sdao = new studentDAO();
        
        FacultyDAO fdao=new FacultyDAO();
         
        
        HttpSession session = request.getSession();
        
        if(User.equals("Student"))
        {
        
        if (sdao.update(User, Student_id, Name, Email, Password, Confirm_password, Mobile_no)) {
            out.println("<script>");
            out.println("alert('Data successfully saved');");
            out.println("</script>");
               RequestDispatcher rd = request.getRequestDispatcher("index.html");         
            student std = sdao.getStudentData(Email);
                
            session.setAttribute("user",std.getUser());
            session.setAttribute("std", std);
            
            response.sendRedirect("index.html");
            rd.include(request, response);
        }
       else {
            RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
            out.println("<script>");
            out.println("alert('signup failed');");
            out.println("</script>");
            rd.forward(request, response);
             
        }
        }
       else if(User.equals("Faculty"))
          
        {
            if(fdao.update_f(User, Student_id, Name, Email, Password, Confirm_password, Mobile_no))
            {
                RequestDispatcher rd=request.getRequestDispatcher("index.html");
                
                out.println("<script>");
                out.println("alert('Data successfully saved');");
                out.println("</script>");
                
                Faculty fct=fdao.getFacultyData(Email);
            
                 session.setAttribute("fct", fct);
                 
                  session.setAttribute("user", fct.getUser_u());
                  
                  response.sendRedirect("index.html");
            }
            else
            {
                 RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
                 out.println("<script>");
                 out.println("alert('signup failed');");
                 out.println("</script>");
                 rd.forward(request, response);
            }
        }
        else {
   out.println("<scritp>");
   out.println("alert('Signup failed'");
   out.println("</scritp>");
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
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
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
