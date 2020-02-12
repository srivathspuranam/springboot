<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>No Products</title>
</head>

<body>
    <h1 style="text-align: center;">Shopping Portal.in</h1>
    <hr><br>
    <h3 style="text-align: left;">
        Products Available
        <h3 style="text-align: center; color: red;">${message}</h3><br><br>
        <span style="float:right;">
            <button onclick="window.location.href = '/logout';"> Logout</button>
        </span>
    </h3><br><br>

    <c:if test="${empty noproduct}">
        <table style="width:100%" id="product">
            <tr>
                <th>Product Id</th>
                <th>Name</th>
                <th>About</th>
                <th>Price</th>
            </tr>
            <c:forEach items="${products}" var="product" varStatus="roll">
                <tr>
                    <td style="text-align: center;">${product.productid}</td>
                    <td style="text-align: center;">${product.productname}</td>
                    <td style="text-align: center;">${product.about}</td>
                    <td style="text-align: center;">${product.productcost}</td>

                </tr>
            </c:forEach>
        </table>
    </c:if>

    <c:if test="${empty stock}">
        <h3 style="text-align: center; color: red;">Out of stock/h3><br><br>
            <table style="width:100%" id="product">
                <tr>
                    <th>Product Id</th>
                    <th>Name</th>
                    <th>About</th>
                    <th>Price</th>
                </tr>
                <c:forEach items="${products}" var="product" varStatus="roll">
                    <tr>
                        <td style="text-align: center;">${product.productid}</td>
                        <td style="text-align: center;">${product.productname}</td>
                        <td style="text-align: center;">${product.about}</td>
                        <td style="text-align: center;">${product.productcost}</td>

                    </tr>
                </c:forEach>
            </table>
    </c:if>

    <br><br><br><br>
    <div style="text-align: center;">
        Back to cart : <input type="button" onclick="window.location.href='yourcart';" value="Cart"><br><br>
        Home : <input type="button" onclick="window.location.href='dashboard';" value="Dashboard">
    </div>

</body>

</html>