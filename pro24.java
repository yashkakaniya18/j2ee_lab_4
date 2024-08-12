import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro24 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        boolean cookieExists = false;

        if(cookie != null){
            for (Cookie cookie : cookies){
                if(cookie.getName().equals("user")){
                    cookieExists = true;
                    break;
                }
            }
        }
        if(!cookieExists) {
            Cookie newUserCookie = new Cookie("user", "John Doe");
            newUserCookie.setMaxAge(60 * 60 * 24);
            response.addCookie(newUserCookie);
            out.println("<p>Cookie 'user' has been created <p>");
        }else{
            out.println("<p>Cookie 'user' has already exists<p>");
        }

        out.println("<h2>Cookies:</h2>");
        if(cookies != null ) {
            for(Cookie cookie : cookies){
                out.println("<p>" + cookie.getName() + ":" + cookie.getValue() + "</p>" );
                  }
        }else{
            out.println("<p>No cookies found<p>");
        }
        }
        out.close();
    }
