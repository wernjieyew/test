<%-- 
    Document   : add_product_result
    Created on : Apr 19, 2024, 7:30:45 PM
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
        <title>Add Product Result</title>
            <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        <div class="long-container">  
            <h1>
            <%
              boolean success = (Boolean)session.getAttribute("success");
              if (success)
                  out.println("Add Product successful.");
              else
                  out.println("Error: Unable to add Product.");
            %>
            </h1>
            <p><button onclick="location.href='/Ass/Manager/manage_product.jsp'">&#129144;Continue Manage Product</button></p>
        </div>
    </body>
</html>
<% } %>
