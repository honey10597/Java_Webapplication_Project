<%-- 
    Document   : signup
    Created on : 14 Nov, 2018, 2:58:54 PM
    Author     : Honey
--%>
	
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
<style>

html, body {   
 width: 100%;   
height: 100%;   
font-family: "Helvetica Neue", Helvetica, sans-serif;   
color: #444;  
border-radius: 25px;
border: 7px red;
-webkit-font-smoothing: antialiased; 
background-image: url("dotted_2.jpg");
background-color: a;

}

input {
    font-family: "Helvetica Neue", Helvetica, sans-serif;
    font-size: 12px;
    background-color: yellow;
}



/*input[type=text]:focus, input[type=password]:focus {
    background-color: red;
    outline: none;
}*/

input[type=text],input[type=number],input[type=email],
input[type=password],#select_box {
    width: 400px;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    border-radius: 3px;
    background: #f1f1f1;
}



#container{  
width: 340px;
height: 340px;
top: 80%;
left: 50%;
margin: 0 auto;

}

#field_set{
    background-color: white;
    border-radius: 7px;
    width: 400px;
    
}

input[type=button] ,button[type=submit]{
    float: left;
    margin-right: 20px;
    margin-top: 20px;
    width: 80px;
    height: 30px;
    font-size: 14px;
    font-weight: bold;
    color: #fff;
    background-color: #00bfff; 
    border-radius: 30px;
    border: 1px solid #66add6;
    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);
    cursor: pointer;
}	
input[type=button]:hover ,button[type=submit]:hover
{
	background: #efed40;
	color: #262626;
}

input[type=text]:hover,input[type=number]:hover,input[type=email]:hover,
input[type=password]:hover
{
	background: lightgoldenrodyellow;
	color: #262626;
}


th
{
    text-align: left;
}
#can{
    align: left;
}
#sub{
    align: right;
}
</style>
<body>


<!--<form>
    <fieldset >
        <legend align="center"><font size="25" face="algerian" color="white">REGISTER</font></legend>
<div id="container">
<label for="Student ID"><b>Student ID</b></label>
<input type="text" id="Student ID" placeholder="Student ID"><br>

<label for="First Name"><b>First Name</b></label>
<input type="text" id="First Name" placeholder="First Name"><br>

<label for="Last Name"><b>Last Name</b></label>
<input type="text" id="Last Name" placeholder="Last Name"><br>

<label for="Email"><b>Email<b></label>
<input type="text" id="Email" placeholder="Email"><br>

<label for="Password"><b>Password<b></label>
<input type="Password" id="Password" placeholder="Password"><br>

<label for="Confirm Password"><b>Confirm Password<b></label>
<input type="text" id="Confirm Password" placeholder="Confirm Password"><br>

<label for="Mobile No."><b>Mobile No.<b></label>
<input type="number" id="Mobile No." placeholder="Mobile No."><br>

<a href="index.html"><input type="button"  value="cancel"></a>
<a href="index.html"><input type="button"  value="submit"></a>
</div>
    </fieldset>
</form>-->
  
<div id="container">
    <form action="signup">
        <fieldset id="field_set" align="left">
            <legend align="middle"><font face="verdana" color="black" size="6.5">SIGNUP</font></legend>
            <table>
                 <tr>
                     <th><b>User</b>
                    <div><select id="select_box"  name = "select_box">
                         <option value="Student">Student</option>
                         <option value="Faculty">Faculty</option>
                        </select></div>
                     </th>
                </tr>
                <tr>
                    <th>
                        <b>ID</b>
                        <input type="text"  placeholder="Student ID" name="id" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <b>Name</b>
                        <input type="text" placeholder="First Name" name="name" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <b>Email</b>
                        <input type="email"  placeholder="Email" name="email" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <b>Password<b>
                        <input type="Password"  placeholder="Password" name="pass" required>
                    </th>
                </tr>
                <tr>
                    <th>
                      <b>Confirm Password<b>
                        <input type="text" id="Confirm Password" placeholder="Confirm Password" name="c_pass" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <b>Mobile No.<b>
                        <input type="number"  placeholder="Mobile No." name="mob" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <a href="index.html"><button type="submit" id="sub" align="left">Submit</button></a>
                        <a href="index.html"><input type="button" id="can" value="cancel" align="right"></a>
                    </th>
                </tr>
            </table>
        </fieldset>
    </form>
</div>
</body>
</head>
</html>


