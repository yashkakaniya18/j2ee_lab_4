import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro23 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String hiddenField = request.getParameter("hiddenField");

        out.println("<html><body>");
        out.println("<h2>Form Data Received</h2>");
        out.println("<p>Name: "+ name+"</p>");
        out.println("<p>Hidden Field value: " + hiddenField + "</p>");
        out.println("</body></html>");
        out.close();
    }
}