<%-- 
    Document   : update_product_result
    Created on : Apr 20, 2024, 1:22:25 PM
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
    <title>Update result</title>
</head>
<body>
   <jsp:include page="/Manager/header.jsp" />
        <div class="long-container">  
            <h1>
            <%
              boolean success = (Boolean)session.getAttribute("success");
              if (success)
                  out.println("Product updated successful.");
              else
                  out.println("Error: Unable to update Product.");
            %>
            </h1>
            <p><button onclick="location.href='/Ass/Manager/manage_product.jsp'">&#129144;Continue Manage Product</button></p>
        </div>
      </body>
</html>
<% } %>