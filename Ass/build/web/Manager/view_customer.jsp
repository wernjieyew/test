<%-- 
    Document   : view_customer
    Created on : Apr 24, 2024, 6:29:33 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="java.util.List"%>
<%@page import="entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>manage staff</title>
</head>
<body>
<jsp:include page="/Manager/header.jsp" />
        <%
          List<Customer> customerList = (List)session.getAttribute("customerList");
        %>
        <br> <br> <br>
  <h1 style="color:black;padding-left: 70px;">Customer Information </h1>
        <table class="qgg-table">
            <tr>
                <th>Username</th>                   
                <th>Email</th>
                <th>Phone</th>
                 <th>Address</th>
                <th colspan="2">Action</th>

            </tr>
            <% for (Customer customer: customerList){ %>
                <tr>
                    <td><%= customer.getUsername() %></td>
                    <td><%= customer.getCustEmail() %> </td>
                    <td><%= customer.getCustPhone() %> </td>
                    <td><%= customer.getCustAddress() %> </td>
                    <td align="center">
                        <a href="/Ass/edit_customer?username=<%= customer.getUsername() %>" class="edit-btn" style="background-color:#0cdf33;font-size:1em;text-decoration:none;"><span class="edit-value">&#128393;Edit</span></a>
                            </td>
                            <td align="center">
                            <a href = "/Ass/delete_customer_info?username=<%= customer.getUsername() %>"class="delete-btn"style="background-color:#f50b0b;font-size:1em;text-decoration:none;"><span class="delete-value"><i class="fa fa-trash-o"></i>Delete</span></a >
                            </td>
                </tr>
            <% } %>
        </table>
    </body>
</html>
<% } %>