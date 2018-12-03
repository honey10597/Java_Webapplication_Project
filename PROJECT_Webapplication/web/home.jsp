<%-- 
    Document   : home
    Created on : 14 Nov, 2018, 2:59:33 PM
    Author     : Honey
--%>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        body{
           background-image: url("log_bggg.png");
            background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center; 
    background-size: 1400px 768px;  
    background-color:papayawhip;
}
        
        #container{
            margin-top: 15px;
            background-color: white;   
            border-radius: 5px;
            border: 2px black;
            border-style: solid;
        }
        th{
            padding: 5px;
        }
        
        
        a:hover,h1:hover {
    background-color: ;
    border-radius: 7px;
}
        
      input[type=button] {
    float: right;
    align: ;
    margin-left: px;
    margin-bottom: px;
    width: px;
    height: 30px;
    font-size: 14px;
    font-weight: bold;
    color: white;
    background-color: red; 
    background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));
    background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    border-radius: 30px;
    border: 1px solid #66add6;
    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);
    cursor: pointer;
}
      
.mySlides fade{
    height: 50px;
    width: 72px;
}
a{text-decoration: none;} 

#frame_container{
    border:2px solid;
}
    </style>
<body>
    <div class="container-fluid">
        <div class="row">
              <div class="col-sm-2"> <img src="icon.png"  width="100" height="100"style="margin: -10px 20px"></div>
             <div class="col-sm-8"><font face="" size="6" style="margin: 50px 80px">STUDENT & ASSESMENT MANAGEMENT</font></div>
              <div class="col-sm-0">
                  <% if(request.getSession().getAttribute("Name")==null)
                  {
                      System.out.println("alert('you are not logged in');");
                      response.sendRedirect("index1.jsp");
                  }
                  %>
                  <p align="right"><font face="sitka small" size="3">Welcome <%=session.getAttribute("Name")%></font></p> 
            </div>
        </div>
    </div>
            
            
            
    <div id="container">  
        <table width="100%">
            <tr>  
            <th>
                <a href="home_1.jsp" target="iframe"> <h1 ><font face="sitka small" color="black" size="5">HOME </font></h1></a>
            </th>
            <th>
               <a href="student_info.jsp" target="iframe"><h1 id="saf"><font face="sitka small" color="black" size="5">PERSONAL INFO</font></h1></a>
            </th>
            <th>
                <a href="dashboard_info.jsp"target="iframe"> <h1 ><font face="sitka small" color="black" size="5">DASHBOARD</font></h1></a>
            </th>
            <th>
                <h1 ><font face="sitka small" color="black"size="5">VISIT CAMPUS</font></h1>
            </th>
            <th>
                <h1><font face="sitka small" color="black" size="5">ABOUT US</font></h1>
            </th>
            <th> <a href="logout" ><h1 align="right"> <font face="sitka small" color="black" align="left" size="3"><input type="button" value="LOGOUT"></font></h1></a>
            </th>
            </tr>
        </table>
    </div>
            <div id="frame_container">
                <iframe height="700px" width="100%" src="home_1.jsp" name="iframe"></iframe>
            </div>
 </body>
</head>
</html>