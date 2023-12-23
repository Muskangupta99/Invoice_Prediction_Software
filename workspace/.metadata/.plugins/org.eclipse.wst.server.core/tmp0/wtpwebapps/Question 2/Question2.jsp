<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<style> /*CSS*/
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 100%;
  background-color: #1488C5;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #7CB8D7;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  height: 200px;
  width: 50%;
 
}
</style>
</head>
<body>
<div>
<!-- -FORM , sending the data to the servlet on submit -->
<form  method="POST" action="Question2Servlet">
  
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="Your email..">

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Your password..">

    
    <input type="submit" value="Submit">
  </form></div>
</body>
</html>