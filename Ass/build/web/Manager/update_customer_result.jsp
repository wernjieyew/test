<%-- 
    Document   : update_customer_result
    Created on : Apr 24, 2024, 6:53:02 PM
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
        <div class="long-container">  
            <h1>
            <%
              boolean success = (Boolean)session.getAttribute("success");
              if (success)
                  out.println("Customer updated successful.");
              else
                  out.println("Error: Unable to update Customer.");
            %>
            </h1>
            <p><button onclick="location.href='/Ass/Manager/manage_customer.jsp'">&#129144;Continue Manage Customer</button></p>
        </div>
      </body>
</html>
<% } %>