<%-- 
    Document   : add_staff_result
    Created on : Apr 13, 2024, 10:02:21 AM
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
        <title>Add Staff Result</title>
        <link rel="stylesheet" href="/Ass/css/manager_homepage.css">
    </head>
    <body>
        <jsp:include page="/Manager/header.jsp" />
        <div class="long-container">  
            <h1>
            <%
              boolean success = (Boolean)session.getAttribute("success");
              if (success)
                  out.println("Add Staff successful.");
              else
                  out.println("Error: Unable to add Staff.");
            %>
            </h1>
            <p><button onclick="location.href='/Ass/Manager/manage_staff.jsp'">&#129144;Continue Manage Staff</button></p>
        </div>
    </body>
</html>
<% } %>
