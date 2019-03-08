import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Questao1")
public class Questao1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
			
			String nome = req.getParameter("nome");
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.println("<html>");
			out.println("<head>");
			out.println("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"main.css\" />");
			out.println("<title>Questtão 1</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("Bom dia, " + nome);
			out.println("</body>");
			out.println("</html>");
			
			out.close();
			
		} 

}
