
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color: red;">Insert</h1>
        <form action="../InsertServlet" method="post">
            <table>
                <tr>
                    <td>EmpCode</td>
                    <td><input type="text" name="empcode" required pattern="E[0-9]{3}-[0-9]{3}"></td>
                </tr>
                <tr>
                    <td>EmpName</td>
                    <td><input type="text" name="empname" required></td>
                </tr>
                <tr>
                    <td>Salary</td>
                    <td><input type="number" name="salary" required min="1" ></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><input type="number" name="age" required min="10" max="60"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" required></td>
                </tr>
            </table>
            <input type="submit" value="Insert"/>
            <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
