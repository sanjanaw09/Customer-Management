<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Import the JSTL core tag library -->
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Customer Details</h1>
    <!-- Form to submit customer details -->
    <form action="req2" method="post">
        <table>
            <tr>
                <!-- Input for customer ID -->
                <td align="right">Id:</td>
                <td><input type="text" name="id" value="0"></td>
            </tr>
            <tr>
                <!-- Input for customer's first name -->
                <td align="right">First Name:</td>
                <td><input type="text" name="first_name"></td>
            </tr>
            <tr>
                <!-- Input for customer's last name -->
                <td align="right">Last Name:</td>
                <td><input type="text" name="last_name"></td>
            </tr>
            <tr>
                <!-- Input for customer's street -->
                <td align="right">Street:</td>
                <td><input type="text" name="street"></td>
            </tr>
            <tr>
                <!-- Input for customer's address -->
                <td align="right">Address:</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <!-- Input for customer's city -->
                <td align="right">City:</td>
                <td><input type="text" name="city"></td>
            </tr>
            <tr>
                <!-- Input for customer's state -->
                <td align="right">State:</td>
                <td><input type="text" name="state"></td>
            </tr>
            <tr>
                <!-- Input for customer's email -->
                <td align="right">Email:</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <!-- Input for customer's phone number -->
                <td align="right">Phone:</td>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <!-- Buttons for add, view, and delete actions -->
                <td align="center" colspan="2">
                    <input type="submit" name="b1" value="Add">
                    <input type="submit" name="b1" value="View">
                    <input type="submit" name="b1" value="Delete">
                </td>
            </tr>
        </table>
    </form>
    <!-- Status message displayed in green -->
    <h4><font color="green">${status}</font></h4>
    <!-- Heading for the list of customers -->
    <h3>List of Customers</h3>
    <hr>
    <!-- Table to display the list of customers -->
    <table border="1">
        <tr>
            <!-- Table headers -->
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Street</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
            <th>Email</th>
            <th>Phone</th>
        </tr>
        <!-- Iterate over the list of customers and display each customer's details in a row -->
        <c:forEach var="c" items="${customers}">
            <tr>
                <td>${c.id}</td>
                <td>${c.first_name}</td>
                <td>${c.last_name}</td>
                <td>${c.street}</td>
                <td>${c.address}</td>
                <td>${c.city}</td>
                <td>${c.state}</td>
                <td>${c.email}</td>
                <td>${c.phone}</td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
