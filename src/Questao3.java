import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Questao3")
public class Questao3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		handleRequest(req, resp);
	}
	
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html");
		 
        out.println(
                "<html>\n" +
                "<head><title>HTTP Enviado</title></head>\n"+
                "<body>\n" +
                "<h1>HTTP Enviado do cliente para o servidor</h1>\n");
        
        Enumeration<String> headerNames = req.getHeaderNames();
        
        while(headerNames.hasMoreElements()) {
            String paramName = (String)headerNames.nextElement();
            out.print("<ol>" + paramName + " = ");
            String paramValue = req.getHeader(paramName);
            out.println(paramValue + "</ol>\n");
        }
        
        out.println("</body></html>");
        
    }
}
