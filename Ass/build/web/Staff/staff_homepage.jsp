<%-- 
    Document   : staff_homepage
    Created on : Apr 12, 2024, 4:08:48 PM
    Author     : Yap
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/Ass/css/staff_homepage.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Staff Homepage</title>
    </head>
    <body>
        <jsp:include page="/Staff/header.jsp" />
    </body>
</html>
