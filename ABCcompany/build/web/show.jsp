<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color: green">Employee</h1>
        <table border="1">
            <tr>
                <td>EmpName</td>
                <td>EmpCode</td>
                <td>Salry</td>
                <td>Age</td>
                <td>Mail</td>
                <td>Action</td>

            </tr>            
            <c:forEach items="${list}" var="emp">
                <tr>
                    <td>${emp.empCode}</td>
                    <td>${emp.empName}</td>
                    <td>${emp.salary}</td>
                    <td>${emp.age}</td>
                    <td>${emp.email}</td>
                    <td><a href="deleteServlet?id=${emp.empCode}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
