import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;


public class Searcher extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        String name=request.getParameter("name");  
        response.sendRedirect("https://www.google.co.in/#q="+name);  
    }  

}