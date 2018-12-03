<html>
<head>
<style>

html, body {   
 width: 100%;   
height: 100%;   
font-family: "Helvetica Neue", Helvetica, sans-serif;   
color: #444;   
-webkit-font-smoothing: antialiased; 
background-image: url("img.jpg");
}

#container{  
position: fixed;
width: 340px;
height: 380px;
top: 50%;
left: 50%;
margin-top: -90px;
margin-left: -110px;

 border-radius: 3px;
 border: 1px solid #ccc;
 box-shadow: 0 1px 2px rgba(0, 0, 0, .3);
 background-color : white; 
 
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


p a {
    font-size: 11px;
    color: #aaa;
    float: right;
    margin-top: -13px;
    margin-right: 20px;
}
p a:hover {
    color: #555;
}
input {
    font-family: "Helvetica Neue", Helvetica, sans-serif;
    font-size: 12px;
    outline: none;
	
}
input[type=text],input[type=email],
input[type=password],#select_box {
    color: #777;
    padding-left: 10px;
    margin: 18px;
    margin-top: 12px;
    margin-left: 18px;
    width: 290px;
    height: 35px;
}
input[type=submit] {
    float: center;
	margin-left: 120px;
    margin-top: 20px;
    width: 80px;
    height: 30px;
    font-size: 14px;
    font-weight: bold;
	padding: 2px;
    color: #fff;
    background-color: #acd6ef; 
    background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));
    background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);
    border-radius: 30px;
    border: 1px solid #66add6;
    box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);
    cursor: pointer;
}	
</style>
</head>



<br><br>

<div id="container">     
<form acion="forgot">
    
<label><b>Email : </b></label>

<input type="email" id="username" name="email" required><br>

<label for="password"><b>New Password:</b></label>

<input type="password" id="password" name="password" required>

<label for="username"><b>User: </b></label><br>

<select id="select_box" name = "select_box">
                        <option value="Faculty">Faculty</option>
                        <option value="Student">Student</option>
</select>

<div id="lower">
<a href="index1.jsp"><input type="submit" align="center" value="Update" align="left"></a>

   

</form>
</div>

</body>

</html>