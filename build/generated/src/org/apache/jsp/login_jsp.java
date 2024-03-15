package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("               ");

                   
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String req = "SELECT * FROM users WHERE Email=" + email + "AND password=" + password + ";";
              try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes?useSSL=false", "root", "");
                 Statement st =conn.createStatement();
                 ResultSet rs =st.executeQuery(req);
              if (rs.next()) {
            response.sendRedirect("aaa.jsp");
                 } else {
            System.out.print("Invalid email or password");
            response.sendRedirect("login.html");
                 }
                 }
       
             catch (Exception e) {
              System.out.println(e.toString());
                } 

        
      out.write("\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"\n");
      out.write("        integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("    <title>Welcome</title>\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Montserrat:400,800');\n");
      out.write("\n");
      out.write("        :root {\n");
      out.write("            --overlay-color: #3498db;  \n");
      out.write("            --button-color: #e74c3c;   \n");
      out.write("            --button-border-color: #e74c3c; \n");
      out.write("            --overlay-gradiant1: #f39c12;  \n");
      out.write("            --overlay-gradiant2: #9b59b6;  \n");
      out.write("            --body-color: #1a1a1a; \n");
      out.write("        }\n");
      out.write("        * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("            background-color: var(--body-color);  /* Dark Blue */\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 10px 0 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            font-size: 14px;\n");
      out.write("            font-weight: 100;\n");
      out.write("            line-height: 20px;\n");
      out.write("            letter-spacing: 0.5px;\n");
      out.write("            margin: 20px 0 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        span {\n");
      out.write("            font-size: 12px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            color: #333;\n");
      out.write("            font-size: 14px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin: 50px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);\n");
      out.write("            position: relative;\n");
      out.write("            overflow: hidden;\n");
      out.write("            width: 768px;\n");
      out.write("            max-width: 100%;\n");
      out.write("            min-height: 480px;\n");
      out.write("        }\n");
      out.write("        .form-container form {\n");
      out.write("            background: white;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            padding: 0 50px;\n");
      out.write("            height: 100%;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .social-container {\n");
      out.write("            margin: 21px 0;\n");
      out.write("        }\n");
      out.write("        .social-container a {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            display: inline-flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            margin: 0 5px;\n");
      out.write("            height: 40px;\n");
      out.write("            width: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container input {\n");
      out.write("            background: #eee;\n");
      out.write("            border: none;\n");
      out.write("            padding: 12px 15px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            width: 100%;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container input:focus {\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button,input[type=\"submit\"] {\n");
      out.write("            border-radius: 20px;\n");
      out.write("            border: 1px solid var(--button-border-color);\n");
      out.write("            background: var(--button-color);\n");
      out.write("            color: white;\n");
      out.write("            font-size: 12px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            padding: 12px 15px;\n");
      out.write("            letter-spacing: 1px;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            transition: transform 80ms ease-in;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:active {\n");
      out.write("            transform: scale(0.95);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:focus {\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button.ghost {\n");
      out.write("            background: transparent;\n");
      out.write("            border-color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            height: 100%;\n");
      out.write("            transition: all 0.6s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sign-in-container {\n");
      out.write("            left: 0;\n");
      out.write("            width: 50%;\n");
      out.write("            z-index: 2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sign-up-container {\n");
      out.write("            left: 0;\n");
      out.write("            width: 50%;\n");
      out.write("            z-index: 1;\n");
      out.write("            opacity: 0;\n");
      out.write("        }\n");
      out.write("        .overlay-container {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 50%;\n");
      out.write("            width: 50%;\n");
      out.write("            height: 100%;\n");
      out.write("            overflow: hidden;\n");
      out.write("            transition: transform 0.6s ease-in-out;\n");
      out.write("            z-index: 50;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .overlay {\n");
      out.write("            background: var(--overlay-color);\n");
      out.write("            background: linear-gradient(to right, var(--overlay-gradiant1), var(--overlay-gradiant2)) no-repeat 0 0 / cover;\n");
      out.write("            color: white;\n");
      out.write("            position: relative;\n");
      out.write("            left: -100%;\n");
      out.write("            height: 100%;\n");
      out.write("            width: 200%;\n");
      out.write("            transform: translateX(0);\n");
      out.write("            transition: transform 0.6s ease-in-out;\n");
      out.write("        }\n");
      out.write("        .overlay-panel {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 0 40px;\n");
      out.write("            height: 100%;\n");
      out.write("            width: 50%;\n");
      out.write("            text-align: center;\n");
      out.write("            transform: translateX(0);\n");
      out.write("            transition: transform 0.6s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .overlay-right {\n");
      out.write("            right: 0;\n");
      out.write("            transform: translateX(0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .overlay-left {\n");
      out.write("            transform: translateX(-20%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hh {\n");
      out.write("            color: #ffffff;\n");
      out.write("            font-size: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .container.right-panel-active .sign-in-container {\n");
      out.write("            transform: translateX(100%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container.right-panel-active .overlay-container {\n");
      out.write("            transform: translateX(-100%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container.right-panel-active .sign-up-container {\n");
      out.write("            transform: translateX(100%);\n");
      out.write("            opacity: 1;\n");
      out.write("            z-index: 5;\n");
      out.write("        }\n");
      out.write("        .container.right-panel-active .overlay {\n");
      out.write("            transform: translateX(50%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container.right-panel-active .overlay-left {\n");
      out.write("            transform: translateX(0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container.right-panel-active .overlay-right {\n");
      out.write("            transform: translateX(20%);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("            <h1 class=\"hh\">Welcome for your notebook</h1>\n");
      out.write("    <div class=\"container\" id=\"container\">\n");
      out.write("        <div class=\"form-container sign-up-container\">\n");
      out.write("            <form action=\"signup.jsp\" method=\"POST\">\n");
      out.write("                <h1 class=\"hh\">Create Account</h1>\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your name\" required>\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Enter your email\" required>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter your password\" required>\n");
      out.write("                <input type=\"submit\" value=\"Sign Up\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-container sign-in-container\">\n");
      out.write("            <form action=\"login.jsp\" method=\"POST\">\n");
      out.write("                <h1>Sign in</h1>\n");
      out.write("                <span>or use your account</span>\n");
      out.write("                <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Enter your email\" required>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Enter your password\" required>\n");
      out.write("                <input type=\"submit\" value=\"Sign In\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"overlay-container\">\n");
      out.write("            <div class=\"overlay\">\n");
      out.write("                <div class=\"overlay-panel overlay-left\">\n");
      out.write("                    <h1>Hello friend!</h1>\n");
      out.write("                    <p>Login to your account</p>\n");
      out.write("                    <button class=\"ghost\" id=\"signIn\">Login</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"overlay-panel overlay-right\">\n");
      out.write("                    <h1>Welcome Back!</h1>\n");
      out.write("                    <p>Dont have an account? <br> Join us now</p>\n");
      out.write("                    <button class=\"ghost\" id=\"signUp\">Sign Up</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"script.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
