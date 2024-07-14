<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Customers Details</h1>
    <!-- Form to submit customer details for editing -->
    <form action="req2" method="post">
        <table>
            <tr>
                <!-- Input for customer ID, readonly to prevent modification -->
                <td align="right">Id:</td>
                <td><input type="text" name="id" value="${customer.id}" readonly="readonly"></td>
            </tr>
            <tr>
                <!-- Input for customer's first name -->
                <td align="right">First Name:</td>
                <td><input type="text" name="first_name" value="${customer.first_name}"></td>
            </tr>
            <tr>
                <!-- Input for customer's last name -->
                <td align="right">Last Name:</td>
                <td><input type="text" name="last_name" value="${customer.last_name}"></td>
            </tr>
            <tr>
                <!-- Input for customer's street -->
                <td align="right">Street:</td>
                <td><input type="text" name="street" value="${customer.street}"></td>
            </tr>
            <tr>
                <!-- Input for customer's address -->
                <td align="right">Address:</td>
                <td><input type="text" name="address" value="${customer.address}"></td>
            </tr>
            <tr>
                <!-- Input for customer's city -->
                <td align="right">City:</td>
                <td><input type="text" name="city" value="${customer.city}"></td>
            </tr>
            <tr>
                <!-- Input for customer's state -->
                <td align="right">State:</td>
                <td><input type="text" name="state" value="${customer.state}"></td>
            </tr>
            <tr>
                <!-- Input for customer's email -->
                <td align="right">Email:</td>
                <td><input type="email" name="email" value="${customer.email}"></td>
            </tr>
            <tr>
                <!-- Input for customer's phone number -->
                <td align="right">Phone:</td>
                <td><input type="number" name="phone" value="${customer.phone}"></td>
            </tr>
            <tr>
                <!-- Back link and Edit button -->
                <td align="center" colspan="2">
                    <a href="AddCustomer">Back</a>&nbsp<input type="submit" name="b1" value="Edit">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
