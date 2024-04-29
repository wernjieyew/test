<%-- 
    Document   : edit_profile
    Created on : Apr 26, 2024, 6:57:30 PM
    Author     : Yew
--%>

<%@page import="entity.Staff"%>
<%@page import="entity.Service_Staff"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/Ass/css/staff_homepage.css">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>edit profile</title>
    </head>
    <body>
        <jsp:include page="/Staff/header.jsp" />
        <%
            Staff staff = (Staff) session.getAttribute("staff");
            if (staff != null) {
        %>
        <div class="container">
        <form action="/Ass/staff_update_profile" method="post">
            <h1> Edit Profile</h1>    
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
                     <label>Position </label>
                    <input type="text" name="position" value="<%=staff.getStaffPosition()%>"size="30" readonly>
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
            
            <input type="submit" value="Update">
         
               <%} else {%>
       Staff ${staff.staffId} not found
        
        <%}%>
        </form> 
             <a href="/Ass/Staff/staff_homepage.jsp">Return Back</a>
        </div>
    </body>
</html>

