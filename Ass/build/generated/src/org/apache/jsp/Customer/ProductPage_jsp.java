package org.apache.jsp.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.Product;

public final class ProductPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Products</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/fasthover.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Glegoo:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3l_login\">\n");
      out.write("\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal88\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3l_logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"CustomerHomePage.jsp\">Kunkun's Arts<span>Specialy For Ikuns</span></a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t<a href=\"Cart.jsp\">\n");
      out.write("\t\t\t\t\t<div class=\"total\">\n");
      out.write("\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\n");
      out.write("\t\t\t\t\t<img src=\"images/bag.png\" alt=\"\" />\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"navigation\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"CustomerHomePage.jsp\" class=\"act\">Home</a></li>\t\n");
      out.write("\t\t\t\t\t\t<!-- Mega Menu -->\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ProductPage.jsp\">Product</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"AboutUs.jsp\">About Us</a></li>\n");
      out.write("                                                <li><a href=\"PurchaseHistory.jsp\">Purchase History</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- header -->\n");
      out.write("\n");
      out.write("<!-- banner -->\n");
      out.write("\t<div class=\"banner1\" id=\"home1\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>Classic world famous paintings<span>up to</span> <b style=\"color:red;\">30%</b> <i>Discount</i></h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner -->\n");
      out.write("\n");
      out.write("<!-- breadcrumbs -->\n");
      out.write("\t<div class=\"breadcrumb_dress\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"CustomerHomePage.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a> <i>/</i></li>\n");
      out.write("\t\t\t\t<li>Products</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //breadcrumbs -->\n");
      out.write("\n");
      out.write("<!-- products -->\n");
      out.write("            ");

          List<Product> productList = (List)session.getAttribute("productList");
        
      out.write("\n");
      out.write("\t<div class=\"art\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3ls_art_grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-8 w3ls_art_grid_right\">\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t<div class=\"w3ls_art_grid_right_grid3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 agileinfo_new_products_grid agileinfo_new_products_grid_art\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left art_grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper2\">\n");
      out.write("                                                                      ");
 for (Product product: productList){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print( product.getProdImg() );
      out.write("\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom w3_hs_bottom_sub1\">\n");
      out.write("                                                                            \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<h5><a href=\"abc.jsp\">");
      out.print( product.getProdName() );
      out.write("</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span></span> <i class=\"item_price\">");
      out.print( product.getProdPrice() );
      out.write("</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"art_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>New</h6>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal video-modal fade\" id=\"myModal6\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-5 modal_body_left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/p2.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-7 modal_body_right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>The Greatest Art</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Ut enim ad minim veniam, quis nostrud \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\texercitation ullamco laboris nisi ut aliquip ex ea \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcommodo consequat.Duis aute irure dolor in \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treprehenderit in voluptate velit esse cillum dolore \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\teu fugiat nulla pariatur. Excepteur sint occaecat \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcupidatat non proident, sunt in culpa qui officia \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdeserunt mollit anim id est laborum.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/star-.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/star-.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/star-.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/star.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/star.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal_body_right_cart simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p><span>$420</span> <i class=\"item_price\">$340</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //products -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- related products -->\n");
      out.write("\t<div class=\"w3l_related_products\" style=\"background-color: snow;\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>Related Products</h3>\n");
      out.write("\t\t\t<ul id=\"flexiselDemo2\">\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left art_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/kun.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"abc.jsp\">KunKun</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$312</span> <i class=\"item_price\">$212</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left art_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/kun.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"abc.jsp\">KunKun</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$312</span> <i class=\"item_price\">$212</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left art_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/kun.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"abc.jsp\">KunKun</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$312</span> <i class=\"item_price\">$212</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left art_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/kun.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"abc.jsp\">KunKun</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$312</span> <i class=\"item_price\">$212</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t$(window).load(function() {\n");
      out.write("\t\t\t\t\t\t$(\"#flexiselDemo2\").flexisel({\n");
      out.write("\t\t\t\t\t\t\tvisibleItems:4,\n");
      out.write("\t\t\t\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\t\t\t\tresponsiveBreakpoints: { \n");
      out.write("\t\t\t\t\t\t\t\tportrait: { \n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:480,\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems: 1\n");
      out.write("\t\t\t\t\t\t\t\t}, \n");
      out.write("\t\t\t\t\t\t\t\tlandscape: { \n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:640,\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems:2\n");
      out.write("\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\ttablet: { \n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:768,\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //related products -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3_footer_grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t\t<h3>Contact</h3>\n");
      out.write("\t\t\t\t\t<p>\"Questions? Feedback? Let's chat! Reach out via email or phone?we're here to help.\"</p>\n");
      out.write("\t\t\t\t\t<ul class=\"address\">\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>Bandar Baru, 31900 Kampar,<span>Perak.</span></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:perak@tarc.edu.my\">perak@tarc.edu.my</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>054660388</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t\t<h3>Profile</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"info\"> \n");
      out.write("\t\t\t\t\t\t<li><a href=\"CustomerHomePage.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Cart.jsp\">My Cart</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<h4>Follow Us</h4>\n");
      out.write("\t\t\t\t\t<div class=\"agileits_social_button\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"google\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"pinterest\"> </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer-copy\">\n");
      out.write("\t\t\t<div class=\"footer-copy1\">\n");
      out.write("\t\t\t\t<div class=\"footer-copy-pos\">\n");
      out.write("\t\t\t\t\t<a href=\"#home1\" class=\"scroll\"><img src=\"images/arrow.png\" alt=\" \" class=\"img-responsive\" /></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<p>&copy; TAR UMT All rights reserved | Design by DFT</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //footer -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
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
