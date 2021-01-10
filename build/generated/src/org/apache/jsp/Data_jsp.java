package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Data_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width= device-width, initial-scale=1.0 \" >\n");
      out.write("        <title>Data</title>\n");
      out.write(" <link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write(" <style>\n");
      out.write("     .head{\n");
      out.write("              /*border: 1px solid black;*/\n");
      out.write("               height: 70px;\n");
      out.write("                width: 1220px;\n");
      out.write("                 margin-left: 3px;\n");
      out.write("                 background-image: url(\"backpic.jpg\");   \n");
      out.write("                \n");
      out.write("       }\n");
      out.write("       \n");
      out.write("      .nav{\n");
      out.write("                    width: 995px;\n");
      out.write("                    background-color:  #9999ff;\n");
      out.write("                    margin-left: 110px;\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                .admin{\n");
      out.write("                   /*border: 1px solid black;*/\n");
      out.write("                    margin-left:880px;\n");
      out.write("                    margin-top:20px;\n");
      out.write("                    height: 40px;\n");
      out.write("                    width: 90px;\n");
      out.write("                    color: white;\n");
      out.write("                    font-size: 13px;  float: left;\n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("                .logout{\n");
      out.write("                   /*border: 1px solid black;*/\n");
      out.write("                     background: bottom;\n");
      out.write("                     height:20px;\n");
      out.write("                     width: 60px;\n");
      out.write("                     padding:.5%; \n");
      out.write("                     margin-top:5px;\n");
      out.write("                     margin-left:15px;\n");
      out.write("                     text-align: center;\n");
      out.write("                     float: left;                   \n");
      out.write("                     font-size: 13.5px;\n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("     .hed1{\n");
      out.write("                   border: 1px solid black;\n");
      out.write("                    height: 25px;\n");
      out.write("                    width:970px;\n");
      out.write("                    background: #cccccc;\n");
      out.write("                   margin-top: -25px;\n");
      out.write("                }\n");
      out.write("                 .col2{\n");
      out.write("            /*border: 1px solid black;*/\n");
      out.write("    text-align: left;\n");
      out.write("  \n");
      out.write("                    height: 20px;\n");
      out.write("                    width: 70px;\n");
      out.write("                    text-align: center;\n");
      out.write("                    background:#cccccc;  \n");
      out.write("                    font-size: 11px;\n");
      out.write("                }\n");
      out.write("                .hed{\n");
      out.write("                  /*border: 1px solid black;*/\n");
      out.write("                    height: 50px;\n");
      out.write("                    width:1200px;\n");
      out.write("                    margin-top: -100px;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"head\">  \n");
      out.write("            <div class=\"txthead\">   \n");
      out.write("                KNP MEDIA \n");
      out.write("            </div>\n");
      out.write("             ");

            String str=(String)session.getAttribute("myuser");
        
      out.write("\n");
      out.write("            <div class=\"admin\" > Welcome ");
      out.print( str );
      out.write(" \n");
      out.write("            <div class=\"logout\"><a style=\"text-decoration:none; color:white\" href=\"login.jsp\">LOGOUT</a></div>\n");
      out.write("            </div>\n");
      out.write("   </div>\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"Mediakanpur.jsp\">Media Kanpur</a>  \n");
      out.write("                </td> \n");
      out.write("                    \n");
      out.write("                  <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"Mediapurchase.jsp\">Media purchase</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=Data.jsp>Data</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=AddNewMedia.jsp>Add New Media Site</a>\n");
      out.write("               </td> \n");
      out.write("               <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"BookingPannel.jsp\">Booking Panel</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"UploadPhoto.jsp\">Upload Photo</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"AdminHome.jsp\">Admin Home</a>\n");
      out.write("                </td> \n");
      out.write("                <td class=\"col\"> <a style=\"text-decoration: none ;color: black;\" href=\"ChangePassword.jsp\">Change Password</a>\n");
      out.write("                </td> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("            <div class=\"mid\">\n");
      out.write("                <table class=\"tb1\" align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col1\">Purchase From</td>\n");
      out.write("                 \n");
      out.write("                     <tr>                   \n");
      out.write("                    <td class=\"col1\"> \n");
      out.write("                        <select>\n");
      out.write("                            <option value=\"select1\" style=\" font-size: 11px;\">Select</option>\n");
      out.write("                           <option value=\"vnu\" style=\" font-size: 11px;\">Vishnu</option>\n");
      out.write("                              <option value=\"je\" style=\" font-size: 11px;\">Jagran Engage</option>\n");
      out.write("                             <option value=\"spa\" style=\" font-size: 11px;\">Spa</option>\n");
      out.write("                                <option value=\"io\" style=\" font-size: 11px;\">India Outdoor</option>\n");
      out.write("                              <option value=\"dn\" style=\" font-size: 11px;\">Day Night</option>\n");
      out.write("                                <option value=\"bp\" style=\" font-size: 11px;\">Bhanu Pratap</option>\n");
      out.write("                               <option value=\"pa\" style=\" font-size: 11px;\">Parul Advertising</option>\n");
      out.write("                              <option value=\"ia\" style=\" font-size: 11px;\">Indian Art</option>\n");
      out.write("                              <option value=\"sa\" style=\" font-size: 11px;\">Sachiv Advt</option>\n");
      out.write("                             <option value=\"radhey\" style=\" font-size: 11px;\">Radhey</option>\n");
      out.write("                              <option value=\"sel\" style=\" font-size: 11px;\">Selvel</option>\n");
      out.write("                             <option value=\"orntl\" style=\" font-size: 11px;\">Oriental</option>\n");
      out.write("                             <option value=\"os\" style=\" font-size: 11px;\">Om Sai</option>\n");
      out.write("                           <option value=\"shubh\" style=\" font-size: 11px;\">Shubhendu</option>\n");
      out.write("                            <option value=\"la\" style=\" font-size: 11px;\">Lata Advt</option>\n");
      out.write("                           <option value=\"jagran\" style=\" font-size: 11px;\">Jagran</option>\n");
      out.write("                           <option value=\"kb\" style=\" font-size: 11px;\">Kafeel Bhaiya</option>\n");
      out.write("                           <option value=\"ina\" style=\" font-size: 11px;\">Indu Art</option>\n");
      out.write("                         <option value=\"dd\" style=\" font-size: 11px;\"> Display Door</option>\n");
      out.write("                          <option value=\"sv\" style=\" font-size: 11px;\">Sandeep Vinayak</option>\n");
      out.write("                          <option value=\"sa\" style=\" font-size: 11px;\">Shakti Ad</option>\n");
      out.write("                        <option value=\"bg\" style=\" font-size: 11px;\">B Global</option>\n");
      out.write("                        <option value=\"rm\" style=\" font-size: 11px;\"> Rave Moti</option>\n");
      out.write("                        <option value=\"kanta\" style=\" font-size: 11px;\">Kanta</option>\n");
      out.write("                          <option value=\"midas\" style=\" font-size: 11px;\">Midas</option>\n");
      out.write("                        <option value=\"shv\" style=\" font-size: 11px;\">Shree Vinayak</option>\n");
      out.write("                          <option value=\"guddu\" style=\" font-size: 11px;\">Guddu</option>\n");
      out.write("                      <option value=\"mm\" style=\" font-size: 11px;\">Magic Media</option>\n");
      out.write("                       <option value=\"invictus\" style=\" font-size: 11px;\">Invictus</option>\n");
      out.write("                       <option value=\"shn\" style=\" font-size: 11px;\">SHN Advertising</option>\n");
      out.write("                        <option value=\"arya\" style=\" font-size: 11px;\">Arya</option>\n");
      out.write("                     <option value=\"kesar\" style=\" font-size: 11px;\">Kesarwani</option>\n");
      out.write("                    <option value=\"pp\" style=\" font-size: 11px;\">Partners Publicity</option>\n");
      out.write("                     <option value=\"sk\" style=\" font-size: 11px;\">S K Media</option>\n");
      out.write("                        <option value=\"suo\" style=\" font-size: 11px;\">Surya Outdoor</option>\n");
      out.write("                     <option value=\"chandra\" style=\" font-size: 11px;\">Chandra</option>\n");
      out.write("                    <option value=\"Aditi\" style=\" font-size: 11px;\">Aditi</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>                  \n");
      out.write("                    <td><input type=\"button\" name=\"button2\" value=\"Search\" style=\"font-size:13px; color: green;\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>                            \n");
      out.write("        </table>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"hed\">\n");
      out.write("         <h3 style=\"color: teal;\">Purchase Media Sheet </h3>\n");
      out.write("     </div>\n");
      out.write("           \n");
      out.write("              ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "welcome_details.jsp", out, false);
      out.write(" \n");
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
