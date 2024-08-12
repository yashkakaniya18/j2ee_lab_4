import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class Pro18 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        double result = 0;
        switch (operation) {
            case "addition":
                result= num1 + num2;
                break;
            case "subtraction":
                result= num1 - num2;
                break;
            case "multiplication":
                result= num1 * num2;
                break;
            case "division":
                result= num1 / num2;
                break;
        
            default:
                break;
        }
        out.println("<h2>Result:" + result + "</h2>");

    }
}