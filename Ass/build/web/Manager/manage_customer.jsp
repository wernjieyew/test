<%-- 
    Document   : manage_customer
    Created on : Apr 20, 2024, 6:40:16 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>manage staff</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
                <div class="buttoncontainer"> 
                        <p><button onclick="location.href='add_customer.jsp'">Add New Customer</button></p><br><br>
                        <p><button onclick="location.href='/Ass/view_customer'">Manage Customer</button></p><br><br>
                </div>
    </body>
</html>
<% } %>