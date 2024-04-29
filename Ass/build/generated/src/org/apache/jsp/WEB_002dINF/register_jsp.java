package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/register.css\">\n");
      out.write("        <link href=\"img/fevicon.png\" rel=\"shortcut icon\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"loginbox\">\n");
      out.write("            <img src=\"img/try1.gif\" class=\"avatar\">\n");
      out.write("            <h1>Signup</h1>\n");
      out.write("            <form method=\"post\" action=\"signup\">\n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                    <label>Username</label>\n");
      out.write("                    <input type=\"text\" name=\"username\"placeholder=\"ALI2023\" required/>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p> <label>Email</label>\n");
      out.write("                    <input type=\"email\" name=\"cust_email\"placeholder=\"abc@gmail.com\" required/>\n");
      out.write("                    <label>Password</label>\n");
      out.write("                    <input type=\"password\" name=\"passwd\" required/>\n");
      out.write("                    <label>Confirm Password</label>\n");
      out.write("                    <input type=\"password\" name=\"cust_passwd\" required/>\n");
      out.write("                    <label>Tel.No</label>\n");
      out.write("                    <input type=\"text\" name=\"cust_tel\" placeholder=\"012-3456789\" />\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p><label>Address</label>\n");
      out.write("                    <textarea name=\"cust_address\" rows=\"6\" cols=\"40\" >   \n");
      out.write("                    </textarea>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p><input type=\"submit\" value=\"Signup\" />\n");
      out.write("                    <input type=\"reset\" value=\"Reset\" />\n");
      out.write("                    <a href=\"login.jsp\" style=\"padding-left: 200px;\">Return Back</a>\n");
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
