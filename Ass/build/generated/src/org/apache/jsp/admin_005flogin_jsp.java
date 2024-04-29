package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Login</title>\n");
      out.write("        <link href=\"/Fraction/img/fevicon.png\" rel=\"shortcut icon\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/Ass/css/login.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"loginbox\">\n");
      out.write("            <h1>Admin Login</h1>\n");
      out.write("            <form action=\"admin_login\" method=\"POST\" >\n");
      out.write("                    ");

                        String staffId = (String) request.getAttribute("staffId");
                        if (staffId == null) {
                            staffId = "";
                        }
                    
      out.write("              \n");
      out.write("                <p>\n");
      out.write("                    <label>Staff ID</label>\n");
      out.write("                    <input type=\"text\" name=\"staffId\" placeholder=\"Enter Staff ID\" value=\"");
      out.print(staffId);
      out.write("\"/>\n");
      out.write("                    <span>   ");
 if (request.getAttribute("idError") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("idError") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                    </span>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <p> <label>Staff Password</label>\n");
      out.write("                    <input type=\"password\" name=\"staffPass\" placeholder=\"Enter password\"/><br><br>  \n");
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
      out.write("               \n");
      out.write("                    <span>   ");
 if (request.getAttribute("errorMessage") != null) { 
      out.write("\n");
      out.write("                        ");
      out.print( request.getAttribute("errorMessage") );
      out.write("\n");
      out.write("                        ");
 } 
      out.write(" \n");
      out.write("                    </span>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Login\" />\n");
      out.write("                <p style=\"padding-left: 95px;\"><a href=\"login.jsp\">Return Back</a> \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>   \n");
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
