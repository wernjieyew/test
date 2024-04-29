<%-- 
    Document   : admin_login
    Created on : Apr 12, 2024, 3:31:42 PM
    Author     : Yew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <link href="/Fraction/img/fevicon.png" rel="shortcut icon"/>
        <link rel="stylesheet" type="text/css" href="/Ass/css/login.css">
    </head>
    <body>
        <div class="loginbox">
            <h1>Admin Login</h1>
            <form action="admin_login" method="POST" >
                    <%
                        String staffId = (String) request.getAttribute("staffId");
                        if (staffId == null) {
                            staffId = "";
                        }
                    %>              
                <p>
                    <label>Staff ID</label>
                    <input type="text" name="staffId" placeholder="Enter Staff ID" value="<%=staffId%>"/>
                    <span>   <% if (request.getAttribute("idError") != null) { %>
                        <%= request.getAttribute("idError") %>
                        <% } %> 
                    </span>
                </p>

                <p> <label>Staff Password</label>
                    <input type="password" name="staffPass" placeholder="Enter password"/><br><br>  
                    <span>   <% if (request.getAttribute("passError") != null) { %>
                        <%= request.getAttribute("passError") %>
                        <% } %> 
                    </span>
               
                    <span>   <% if (request.getAttribute("errorMessage") != null) { %>
                        <%= request.getAttribute("errorMessage") %>
                        <% } %> 
                    </span>
                </p>

                <input type="submit" value="Login" />
                <p style="padding-left: 95px;"><a href="login.jsp">Return Back</a> 

            </form>
        </div>   
    </body>
</html>
