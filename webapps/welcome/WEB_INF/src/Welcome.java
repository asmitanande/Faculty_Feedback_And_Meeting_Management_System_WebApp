import java.io.*;
import javax.servlet.*;
public class Welcome extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>welcome to sggs</h1>");
		out.println("</body>");
		out.println("</html>");
			
	}
}