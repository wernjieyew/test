<%-- 
    Document   : edit_staff
    Created on : Apr 14, 2024, 1:30:07 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="entity.Staff"%>
<%@page import="entity.Service_Staff"%>
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
        <%
            Staff staff = (Staff) session.getAttribute("staff");
            if (staff != null) {
        %>
        <div class="container">
        <form action="/Ass/update_staff" method="post">
            <h1> Edit Staff</h1>    
            <p>
                 <label>Staff ID </label>
                <input type="text" name="staffId" value="<%=staff.getStaffId()%>"size="30" readonly>            
            </p>  
              <%
                        String staffName = (String) request.getAttribute("staffName");
                        if (staffName == null) {
                            staffName = "";
                        }
                 %>
             <p>
                     <label>Name </label>
                    <input type="text" name="staffName" value="<%=staff.getStaffName()%>"size="30" >
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
                <input type="radio" name="position" value="Manager" <% if (staff.getStaffPosition().equals("Manager")) { %> checked <% } %>>Manager
                <input type="radio" name="position" value="Staff" <% if (staff.getStaffPosition().equals("Staff")) { %> checked <% } %>>Staff<br>
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
                    <input type="password" name="staffPass" value="<%=staff.getStaffPass()%>"size="30" >
                     <span> <% if (request.getAttribute("passError") != null) { %>
                        <%= request.getAttribute("passError") %>
                        <% } %> 
                     </span>
              </p>  
            
            <input type="submit" value="Update Staff">
         
               <%} else {%>
       Staff ${staff.staffId} not found
        
        <%}%>
        </form> 
             <a href="/Ass/Manager/view_staff.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>
