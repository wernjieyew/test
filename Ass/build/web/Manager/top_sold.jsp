<%-- 
    Document   : top_sold
    Created on : Apr 24, 2024, 8:46:42 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page import="java.util.Collections"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Top Sold</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        <%
List<Product> productList = (List)session.getAttribute("productList");

// sort the productList based on the number of product sales in descending order
Collections.sort(productList, new Comparator<Product>() {
public int compare(Product p1, Product p2) {
return Integer.compare(p2.getProdSales(), p1.getProdSales());
}
});


productList = productList.subList(0, Math.min(productList.size(), 10));
%>


<h3>.</h3>
<h1 style="color:black;padding-left: 70px;">Top 10 Sold Product</h1>
<br>
 <table class="product-table">
    <tr>
        <th>Product ID</th>
        <th>Product name</th>
        <th>Product Description</th>
        <th>Product Price</th>
        <th>Product Stock</th>
        <th>Product Sales</th>
        <th>Product Image</th>
    </tr>
    <% for (Product product: productList){ %>
        <tr>
            <td><%= product.getProdId() %></td>
            <td><%= product.getProdName() %> </td>
            <td><%= product.getProdDesc() %> </td>
            <td><%= product.getProdPrice() %> </td>
            <td><%= product.getProdStock() %> </td>
            <td><%= product.getProdSales() %> </td>
            <td><img src="<%= product.getProdImg() %>" width="200" height="200" /> </td>
        </tr>
    <% } %>
</table>
<br>
    <p><button onclick="location.href='/Ass/Manager/manager_homepage.jsp'" style="margin-left:700px;">Back</button></p><br><br>
    </body>
</html>
<% } %>