
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
html, body {   
 width: 100%;   
height: 100%;   
font-family: "Helvetica Neue", Helvetica, sans-serif;   
color: #444;   
-webkit-font-smoothing: antialiased; 
   border-radius: 25px;
background-image:url("dotted_2.jpg");
background-size: 1400px 650px;
background-repeat: no-repeat;
background-attachment: fixed;
}

#container{  
top: 50%;
left: 50%;
margin: 0 auto;
height: 500px;
width: 800px;
border-: url("border_img.gif");
}

.icon {
    padding: 10px;
    background: dodgerblue;
    color: white;
    min-width: 50px;
    text-align: center;
}

#field_set{  
border-radius:8px;
border: 1px #F00 solid;
border-color: black;
width: 375px;
height: 435px;
margin-left:230px;
margin-top: 38px;
padding-top: 0.35em;
padding-bottom: 0.625em;
padding-left: 0.75em;
padding-right: 0.75em;
box-shadow: 25px;
background: white;
}

form {
    margin: 0 auto;
    margin-top: 20px;
}
label {
    color: #555;
    display: inline-block;
    margin-left: 18px;
    padding-top: 10px;
    font-size: 22px;
}

input {
    font-family: "Helvetica Neue", Helvetica, sans-serif;
    font-size: 12px;
    outline: none;
    background-color: ;
}
input[type=email],
input[type=password],#select_box{
    padding-left: 10px;
/*    margin-top: 12px;
    margin-left: 18px;*/
    margin: 12px 0 18px 0;
    display: inline-block;
    width: 290px;
    height: 35px;
    border-bottom: 4px;
    border: none;
    background: rgba(0,0,0,0.1);  
}

#heading_tag
{
    background-color:white;
}

button[type=submit]:hover,input[type=button]:hover
{
	background: #efed40;
	color: #262626;
}

input[type=text]:hover,input[type=number]:hover,input[type=email]:hover,
input[type=password]:hover,#select_box:hover
{
	background: #acd6ef;
	color: #262626;
}
button[type=submit],input[type=button] {
    margin-left: 8px;
    margin-top: 5px;
    width: 270px;
    height: 30px;
    font-size: 14px;
    font-weight: bold;
    color: white;
    background-color:dodgerblue;
/*    background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));
    background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);*/
    border-radius: 30px;
    border: 1px solid #66add6;
    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);
    cursor: pointer;
}
.logo_img{
    margin-left: 150px;
    margin-right: auto;
    width: 50%;
}
</style>
<script type="text/javascript">
    <% 
        try{
        if(request.getSession().getAttribute("isLoggedIn").equals("true"))
    {
        response.sendRedirect("home.jsp");
    }
    else
    {
        response.sendRedirect("index1.jsp");
    }
        } catch(Exception e)
        {
            System.out.println(e);
        }
        
    %>
</script>
</head>
<body> 
   
    
    
    
    <div id="heading_tag">
<h1 align="center" ><i><font face=""  size="300" color="black" style="comic sans MS">STUDENT & ASSESMENT MANAGEMENT</font></i></h1>
    </div>
<div id="container">
    <form action="login" >
        <fieldset id="field_set" align="left" >
            <img src="login_logo.png" style="height:100px;width:100px;" class="logo_img">
        <table>
            <tr>
                <th>
                    <div><i class="fa fa-envelope icon"></i> <input type="email"  placeholder="Email" name="email" required></div>
                </th>
            </tr>
            <tr>
                <th>
                    <div> <i class="fa fa-key icon"></i><input type="password"  placeholder="password" name="password" required></div>
                </th>
            </tr>
           <tr>
                <th>
                    <div>  <i class="fa fa-user icon"></i> <select id="select_box" name = "select_box">
                        <option value="Faculty">Faculty</option>
                        <option value="Student">Student</option>
                        </select></div>
                </th>
            </tr>
            <tr>
                <th>
                    <a href="home.jsp"><button type="submit">LOGIN</button></a>
                </th>
            </tr>
            <tr>
                <th>
                    <a href="signup.jsp"><input type="button" value="Register"></a>
                </th>
            </tr>
            <tr>
                <th>
                    <a href="forgot_password.jsp"><input type="button" value="forgot password"></a>
                </th>
            </tr>
        </table>
        </fieldset>
    </form>
</div>
    
</body>
</html>
