<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Gradebook</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="gradeForm.jsp">TheGradeBook</a>
    </div>
    <div>
      <ul class="nav navbar-nav">
      <li><a href="gradeForm.jsp">GradebookForm</a></li>
         <li><a href="allBook.jsp">All Gradebook</a></li>    
		<li class="active"><a href="#">Calculate</a></li>
      </ul>
    </div>
  </div>
</nav>

<h1> Calculation Generator</h1>
<h2> There are many customizable ways to view the gradebok </h2>
<h2> How would you like to view the gradebook?  </h2>

<h3> Organize by: </h3>
<input href="Calculate" type=submit name=display value="A) Student"> </input>
<input href="Calculate" type=submit name=display value="B) Assignment Type"> </input>
<input href="Calculate" type=submit name=display value="C) A & B"> </input>
<p></p>
A) StudentID: <input type="text" placeholder="student Id" name="A"><br>
<p></p>
<h3> Find Grade Average: </h3>
<input href="Calculate" type=submit name=display value="D) Student"> </input>
<input href="Calculate" type=submit name=display value="E) Student by Assignment Type"> </input>
<p></p>
<h3> For a Particular Assignment </h3>
<input href="Calculate" type=submit name=display value="F) Find Max Grade"> </input>
<input href="Calculate" type=submit name=display value="G) Find Min Grade"> </input>

</body>
</html>