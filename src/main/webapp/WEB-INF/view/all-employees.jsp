<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 19.11.2022
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees list</title>
</head>
<body>
<h1>All employees</h1>
<table>
  <tr>
    <th>Name</th>
    <th>Surname</th>
    <th>Department</th>
    <th>Salary</th>
    <th>Operations</th>
  </tr>
  <c:forEach var="emp" items="${allEmployees}">
    <c:url var="updateButton" value="/updateInfo">
      <c:param name="empId" value="${emp.id}"/>
    </c:url>
    <tr>
      <td>${emp.name}</td>
      <td>${emp.surname}</td>
      <td>${emp.department}</td>
      <td>${emp.salary}</td>
      <td>
        <input type="button" value="Update"
        onclick="window.location.href='${updateButton}'">
      </td>

    </tr>
  </c:forEach>
</table>
<br>
<input type="button" value="Add"
  onclick="window.location.href='addNewEmployee'">
</body>
</html>
