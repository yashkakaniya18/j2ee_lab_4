import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro26 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);


        if(session.getAttribute("visitedBefore")== null){                 
            
            out.println("<html><body>");
            out.println("<h2>Welcome back!</h2>");
            out.println("</body></html>");
            session.setAttribute("visitedBefore",true);
        }else{
            out.println("<html><body>");
            out.println("<h2>Welcome!</h2>");
            out.println("</body></html>");

        }
        out.close();
        }
    }
