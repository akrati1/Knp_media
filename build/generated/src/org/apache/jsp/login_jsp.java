package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("             <meta charset=\"UTF-8\">\n");
      out.write("               \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            .layout{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 300px;\n");
      out.write("                /*border: 1px solid black;*/\n");
      out.write("            }\n");
      out.write("            .tbl{\n");
      out.write("                width: 100%;\n");
      out.write("                height:100%;\n");
      out.write("             /*  border: 1px solid black;*/\n");
      out.write("               background-color:snow;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                            }\n");
      out.write("            .td1{\n");
      out.write("                font-family: verdana;\n");
      out.write("                font-size: 12px;\n");
      out.write("                 margin-left:5%;\n");
      out.write("                 margin-top:30%;\n");
      out.write("                height:50px;\n");
      out.write("                padding:10px;\n");
      out.write("                width: 100px;\n");
      out.write("              /*border: 1px solid black;*/\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .txt{\n");
      out.write("               /*border: 1px solid black;*/\n");
      out.write("                width: 320px;\n");
      out.write("                height: 30px;\n");
      out.write("                padding-left:20px;\n");
      out.write("            }\n");
      out.write("            .sbt{\n");
      out.write("                width: 80px;\n");
      out.write("                height: 30px;\n");
      out.write("                background-color: dimgray;  \n");
      out.write("                margin-left:70px;\n");
      out.write("                color:black;\n");
      out.write("               /*border: 1px solid black;*/\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("          <script>\n");
      out.write("            function resize(){\n");
      out.write("                //alert(\"you are in resize\");\n");
      out.write("                w=window.innerWidth;\n");
      out.write("                h=window.innerHeight;\n");
      out.write("                l=(w-400)/2;\n");
      out.write("               t=(h-180)/2;\n");
      out.write("            d=document.getElementById(\"mid\");\n");
      out.write("            d.style.marginLeft=l;\n");
      out.write("            d.style.marginTop=t;\n");
      out.write("            }\n");
      out.write("            function validate(){\n");
      out.write("           var a=document.forms[\"frm\"][\"uname\"].value.trim();\n");
      out.write("           var b=document.forms[\"frm\"][\"pass\"].value.trim();\n");
      out.write("                 \n");
      out.write("   \n");
      out.write("\n");
      out.write("                             if(a===\"\" && b===\"\")\n");
      out.write("                            {\n");
      out.write("                                alert(\"All Fields must be filled out\");\n");
      out.write("                                return false;\n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("                            else if(a===\"\")\n");
      out.write("                            {\n");
      out.write("                                // document.getElementById(\"uname\").setCustomValidity(\"please enter suitable username\");\n");
      out.write("                            \n");
      out.write("                               alert(\"User ID must be filled out\");\n");
      out.write("                                  return false;\n");
      out.write("                            }\n");
      out.write("                             else if (!a.match(/^[a-zA-Z]+$/)) \n");
      out.write("                              {\n");
      out.write("                               alert('Only alphabets are allowed');\n");
      out.write("                                 return false;\n");
      out.write("                               }\n");
      out.write("                              else if(b===\"\")\n");
      out.write("                             {\n");
      out.write("                              \n");
      out.write("                                //document.getElementById(\"pass\").setCustomValidity(\"please enter suitable password\");\n");
      out.write("                                alert(\"Password must be filled out\");\n");
      out.write("                               return false;\n");
      out.write("                            }\n");
      out.write("                            return true;\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("      }\n");
      out.write("              \n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"resize()\" onresize=\"resize()\">\n");
      out.write("            <div class=\"layout\" id=\"mid\">\n");
      out.write("            <form onsubmit=\"return validate(this)\"  name=\"frm\" method=\"post\" >\n");
      out.write("                 <table class=\"tbl\">\n");
      out.write("                     <tr>\n");
      out.write("                         <td colspan=\"2\" class=\"td1\" style=\"margin-top:60px;color:brown; font-size:30px ;text-align: center;\" > LOGIN </td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    <tr style=\"margin-top: 40px; \">\n");
      out.write("                        <td class=\"td1\" style=\"color:brown; \">User Name</td>\n");
      out.write("                        <td ><input type=\"text\" name=\"uname\" id=\"uname\" size=\"30\" class=\"txt\" placeholder=\"User Name\" style=\"padding-left:5px \"  ></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"td1\" style=\"color:brown\">Password</td>\n");
      out.write("                        <td><input type=\"password\"  id=\"pass\" name=\"pass\" size=\"30\" class=\"txt\" placeholder=\"Enter your password\" style=\"padding-left:5px\"></td>    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" class=\"sbt\" name=\"sbt\" value=\"SUBMIT\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                  \n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("         ");

        if(request.getParameter("uname")!= null){
            
            
                     String s1=request.getParameter("uname");
                     String s2=request.getParameter("pass");
               
               
                   try {
                          Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shn","root","123");
        Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("select * from login where admin = '" + s1 + "' and password='"+s2 +"' "); 
       if(rs.next()){
            String name=rs.getString(1)+" "+rs.getString(2);
            HttpSession ses=request.getSession();
            ses.setAttribute("user", s1);
          // ses.setAttribute("upass", s2);
            response.sendRedirect("Welcome.jsp");
        }else{
            response.sendRedirect("loginerr.jsp");
        }
        st.close();
        con.close();
             } catch (Exception e) {
                            System.out.println("exception"+e);
                           }
            }
         
                   
        
        
      out.write("\n");
      out.write("            \n");
      out.write("           \n");
      out.write("       </body>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("</html>\n");
      out.write("\n");
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
