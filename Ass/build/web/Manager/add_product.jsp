<%-- 
    Document   : add_product
    Created on : Apr 18, 2024, 1:42:08 PM
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
        <title>Add Product</title>
    </head>

    <body>
        <jsp:include page="/Manager/header.jsp" />
                <div class="product-container"> 
            <h1>Add Product</h1>
        <form method="post" action="/Ass/add_product"> 
                 <%
                        String prodId = (String) request.getAttribute("prodId");
                        if (prodId == null) {
                            prodId = "";
                        }
                 %>
                 <br>
             <p>
                 <label>Product ID</label>
                 <input type="text" name="prodId" size="30" value="<%=prodId%>">
                 <span> <% if (request.getAttribute("prodIdError") != null) { %>
                        <%= request.getAttribute("prodIdError") %>
                        <% } %> 
                 </span>
             </p>
                 <%
                        String prodName = (String) request.getAttribute("prodName");
                        if (prodName == null) {
                            prodName = "";
                        }
                 %>
             <p>
                  <label>Product Name</label>
                  <input type="text" name="prodName" size="30" value="<%=prodName%>">
                  <span> <% if (request.getAttribute("prodNameError") != null) { %>
                        <%= request.getAttribute("prodNameError") %>
                        <% } %> 
                  </span>
             </p>
                 <%
                        String prodDesc = (String) request.getAttribute("prodDesc");
                        if (prodDesc == null) {
                            prodDesc = "";
                        }
                 %>
             <p>
                  <label>Product Description</label>
                  <input type="text" name="prodDesc" size="30" value="<%=prodDesc%>">
                  <span> <% if (request.getAttribute("prodDescError") != null) { %>
                        <%= request.getAttribute("prodDescError") %>
                        <% } %> 
                  </span>
             </p>
                  <%
                        String prodPrice = (String) request.getAttribute("prodPrice");
                        if (prodPrice == null) {
                            prodPrice = "";
                        }
                 %>
             <p>
                  <label>Product Price</label>
                  <input type="text" name="prodPrice" size="30" value="<%=prodPrice%>">
                   <span> <% if (request.getAttribute("prodPriceError") != null) { %>
                        <%= request.getAttribute("prodPriceError") %>
                        <% } %> 
                     </span>
             </p>
                   <%
                        String prodStock = (String) request.getAttribute("prodStock");
                        if (prodStock == null) {
                            prodStock = "";
                        }
                 %>
             <p>
                  <label>Product Stock</label>
                  <input type="text" name="prodStock" size="30" value="<%=prodStock%>">
                   <span> <% if (request.getAttribute("prodStockError") != null) { %>
                        <%= request.getAttribute("prodStockError") %>
                        <% } %> 
                     </span>
             </p>
                               <%
                        String prodSales = (String) request.getAttribute("prodSales");
                        if (prodSales == null) {
                            prodSales = "";
                        }
                 %>
             <p>
                  <label>Product Sales</label>
                  <input type="text" name="prodSales" size="30" value="<%=prodSales%>">
                   <span> <% if (request.getAttribute("prodSalesError") != null) { %>
                        <%= request.getAttribute("prodSalesError") %>
                        <% } %> 
                     </span>
             </p>
                                            <%
                        String prodImg = (String) request.getAttribute("prodImg");
                        if (prodImg == null) {
                            prodImg = "";
                        }
                 %>
             <p>
                  <label>Product Image</label>
                  <input type="text" name="prodImg" size="30" value="<%=prodImg%>">
                   <span> <% if (request.getAttribute("prodImgError") != null) { %>
                        <%= request.getAttribute("prodImgError") %>
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
             <a href="/Ass/Manager/manage_product.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>
