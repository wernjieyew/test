<%-- 
    Document   : view_product
    Created on : Apr 20, 2024, 10:29:35 AM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Product</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        <%
          List<Product> productList = (List)session.getAttribute("productList");
        %>
        <br> <br> <br>
  <h1 style="color:black;padding-left: 70px;">Product Information </h1>
        <table class="product-table">
            <tr>
                <th>Product ID</th>         
                <th>Product Name</th>
                <th>Product Description</th>
                <th>Product Price</th>
                <th>Product Stock</th>
                <th>Product Sales</th>
                <th>Product Image</th>
                <th colspan="2">Action</th>

            </tr>
            <% for (Product product: productList){ %>
                <tr>
                    <td><%= product.getProdId() %></td>
                    <td style="width:150px;"><%= product.getProdName() %> </td>
                    <td style="width:150px;"><%= product.getProdDesc() %> </td>
                    <td><%= product.getProdPrice() %> </td>
                    <td><%= product.getProdStock() %> </td>
                    <td><%= product.getProdSales() %> </td>
                    <td style="pa:20px;"><img src="<%= product.getProdImg() %>" width="200" height="200" /></td>
                    <td align="center">
                        <a href="/Ass/edit_product?prodId=<%= product.getProdId() %>" class="edit-btn" style="background-color:#0cdf33;font-size:1em;text-decoration:none;"><span class="edit-value">&#128393;Edit</span></a>
                            </td>
                            <td align="center">
                            <a href ="/Ass/delete_product_info?prodId=<%= product.getProdId() %>" class="delete-btn"style="background-color:#f50b0b;font-size:1em;text-decoration:none;"><span class="delete-value"><i class="fa fa-trash-o"></i>Delete</span></a >
                            </td>
                </tr>
            <% } %>
        </table>
    </body>
</html>
<% } %>
