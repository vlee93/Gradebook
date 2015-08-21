<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>GPA Calc</title>
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
		<li><a href="Calculation.jsp">Calculation</a></li>
		<li class="active"><a href="#">GPA Calculator</a></li>
      </ul>
    </div>
  </div>
</nav>

<h3> Welcome to the GPA Calculator </h3>
<h4> Please enter the weights of the different assignment types (btw 1-4 credit hours): </h4>

 <form action="GPA" method="post" role="form">
  <div class="form-group">
    <label for="homework">Homework:</label>
    <input name="homework">
  </div>
    <div class="form-group">
    <label for="quiz">Quiz:</label>
    <input name="quiz">
  </div>
  <div class="form-group">
    <label for="test">Test:</label>
    <input name="test">
  </div>
  <div class="form-group">
    <label for="project">Project:</label>
    <input name="project">
  </div>
  <p></p>
  <h4> Please enter the studentID of the interested student: </h4>
      <label for="studentID">Student ID:</label>
    <input name="studentID">
  
  <input type="submit" value="submit">
</form>

</body>
</html>