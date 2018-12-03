<%-- 
    Document   : marks
    Created on : 26 Nov, 2018, 11:13:58 AM
    Author     : Honey
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=0">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            table {
    border-collapse: collapse;
}

table,td {
    border: 1px solid black;
    text-align: center;
    text-align: center;
    padding: 10px;
    background-color:aliceblue;
}

th{
     border: 1px solid black;
    text-align: center;
    text-align: center;
    padding: 10px;
    
    background-color:oldlace;
}
table{
    margin-top: 80px;
}
        </style>
    <body>
         <div  class="container-fluid">
        <table style="width:50%" align="center">
            <tr>
                <th colspan="5" align="middle">COURSE INFORMATION</th>
            </tr>
            <tr>
                <th>S no.</th>
                <th>Course Name</th>
                <th>Marks</th>
            </tr>
        
        <% 
            
            try{
              
              Class.forName("com.mysql.cj.jdbc.Driver");
              String url="jdbc:mysql://localhost:3306/project?user=root&password=123456&useSSL=false";
              Connection con=DriverManager.getConnection(url);  
              String q="select * from marks";
              PreparedStatement pstmt=con.prepareStatement(q);
             
              ResultSet rs=pstmt.executeQuery();
                while(rs.next())
                {
                    %>
                    <tr>
                        <td><%=rs.getString(1)%></td>
                    
                        <td><%=rs.getString(2)%></td>
                    
                        <td><%=rs.getString(3)%></td>
   
                    </tr>
        <%
                }
                    rs.close();
                    pstmt.close();
                    con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            %>
       
            
            </table>
        </div>
    </body>
    </head>
</html>


