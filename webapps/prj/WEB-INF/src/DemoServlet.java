import java.io.*;
import javax.servlet.*;
public class DemoServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		String nm=req.getParameter("textName");
		res.setContentType("text/html");
		try{
			PrintWriter pw=res.getWriter();
			pw.println("<html><body><h2>Hello "+nm+"How are you<br>"+nm+"Have a NICE day</h2></body></html>");
			pw.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}