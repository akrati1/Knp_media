package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Blob;
import java.util.List;
import java.sql.ResultSet;
import java.io.DataInputStream;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.io.*;

public final class welcome_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("  .tb3{\n");
      out.write("   border: 1px solid gray;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  height: 100px;\n");
      out.write("  width: 1220px;\n");
      out.write("    }  \n");
      out.write("    .col2{\n");
      out.write("  border:.5px solid graytext;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  text-align: left;\n");
      out.write("  height: 20px;\n");
      out.write("  width: 85px;\n");
      out.write("  text-align:center;\n");
      out.write("  font-size:11px;\n");
      out.write("           }\n");
      out.write("        .m1{\n");
      out.write("             margin-top:-25px;\n");
      out.write("             }\n");
      out.write("             .edit{\n");
      out.write("                 overflow: hidden;\n");
      out.write("                /*border: 1px solid gray;*/\n");
      out.write("                 height: 50px;\n");
      out.write("                 width: 220px;\n");
      out.write("                 margin-top:-175px;\n");
      out.write("                 margin-left: 620px;\n");
      out.write("                 position: fixed;\n");
      out.write("             }\n");
      out.write("</style>\n");
      out.write("<form method=\"post\"  action=\"Action.jsp\">\n");
      out.write("   ");

        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        String p7 = "";
        Blob p8;
        String p9 = ""; 
        String p10 = "";
        String p11 = ""; 
    
      out.write("\n");
      out.write("    ");

   try 
   { 
  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shn", "root", "123");
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery("select uid,pform,city,media,size,location,facing,image from merg");
   
      out.write(" \n");
      out.write("   <div class=\"m1\">\n");
      out.write("<table class=\"tb3\" id=\"table3\">\n");
      out.write("      <thead style=\"background:#f9f7f7\">\n");
      out.write("          <tr>\n");
      out.write("      <th class=\"col2\"><input type=\"checkbox\" name=\"check\"></th>\n");
      out.write("      <th class=\"col2\" >Media_ID</th>\n");
      out.write("      <th class=\"col2\">Purchase Form</th>\n");
      out.write("      <th class=\"col2\">Media</th>\n");
      out.write("      <th class=\"col2\">Size</th>\n");
      out.write("      <th class=\"col2\">Location</th>\n");
      out.write("      <th class=\"col2\">Facing </th>\n");
      out.write("      <th class=\"col2\">city</th>\n");
      out.write("      <th class=\"col2\">Agency</th>\n");
      out.write("      <th class=\"col2\">D2</th>\n");
      out.write("      <th class=\"col2\">U Agency</th>\n");
      out.write("      <th class=\"col2\">Image</th>\n");
      out.write("      </tr>\n");
      out.write("      </thead>\n");
      out.write("      ");
   
          Blob image = null;
         while(rs.next()){
             p1 = rs.getString("uid");
             p2 = rs.getString("pform");
             p3 = rs.getString("city");
             p4 = rs.getString("media");
             p5 = rs.getString("size");
             p6 = rs.getString("location");
             p7 = rs.getString("facing");
            // p8=rs.getBlob("image");
             
          
      out.write("\n");
      out.write("          <tr name=\"rw1\" id=\"row1\">\n");
      out.write("              <td class=\"col2\"><input type='checkbox' name='chbx' value=\"");
 out.println(p1);
      out.write("\"/></td>\n");
      out.write("          <td class=\"col2\">");
 out.println(p1);
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println(p2);
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println(p3);
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println(p4);
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println(p5);
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println(p6);
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println(p7);
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println();
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println();
      out.write("</td>\n");
      out.write("          <td class=\"col2\">");
out.println();
      out.write("</td>\n");
      out.write("          <td class=\"col2\"><img src=\"image2.jsp?imgid=");
      out.print(rs.getInt(1));
      out.write("\" width=\"50\" height=\"50\"></td>\n");
      out.write("          \n");
      out.write("          </tr>\n");
      out.write("          ");

                 }
              rs.close();
            st.close();
           con.close();
        } 
    catch (Exception e) {
    System.out.println(e);
       }
    
      out.write("\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("    <div class=\"edit\">\n");
      out.write("    <table>\n");
      out.write("     <tr>\n");
      out.write("         <td class=\"col1\">Edit Your Record</td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("      <td><input type=\"number\" name=\"id\" placeholder=\"Enter Media_ID\"></td>\n");
      out.write("      <td><input type=\"submit\" name=\"sbt\" style=\"color:green; font-size: 13px;\"value=\"EDIT\"></td>\n");
      out.write("             </tr>\n");
      out.write("    </table>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("</form>");
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
