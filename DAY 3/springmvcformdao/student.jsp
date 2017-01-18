<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%>
<%@ include  file="includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Student Managerment</title>
</head>
<body>
<center><h1><font color="green">Student Details</font></h1></center>
<center>
<form:form action="student"  method="POST" commandName="student">
   <table>
      <tr>
            <td>Student Id</td>
            <td><form:input path="studentId"/></form></td>
      </tr>
      <tr>
            <td>First Name</td>
            <td><form:input path="firstname"/></td>
      </tr>
     <tr>
            <td>Last Name</td>
            <td><form:input path="lastname"/></td>
      </tr>
   
     <tr>
            <td>Marks </td>
            <td><form:input path="marks"/></td>
      </tr>
      <tr>
        <td colspan="2">
            <input type="submit"   name="action"  value="Add">
            <input type="submit"   name="action"  value="Edit">
            <input type="submit"   name="action"  value="Delete">
            <input type="submit"   name="action"  value="Search">
        </td>
      </tr>
 </table>
</form:form>
</center>
<br>
<center>
<table border="2" width=80% height=10>
<tr>
			<th>Student Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Marks</th>
</tr>
<c:forEach  items="${studentList }"   var="student">
<tr>
         <td>${student.studentId}</td><td>${student.firstname}</td><td>${student.lastname}</td><td>${student.marks}</td>
</tr>    
</c:forEach>
</table>
</center>
</body>
</html>