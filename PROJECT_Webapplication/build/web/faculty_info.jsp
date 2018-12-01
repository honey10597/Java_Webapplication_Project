<%-- 
    Document   : faculty_info
    Created on : 22 Nov, 2018, 2:41:07 PM
    Author     : Honey
--%>

<%@page import="modal.Faculty"%>
<%@page import="modal.student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%    
    
      Faculty fc = (Faculty) session.getAttribute("fct");
    
       String N=fc.getName_n();
       String E=fc.getEmail_e();
       
       String I=fc.getId_i();
       String M=fc.getMobile_no_m();
      
%>
   
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
    background-color:oldlace;
}

th{
     border: 1px solid black;
    text-align: center;
    text-align: center;
    padding: 10px;
    background-color:aliceblue;
}
table{
    margin-top: 80px;
}
        </style>
    <body>
         <div  class="container">
          
        <%=N%>
   
       <table style="width:50%" align="center">
            <tr>
                <th colspan="2" align="middle">TEACHER PERSONAL INFORMATION</th>
            <tr>
                <td>Student ID</td>
                <td><%=I%></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><%=N%></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><%=E%></td>
               
            </tr>
            <tr>
                <td>Mobile_No</td>
                <td><%=M%></td>  
            </tr>
      
        </table>
       
                
    </div>
    </body>
    </head>
</html>
