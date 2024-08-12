import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro22 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("user","John Doe");

        String urlWithSessionID = response.encodeURL("DisplayServlet");


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>URL Rewriting Example</h2>");
        out.println("<p><a href="+urlWithSessionID+">");
        out.println("Click here to see the message</a></p>");
        out.println("</body></html>");

    }
}