<%-- 
    Document   : view_customer
    Created on : Apr 26, 2024, 6:38:07 PM
    Author     : Yew
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/staff_homepage.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>manage staff</title>
</head>
<body>
<jsp:include page="/Staff/header.jsp" />
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

            </tr>
            <% for (Customer customer: customerList){ %>
                <tr>
                    <td><%= customer.getUsername() %></td>
                    <td><%= customer.getCustEmail() %> </td>
                    <td><%= customer.getCustPhone() %> </td>
                    <td><%= customer.getCustAddress() %> </td>
                  
                </tr>
            <% } %>
        </table>
    </body>
</html>

