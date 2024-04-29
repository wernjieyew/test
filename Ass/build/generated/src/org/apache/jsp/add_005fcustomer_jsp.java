package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign up Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Ass/css/manager_homepage.css\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Manager/header.jsp", out, false);
      out.write("\n");
      out.write("         <div class=\"loginbox\">\n");
      out.write("            <h1>Add Customer</h1>\n");
      out.write("            <form method=\"post\" action=\"add_customer\">\n");
      out.write("                 ");

                        String username = (String) request.getAttribute("username");
                        if (username == null) {
                            username = "";
                        }
                 
      out.write("\n");
      out.write("                <p>\n");
      out.write("                    <label>Username</label>\n");
      out.write("                    <input type=\"text\" name=\"username\" placeholder=\"John\" value=\"");
      out.print(username);
      out.write("\"/>\n");
      out.write("                     <span> ");
 if (request.getAttribute("usernameError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("usernameError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                     </span>\n");
      out.write("                </p>\n");
      out.write("                 ");

                        String email = (String) request.getAttribute("email");
                        if (email == null) {
                            email = "";
                        }
                 
      out.write("\n");
      out.write("                <p> \n");
      out.write("                    <label>Email</label>\n");
      out.write("                    <input type=\"text\" name=\"email\" placeholder=\"abc@gmail.com\" value=\"");
      out.print(email);
      out.write("\"/>\n");
      out.write("                    <span>   ");
 if (request.getAttribute("emailError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("emailError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                    </span>\n");
      out.write("                </p> \n");
      out.write("                 ");

                        String pass = (String) request.getAttribute("pass");
                        if (pass == null) {
                            pass = "";
                        }
                 
      out.write("\n");
      out.write("                <p> \n");
      out.write("                    <label>Password</label>\n");
      out.write("                    <input type=\"password\" name=\"pass\"  value=\"");
      out.print(pass);
      out.write("\"/>\n");
      out.write("                    <span>   ");
 if (request.getAttribute("passError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("passError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                    </span>\n");
      out.write("                </p>\n");
      out.write("                 ");

                        String phone = (String) request.getAttribute("phone");
                        if (phone == null) {
                            phone = "";
                        }
                 
      out.write("\n");
      out.write("                <p> \n");
      out.write("      \n");
      out.write("                    <label>Contact.No</label>\n");
      out.write("                    <input type=\"text\" name=\"phone\" placeholder=\"0123456789\" value=\"");
      out.print(phone);
      out.write("\" />\n");
      out.write("                    <span>   ");
 if (request.getAttribute("phoneError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("phoneError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                    </span>\n");
      out.write("                </p>\n");
      out.write("                 ");

                        String address = (String) request.getAttribute("address");
                        if (address == null) {
                            address = "";
                        }
                 
      out.write("\n");
      out.write("                <p><label>Address</label>\n");
      out.write("                    <textarea name=\"address\" rows=\"6\" cols=\"40\"> ");
      out.print(address);
      out.write("</textarea>\n");
      out.write("                    <span>  ");
 if (request.getAttribute("addressError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("addressError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                    </span>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p><input type=\"submit\" value=\"Signup\" />\n");
      out.write("                    <a href=\"login.jsp\" style=\"padding-right: 200px;\">Return Back</a>\n");
      out.write("                     <input type=\"reset\" value=\"Reset\"/>\n");
      out.write("                </p>         \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
