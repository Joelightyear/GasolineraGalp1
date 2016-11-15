package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Combustible")
public class Combustible extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Combustible() {
        super();
        
    }
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String aceptar = request.getParameter("aceptar");
		
		if (aceptar != null) {
			response.sendRedirect("html/gracias.html");
		}
		else {
			response.sendRedirect("index.html");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
