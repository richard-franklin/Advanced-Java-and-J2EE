import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		HttpSession he = request.getSession();
		Date d = (Date)he.getAttribute("date");
		if(d == null) {
			he.setAttribute("puser","");
			he.setAttribute("cuser","");
		}
		String old =(String)he.getAttribute("puser");
		String cur =(String)he.getAttribute("cuser");
		if(d != null && old != "") {
			p.println("<strong>Previous Login: </strong><br>");
			p.println("Username: "+old+"<br>");
			p.println("Login time and date: "+d+"<br>");
		}
		d = new Date();
		he.setAttribute("date", d);
		cur = request.getParameter("uname");
		he.setAttribute("cuser", cur);
		old = cur;
		p.println("<strong>Current Login:</strong><br>");
		p.println("Username: "+cur+"<br>");
		p.println("Login time and date: "+d+"<br>");
		he.setAttribute("puser", old);
    }
}