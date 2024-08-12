import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro25 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        boolean cookieExists = false;

        if(cookies != null){
            for (Cookie cookie : cookies){
                if(cookie.getName().equals("visitedBefore")){
                    isReturningUser = true;
                    break;
                }
            }
        }
        if(isReturningUser){
            out.println("<html><body>");
            out.println("<h2>Welcome back!</h2>");
            out.println("</body></html>");
        }else{
            out.println("<html><body>");
            out.println("<h2>Welcome!</h2>");
            out.println("</body></html>");

            Cookie visitCookie = new Cookie("visitedBefore", "true")
            visitCookie.setMaxAge(60 *60 * 24 * 365);
            response.addCookie(visitCookie);
        }
        }
        out.close();
    }
