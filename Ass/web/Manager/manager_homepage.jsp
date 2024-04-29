<%-- 
    Document   : manager_homepage
    Created on : Apr 12, 2024, 4:09:08 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manager Homepage</title>
</head>

<body>
<jsp:include page="/Manager/header.jsp" />
<div class="buttoncontainer"> 
                        <p><button onclick="location.href='/Ass/top_sold'">Top 10 Sold Products</button></p><br><br>
                </div>
 </body>
    </html>
    <% } %>

