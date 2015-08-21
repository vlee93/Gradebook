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
		<li class="active"><a href="#">Calculation</a></li>
      </ul>
    </div>
  </div>
</nav>

<h2> Calculation Generator</h2>
<h4> There are many customizable ways to view the gradebok </h4>
<h4> How would you like to view the gradebook?  </h4>
<form action="Calculate" method="post" role="form">
<h4> Please enter your information:</h4>
<input type="text" placeholder="student Id" name="A">
 <br><input type="text" placeholder="assignment type" name="B"><br>
 
<h3> Choose an option: </h3>
<h4> Sort by: </h4>
A) StudentID:
<input href="Calculate" type=submit name=display value="A"> </input>
<p></p>

B) Assignment Type:
<input href="Calculate" type=submit name=display value="B"> </input>
<p></p>

C) StudentID & Assignment Type:
<input href="Calculate" type=submit name=display value="C"> </input>
<p></p>

<p></p>

<h4> Find: </h4>
D) Student Grade Average: 
<input href="Calculate" type=submit name=display value="D"> </input>
<p></p>

E) Highest and Lowest grade for assignment type:
<input href="Calculate" type=submit name=display value="E"> </input>
<p></p>

</form>

</body>
</html>