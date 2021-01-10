package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UploadPhoto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>Upload Photo</title>\n");
      out.write(" <link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write(" <style type=\"text/css\">\n");
      out.write("     .photo{\n");
      out.write("         border: 1px solid black;\n");
      out.write("         height: 110px;\n");
      out.write("         width: 110px;\n");
      out.write("         margin-top: 100px;\n");
      out.write("         margin-left: 150px;\n");
      out.write("         background-image:url(\"images.png\"); \n");
      out.write("        \n");
      out.write("     }\n");
      out.write(" </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"head\">  \n");
      out.write("            <div class=\"txthead\">   \n");
      out.write("                KNP MEDIA \n");
      out.write("            </div>\n");
      out.write("             ");

            String str=(String)session.getAttribute("myuser");
        
      out.write("\n");
      out.write("            <div class=\"admin\" > Welcome ");
      out.print( str );
      out.write(" </div>\n");
      out.write("            <div class=\"logout\"><a href=\"login.jsp\">LOGOUT<a></div>\n");
      out.write("   </div>\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=\"Welcome.jsp\">Media Kanpur</a> \n");
      out.write("                </td> \n");
      out.write("                    \n");
      out.write("                  <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=\"AddNewData.jsp\">Media purchase</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=AddNewData.jsp>Data</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\">  <a style=\"text-decoration: none ;color: white\" href=AddNewData.jsp>Add New Media Site</a>\n");
      out.write("               </td> \n");
      out.write("               <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=\"BookingPannel.jsp\">Booking Panel</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=\"UploadPhoto.jsp\">Upload Photo</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=\"AdminHome.jsp\">Admin Home</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=\"ChangePassword.jsp\">Change Password</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: white\" href=\"store.jsp\">Store</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\">  <a style=\"text-decoration: none ;color: white\" href=\"StoreBill.jsp\">Store Bill</a>\n");
      out.write("                </td> \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"photo\" ></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
