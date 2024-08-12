import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro21 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

       out.println("<html><body>");
       out.println("<h2>404 - Page Not Found</h2>");
       out.println("<p>Sorry, the page you are looking for does not exist</p>");
       out.println("<p>Please check the URL or go back to the");
       out.println("<a herf="/">home page</a></p>");
       out.println("</html></body>");
    }
}