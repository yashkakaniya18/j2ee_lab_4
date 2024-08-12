import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro17 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("user".equals(username) && "password".equals(password)){
            out.println("<h2>Welcome " +username +"!</h2>");

        }else{
            out.println("<h2>Invalid username or password. Please try again.</h2>");
        }
        out.close();
    }
}