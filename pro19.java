import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro19 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userAgent = request.getHeader("user-Agent");

        if(userAgent != null && userAgent.contains("MSIE")){
            out.println("<h2>You are using Internet Explorer");

        }else{
            out.println("<h2>You are using a different browser</h2>");
        }
        out.close();
    }
}