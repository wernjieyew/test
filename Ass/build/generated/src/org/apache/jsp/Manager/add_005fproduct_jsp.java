package org.apache.jsp.Manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
 String id = (String) session.getAttribute("id"); 
    if (id == null) {
        response.sendRedirect("/Ass/admin_login.jsp");
    }else{

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Product</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Manager/header.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"product-container\"> \n");
      out.write("            <h1>Add Product</h1>\n");
      out.write("        <form method=\"post\" action=\"/Ass/add_product\"> \n");
      out.write("                 ");

                        String prodId = (String) request.getAttribute("prodId");
                        if (prodId == null) {
                            prodId = "";
                        }
                 
      out.write("\n");
      out.write("                 <br>\n");
      out.write("             <p>\n");
      out.write("                 <label>Product ID</label>\n");
      out.write("                 <input type=\"text\" name=\"prodId\" size=\"30\" value=\"");
      out.print(prodId);
      out.write("\">\n");
      out.write("                 <span> ");
 if (request.getAttribute("prodIdError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("prodIdError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                 </span>\n");
      out.write("             </p>\n");
      out.write("                 ");

                        String prodName = (String) request.getAttribute("prodName");
                        if (prodName == null) {
                            prodName = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Product Name</label>\n");
      out.write("                  <input type=\"text\" name=\"prodName\" size=\"30\" value=\"");
      out.print(prodName);
      out.write("\">\n");
      out.write("                  <span> ");
 if (request.getAttribute("prodNameError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("prodNameError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                  </span>\n");
      out.write("             </p>\n");
      out.write("                 ");

                        String prodDesc = (String) request.getAttribute("prodDesc");
                        if (prodDesc == null) {
                            prodDesc = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Product Description</label>\n");
      out.write("                  <input type=\"text\" name=\"prodDesc\" size=\"30\" value=\"");
      out.print(prodDesc);
      out.write("\">\n");
      out.write("                  <span> ");
 if (request.getAttribute("prodDescError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("prodDescError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                  </span>\n");
      out.write("             </p>\n");
      out.write("                  ");

                        String prodPrice = (String) request.getAttribute("prodPrice");
                        if (prodPrice == null) {
                            prodPrice = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Product Price</label>\n");
      out.write("                  <input type=\"text\" name=\"prodPrice\" size=\"30\" value=\"");
      out.print(prodPrice);
      out.write("\">\n");
      out.write("                   <span> ");
 if (request.getAttribute("prodPriceError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("prodPriceError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                     </span>\n");
      out.write("             </p>\n");
      out.write("                   ");

                        String prodStock = (String) request.getAttribute("prodStock");
                        if (prodStock == null) {
                            prodStock = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Product Stock</label>\n");
      out.write("                  <input type=\"text\" name=\"prodStock\" size=\"30\" value=\"");
      out.print(prodStock);
      out.write("\">\n");
      out.write("                   <span> ");
 if (request.getAttribute("prodStockError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("prodStockError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                     </span>\n");
      out.write("             </p>\n");
      out.write("                               ");

                        String prodSales = (String) request.getAttribute("prodSales");
                        if (prodSales == null) {
                            prodSales = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Product Sales</label>\n");
      out.write("                  <input type=\"text\" name=\"prodSales\" size=\"30\" value=\"");
      out.print(prodSales);
      out.write("\">\n");
      out.write("                   <span> ");
 if (request.getAttribute("prodSalesError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("prodSalesError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                     </span>\n");
      out.write("             </p>\n");
      out.write("                                            ");

                        String prodImg = (String) request.getAttribute("prodImg");
                        if (prodImg == null) {
                            prodImg = "";
                        }
                 
      out.write("\n");
      out.write("             <p>\n");
      out.write("                  <label>Product Image</label>\n");
      out.write("                  <input type=\"text\" name=\"prodImg\" size=\"30\" value=\"");
      out.print(prodImg);
      out.write("\">\n");
      out.write("                   <span> ");
 if (request.getAttribute("prodImgError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("prodImgError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                     </span>\n");
      out.write("             </p>\n");
      out.write("\n");
      out.write("            <div style=\"text-align: center;\">\n");
      out.write("                 <br> <br> \n");
      out.write("                <p><input type=\"submit\" name=\"Submit\" value=\"Submit\">\n");
      out.write("                   <input type=\"reset\" value=\"Reset\" style=\"margin-bottom: 10px;\">\n");
      out.write("                </p>\n");
      out.write("                     \n");
      out.write("           </div> \n");
      out.write("       </form>\n");
      out.write("             <a href=\"/Ass/Manager/manage_product.jsp\">Return Back</a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } 
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
