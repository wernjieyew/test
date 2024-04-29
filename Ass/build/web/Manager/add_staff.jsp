<%-- 
    Document   : add_staff
    Created on : Apr 12, 2024, 7:01:01 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
        <div class="container"> 
            <h1>Add Staff</h1>
        <form  method="post" action="/Ass/add_staff"> 
                 <%
                        String staffId = (String) request.getAttribute("staffId");
                        if (staffId == null) {
                            staffId = "";
                        }
                 %>
                 <br>
             <p>
                 <label>Staff ID</label>
                 <input type="text" name="staffId" size="30" value="<%=staffId%>">
                 <span> <% if (request.getAttribute("staffIdError") != null) { %>
                        <%= request.getAttribute("staffIdError") %>
                        <% } %> 
                 </span>
             </p>
                 <%
                        String staffName = (String) request.getAttribute("staffName");
                        if (staffName == null) {
                            staffName = "";
                        }
                 %>
             <p>
                  <label>Name</label>
                  <input type="text" name="staffName" size="30" value="<%=staffName%>">
                  <span> <% if (request.getAttribute("staffNameError") != null) { %>
                        <%= request.getAttribute("staffNameError") %>
                        <% } %> 
                  </span>
             </p>
                 <%
                        String position = (String) request.getAttribute("position");
                        if (position == null) {
                            position = "";
                        }
                 %>
             <p>
                 <label>Position</label><br><br>
                <input type="radio" name="position" value="Manager" <% if (position.equals("Manager")) { %> checked <% } %>>Manager
                <input type="radio" name="position" value="Staff" <% if (position.equals("Staff")) { %> checked <% } %>>Staff<br>
                  <span> <% if (request.getAttribute("positionError") != null) { %>
                        <%= request.getAttribute("positionError") %>
                        <% } %> 
                  </span>
             </p>
                  <%
                        String staffPass = (String) request.getAttribute("staffPass");
                        if (staffPass == null) {
                            staffPass = "";
                        }
                 %>
             <p>
                  <label>Password</label>
                  <input type="password" name="staffPass" size="30" value="<%=staffPass%>">
                   <span> <% if (request.getAttribute("passError") != null) { %>
                        <%= request.getAttribute("passError") %>
                        <% } %> 
                     </span>
             </p>

            <div style="text-align: center;">
                 <br> <br> 
                <p><input type="submit" name="Submit" value="Submit">
                   <input type="reset" value="Reset" style="margin-bottom: 10px;">
                </p>
                     
           </div> 
       </form>
             <a href="/Ass/Manager/manage_staff.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>

