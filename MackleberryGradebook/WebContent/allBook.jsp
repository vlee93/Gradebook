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
      <li><a href="gradeForm.jsp">Gradebook Form</a></li>
        <li class="active"><a href="#">All Gradebook</a></li>
		<li><a href="Calculation.jsp">Calculation</a></li>
		<li><a href="GPAcalc.jsp">GPA Calculator</a></li>
      </ul>
    </div>
  </div>
</nav>

<table class="table table-bordered">
    <thead>
      <tr>
        <th>Student ID</th>
        <th>Class</th>
        <th>Assignment</th>
        <th>Assignment Type</th>
        <th>Assignment Date</th>
        <th>Grade</th>
      </tr>
    </thead>
    <tbody>
  ${allBook} </table>	
 </tbody>

<h4> The average is:</h4> ${average}

</body>
</html>