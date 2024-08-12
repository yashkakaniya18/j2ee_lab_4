import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro20 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String url = request.getParameter("url");

        response.sendRedirect("https://www.google.com")
    }
}