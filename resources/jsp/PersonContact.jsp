<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person Contact</title>

<link href="css/contactstyle.css" rel="stylesheet" type="text/css">

<!--include jQuery -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"
type="text/javascript"></script>
 <!--include jQuery Validation Plugin-->
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.12.0/jquery.validate.min.js"
type="text/javascript"></script>
<!--Optional: include only if you are using the extra rules in additional-methods.js -->
<!-- <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.12.0/additional-methods.min.js"
type="text/javascript"></script> -->
<script src="js/contact.js"  type="text/javascript"></script>
</head>

<body>
<p>Enter Contact Info</p>
<form id="registration" method="POST" action="/myservlet/addContact">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="22%">&nbsp;</td>
    <td width="78%">&nbsp;</td>
    </tr>
  <tr>
    <td>First Name</td>
    <td><input type="text" name="firstName" id="firstName"></td>
  </tr>
   <tr>
    <td>Last Name</td>
    <td><input type="text" name="lastName" id="lastName"></td>
  </tr>
   <tr>
    <td>Email</td>
    <td><input type="text" name="email" id="email"></td>
  </tr>
   <tr>
    <td>Phone Number</td>
    <td><input type="text" name="phoneNumber" id="phoneNumber"></td>
  </tr>
</table>
<p>
<input type="submit" name="submit" value="Submit">
</p>
</form>
</body>
</html>