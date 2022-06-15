

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieController
 */
public class CookieController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("cookie1");
		String s2=request.getParameter("cookie2");
		String s3=request.getParameter("cookie3");
		
		Cookie ck1=new Cookie("ck1", s1);
		Cookie ck2=new Cookie("ck2", s2);
		Cookie ck3=new Cookie("ck3", s3);
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		
		response.sendRedirect("success.html");
		
	}

}
