<%-- 
    Document   : edit_product
    Created on : Apr 20, 2024, 1:03:49 PM
    Author     : Yew
--%>
<% String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{
%>
<%@page import="entity.Product"%>
<%@page import="entity.Service_Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Product</title>
    </head>

    <body>
        <jsp:include page="/Manager/header.jsp" />
                <%
            Product product = (Product) session.getAttribute("product");
            if (product != null) {
        %>
                <div class="product-container"> 
            <h1>Edit Product</h1>
        <form  method="post" action="/Ass/update_product"> 
                 <%
                        String prodId = (String) request.getAttribute("prodId");
                        if (prodId == null) {
                            prodId = "";
                        }
                 %>
                 <br>
             <p>
                 <label>Product ID</label>
                 <input type="text" name="prodId" size="30" value="<%=product.getProdId()%>" readonly>
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
                  <input type="text" name="prodName" size="30" value="<%=product.getProdName()%>">
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
                  <input type="text" name="prodDesc" size="30" value="<%=product.getProdDesc()%>">
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
                  <input type="text" name="prodPrice" size="30" value="<%=product.getProdPrice()%>">
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
                  <input type="text" name="prodStock" size="30" value="<%=product.getProdStock()%>">
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
                  <input type="text" name="prodSales" size="30" value="<%=product.getProdSales()%>">
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
                  <label>Product Image Link</label>
                  <input type="text" name="prodImg" size="30" value="<%=product.getProdImg()%>">
                   <span> <% if (request.getAttribute("prodImgError") != null) { %>
                        <%= request.getAttribute("prodImgError") %>
                        <% } %> 
                     </span>
             </p>
             <p>
                 <label>Product Image</label><br>
                  <img src="<%=product.getProdImg()%>" width="200" height="200">
             </p>

            <div style="text-align: center;">
                 <br> <br> 
                <p><input type="submit" name="Submit" value="Update">
                </p>
                     
           </div> 
              <%} else {%>
       Product ${product.prodId} not found
        
        <%}%>
       </form>
             <a href="/Ass/Manager/view_product.jsp">Return Back</a>
        </div>
    </body>
</html>
<% } %>

