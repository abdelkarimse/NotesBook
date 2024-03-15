package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class aaa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Dashboard</title>\n");
      out.write("    <style>\n");
      out.write("        .header {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("}\n");
      out.write(".content{\n");
      out.write("max-width:750px ;\n");
      out.write("margin:auto;\n");
      out.write("justify-content: center;\n");
      out.write("align-items: center;\n");
      out.write("padding:15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar{\n");
      out.write("background-color: #394356;\n");
      out.write("color:#ffffff;\n");
      out.write("font-family: segoe ui;\n");
      out.write("padding-left:50px;\n");
      out.write("}\n");
      out.write(".icon{height:35px;\n");
      out.write("width:35px;\n");
      out.write("margin-left:10px;\n");
      out.write("margin-right: 10px;;\n");
      out.write("}\n");
      out.write(".aaa{\n");
      out.write("     display: grid;\n");
      out.write("    grid-template-columns: repeat(2, 1fr);\n");
      out.write("    grid-gap: 30px;\n");
      out.write("}\n");
      out.write(".note-input{\n");
      out.write("    margin-top:30px;\n");
      out.write("    padding:20px;\n");
      out.write("    display:flex;\n");
      out.write("    flex-direction: row;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".input-text{\n");
      out.write("    height:100px;\n");
      out.write("    width: 500px;;\n");
      out.write("    padding:10px;  \n");
      out.write("    box-shadow: 5px 5px #394356;\n");
      out.write("    background-color: #ffffff;\n");
      out.write("    border-radius: 6px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn{\n");
      out.write("    width: 100px;\n");
      out.write("    padding: 10px auto;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    height: 50px;\n");
      out.write("    background-color: #394356;\n");
      out.write("    color:#ffffff;\n");
      out.write("    box-shadow: 5px 5px #d1d1e0;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".btn:focus{\n");
      out.write("    color:#ffffff;\n");
      out.write("}\n");
      out.write(".action{display: flex;\n");
      out.write("flex-direction: column;}\n");
      out.write(".theme{\n");
      out.write("    width:90px;\n");
      out.write("    height:35px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".all_note{\n");
      out.write("     display: grid;\n");
      out.write("    grid-template-columns: repeat(4, 1fr);\n");
      out.write("    grid-gap: 10px;\n");
      out.write("}\n");
      out.write(".notes-list {\n");
      out.write("    max-width: 1000px;\n");
      out.write("    margin: auto;\n");
      out.write("    align-items: center; \n");
      out.write("    justify-content: center; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".note {\n");
      out.write("    padding: 15px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    width: 260px;\n");
      out.write("    box-shadow: 4px 4px #f2f2f2;\n");
      out.write("    margin: 10px;\n");
      out.write("    height: 160px;\n");
      out.write("    border-top: solid 5px #4d4d4d;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".note-view {\n");
      out.write("    height: 100px;\n");
      out.write("    overflow-y: scroll;\n");
      out.write("    scrollbar-width: 6px;\n");
      out.write("    scrollbar-color: #f2f2f2f2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".bin-icon{\n");
      out.write("    \n");
      out.write("    height:18px;\n");
      out.write("    width:18px;\n");
      out.write("    float:right;\n");
      out.write("    margin-top:8px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".illustration{height:250px;\n");
      out.write("width:400px;}\n");
      out.write(".no-notes{display: flex;\n");
      out.write("flex-direction: row;}\n");
      out.write(".msg{margin-top:100px;\n");
      out.write("text-align: center;\n");
      out.write("opacity: 70;\n");
      out.write("}\n");
      out.write("footer {\n");
      out.write("    height: 40px;\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: #f2f2f2;;\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 14px;\n");
      out.write("    margin-top:300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("@media screen and (max-width:600px){\n");
      out.write("    .note-input{\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("        margin-top: 20px;\n");
      out.write("    }\n");
      out.write("           .all_note{\n");
      out.write("     display: grid;\n");
      out.write("    grid-template-columns: repeat(1, 1fr);\n");
      out.write("    grid-gap: 10px;\n");
      out.write("}\n");
      out.write("    .navbar{padding-left:20px;}\n");
      out.write("    .action{\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: row;\n");
      out.write("        margin: auto;\n");
      out.write("        align-items: center;\n");
      out.write("        justify-content: center;\n");
      out.write("    }\n");
      out.write("    .notes{\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("    }\n");
      out.write("    .no-notes{\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("    }\n");
      out.write("    .msg{margin:20px;\n");
      out.write("        font-size: 20px;\n");
      out.write("    }\n");
      out.write("    .input-text{\n");
      out.write("        width:auto;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("        body {\n");
      out.write("            font-family: 'Arial', sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        section {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 80vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dashboard-content {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <div class=\"dashboard-content\">\n");
      out.write("    <nav class=\"navbar \">\n");
      out.write("        <h4 class=\"m-1\"><img src=\"icons/logo.png\" class=\"icon\">Notes</h4>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <div class=\"header\">\n");
      out.write("       <div class=\"content\">\n");
      out.write("\n");
      out.write("            <div class=\"note-input\">\n");
      out.write("                <form action=\"add.jsp\" class=\"aaa\">\n");
      out.write("                <textarea class=\"input-text m-1 get-note\" rows=\"3\" name=\"msg\" placeholder=\"// Write a note here\"></textarea>\n");
      out.write("                    <div class=\"action m-3\">\n");
      out.write("                     \n");
      out.write("                        <input type=\"submit\" value=\"add note\" class=\"btn    \"> \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("       </div> \n");
      out.write("    </div>\n");
      out.write("            <div class=\"all_note\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("         ");

        int id = (Integer) session.getAttribute("id");

          String requete="select * from note where idcl="+id;
              try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes?useSSL=false", "root", "");
                 Statement st =conn.createStatement();
                 ResultSet rs =st.executeQuery(requete);
             while(rs.next()){

        
      out.write("\n");
      out.write("       \n");
      out.write("    <div class=\"notes-list mt-3\">\n");
      out.write("            <div class=\"note\" style=\"background-color:white\">\n");
      out.write("            <div class=\"note-view\">\n");
      out.write("                ");
 out.print(rs.getString(3)); 
      out.write("\n");
      out.write("            </div>\n");
      out.write("                <a href=\"supp.jsp?idmsg=");
out.print(rs.getInt(2));
      out.write("\" class=\"deleteBtn\"><img src=\"icons/bin.png\" class=\"bin-icon\"></a>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("                ");

       
              }}
             catch (Exception e) {
              System.out.println(e.toString());
                } 

        
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <footer>\n");
      out.write("        created  by ABELKARIM SELMI\n");
      out.write("    </footer>         \n");
      out.write("</body>\n");
      out.write("</html>");
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
