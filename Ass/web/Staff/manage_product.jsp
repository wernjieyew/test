<%-- 
    Document   : manage_product
    Created on : Apr 26, 2024, 7:50:10 AM
    Author     : Yew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:include page="/Staff/header.jsp" />
        <div class="buttoncontainer"> 
            <p><button onclick="location.href='add_product.jsp'">Add New Product</button></p><br><br>
            <p><button onclick="location.href='/Ass/staff_view_product'">Manage Product</button></p><br><br>
        </div>
    </body>
</html>
