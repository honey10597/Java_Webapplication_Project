package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class course_005finformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("        <table style=\"width:50%\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th colspan=\"4\" align=\"middle\">COURSE INFORMATION</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Course Name</th>\n");
      out.write("                <th>Course Credits</th>\n");
      out.write("                <th>Course Type</th>\n");
      out.write("                <th>Course Code</th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        ");
 
            try{
              
              Class.forName("com.mysql.cj.jdbc.Driver");
              String url="jdbc:mysql://localhost:3306/project?user=root&password=123456&useSSL=false";
              Connection con=DriverManager.getConnection(url);  
              String q="select * from course";
              PreparedStatement pstmt=con.prepareStatement(q);
              
              ResultSet rs=pstmt.executeQuery();
                while(rs.next())
                {
                    
      out.write("\n");
      out.write("                    ");

                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("    </head>\n");
      out.write("</html>\n");
      out.write("\n");
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
