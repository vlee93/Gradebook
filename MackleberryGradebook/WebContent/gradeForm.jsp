<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Grade Form</title>
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
        <li class="active"><a href="#">GradebookForm</a></li>
         <li><a href="allBook.jsp">All Gradebook</a></li>    
		<li><a href="Calculation.jsp">Calculation</a></li>
      </ul>
    </div>
  </div>
</nav>


<h1> Welcome to the GradeBook </h1>
<h3> Please input a grade below: </h3>


 <form action="GradeInput" method="post" role="form">
  <div class="form-group">
    <label for="studetID">Student ID:</label>
    <input name="studetID">
  </div>
  <div class="form-group">
    <label for="assignment">Assignment:</label>
    <input type="text" name="assignment">
  </div>
  <div class="form-group">
    <label for="assignType">Type (homework, quiz, test, or project):</label>
    <input type="text" name="assignType">
  </div>
    <div class="form-group">
    <label for="assignDate">Date (MM/DD/YYYY):</label>
    <input name="assignDate">
  </div>
    <div class="form-group">
    <label for="grade">Grade:</label>
    <input name = "grade">
  </div>
  <input type="submit" value="submit">
</form>

<h5> Or just press submit to go to gradebook.</h5>


</body>
</html>