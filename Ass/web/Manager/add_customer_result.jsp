<%-- 
    Document   : add_customer_result
    Created on : Apr 24, 2024, 6:24:39 PM
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
                  out.println("Add Customer successful.");
              else
                  out.println("Error: Unable to add Customer.");
            %>
            </h1>
            <p><button onclick="location.href='/Ass/Manager/manage_customer.jsp'">&#129144;Continue Manage Customer</button></p>
        </div>
    </body>
</html>
<% } %>