<%-- 
    Document   : view_product
    Created on : Apr 26, 2024, 8:02:59 AM
    Author     : Yew
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/staff_homepage.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Product</title>
    </head>
    <body>
        <jsp:include page="/Staff/header.jsp" />
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
                        <a href="/Ass/staff_edit_product?prodId=<%= product.getProdId() %>" class="edit-btn" style="background-color:#0cdf33;font-size:1em;text-decoration:none;"><span class="edit-value">&#128393;Edit</span></a>
                            </td>
                       
                            
                </tr>
            <% } %>
        </table>
    </body>
</html>
