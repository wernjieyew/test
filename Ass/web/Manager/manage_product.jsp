<%-- 
    Document   : manage_product
    Created on : Apr 18, 2024, 12:56:48 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        <div class="buttoncontainer"> 
            <p><button onclick="location.href='add_product.jsp'">Add New Product</button></p><br><br>
            <p><button onclick="location.href='/Ass/view_product'">Manage Product</button></p><br><br>
        </div>
    </body>
</html>
<% } %>