

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieGetController
 */
public class CookieGetController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<h1> Retreiving all cookies from browser localhost domain </h1> <br>");
		
		Cookie[] cks= request.getCookies();
		for (Cookie cookie : cks) {
			
			out.print("<br>Cookie Name :" + cookie.getName());
			out.print("<br>Cookie Value :" + cookie.getValue());
			out.print("<br>");
			
		}
		
	}



}
