package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modal.Faculty;
import modal.student;

public final class student_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

   
    student obj = (student) session.getAttribute("std");
    
    String Name = obj.getName();
    String Email = obj.getEmail();
    String Student_id=obj.getId();
    String Mobile_no = obj.getMobile_no();
    
//    
//      Faculty fc = (Faculty)session.getAttribute("fct");
//       String N=fc.getName();
//       String E=fc.getEmail();
//       String I=fc.getId();
//       String M=fc.getMobile_no();
    
    

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=0\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("    border-collapse: collapse;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table,td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    text-align: center;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 10px;\n");
      out.write("    background-color:oldlace;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th{\n");
      out.write("     border: 1px solid black;\n");
      out.write("    text-align: center;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 10px;\n");
      out.write("    background-color:aliceblue;\n");
      out.write("}\n");
      out.write("table{\n");
      out.write("    margin-top: 80px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("         <div  class=\"container-fluid\">\n");
      out.write("             ");
      out.write("\n");
      out.write("        <table style=\"width:50%\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th colspan=\"2\" align=\"middle\">FACULTY PERSONAL INFORMATION</th>\n");
      out.write("            <tr>\n");
      out.write("                <td>TEACHER ID</td>\n");
      out.write("                <td>");
      out.print(Student_id);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td>");
      out.print(Name);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>");
      out.print(Email);
      out.write("</td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Mobile_No</td>\n");
      out.write("                <td>");
      out.print(Mobile_no);
      out.write("</td>  \n");
      out.write("            </tr>\n");
      out.write("      \n");
      out.write("        </table>\n");
      out.write("       ");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("    </head>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
