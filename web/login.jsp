
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               <%
                   
            String email = request.getParameter("email");
            out.print("1");
            String password = request.getParameter("password");
            out.print("1");
            String req = "SELECT * FROM users WHERE Email='" + email + "' AND password='" + password + "';";
            out.print(req);
              try{
                  out.print("1");
                    Class.forName("com.mysql.jdbc.Driver");
                   out.print("1");
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes?useSSL=false", " ", "");
                 Statement stmt = conn.createStatement();
                 out.print("1");
                       Statement st =conn.createStatement();
                       out.print("1");
                 ResultSet rs =st.executeQuery(req);
                 out.print("1");
              if (rs.next()) {
                  out.print("1");
                  session.setAttribute("id", rs.getInt(1));
            response.sendRedirect("aaa.jsp");
                 } else {
            System.out.print("Invalid email or password");
            response.sendRedirect("login.html");
            
                 }
                 }
       
             catch (Exception e) {
              System.out.println(e.toString());
                } 

        %>
    </body>
</html>
