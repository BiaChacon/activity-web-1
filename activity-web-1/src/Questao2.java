import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Questao2")
public class Questao2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
		 
		String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String repetesenha = req.getParameter("repetesenha");
        
        if(nome.isEmpty() || email.isEmpty() || senha.isEmpty() || repetesenha.isEmpty() ) {
        	resp.getWriter().println("Voce não preencheu todos os dados");
        }else if(! senha.equals(repetesenha)) {
        	resp.getWriter().println("Sua senha não esta igual");
        }else if(String.valueOf(senha).length() < 6) {
        	resp.getWriter().println("Sua senha não é segura, pois não tem mais de 5 caracteres");
        }else if(verificarNumero(senha)){
        	resp.getWriter().println("Sua senha não é segura, pois não possui números");
        }else {
        	resp.getWriter().println("Cadastro realizado");
        }
	}
	public boolean verificarNumero(String s) {
    	
    	String n[] = {"0","1","2","3","4","5","6","7","8","9"};
        
    	for(int i=0; i<n.length; i++) {
    		if(s.contains(n[i])) {
        		return false;
    		}
    	}
    	return true;
	}
}
