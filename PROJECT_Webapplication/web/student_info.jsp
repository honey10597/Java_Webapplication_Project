<%-- 
    Document   : student_info
    Created on : 19 Nov, 2018, 2:03:21 PM
    Author     : Honey
--%>

<%@page import="modal.Faculty"%>
<%@page import="modal.student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    student obj = (student) session.getAttribute("std");
    
    String Name = obj.getName();
    
    String Email = obj.getEmail();
    String Student_id = obj.getId();
    String Mobile_no = obj.getMobile_no();    
    
     
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
           
          
        <%=Name%>
     <%--   <% 
            if(User.equals("Student"))
           {
        %>
       --%>
            
             <table style="width:50%" align="center">
            <tr>
                <th colspan="2" align="middle">STUDENT PERSONAL INFORMATION</th>
            <tr>
                <td>STUDENT ID</td>
                <td><%=Student_id%></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><%=Name%></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><%=Email%></td>
               
            </tr>
            <tr>
                <td>Mobile_No</td>
                <td><%=Mobile_no%></td>  
            </tr>
        </table>
      <%--
                <% }
else if(User.equals("Faculty"))
{
            %>
             
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
       
                <%
                    }
else{
System.out.println("user");
}
%>
         --%>
    </div>
    </body>
    </head>
</html>
