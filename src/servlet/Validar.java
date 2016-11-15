package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validar")
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Validar() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Simulando el nombre, apellidos y numero de tarjeta

		String minombre = new String("joel");
		String miapellido = new String("jackson");
		String minumtarjeta = new String("123456789");
		String micantidad = new String("20");

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String numtarjeta = request.getParameter("numtarjeta");
		String validar = request.getParameter("validar");
		String efectivo = request.getParameter("efectivo");
		
		

		if (validar != null) {
			if (numtarjeta != null) {

				if ((nombre.equals(minombre)) && (apellido.equals(miapellido)) && (numtarjeta.equals(minumtarjeta))) {
					response.sendRedirect("html/combustible.html");
				}

				else {
					response.sendRedirect("index.html");
				}
			} 
			else {

				if ((nombre.equals(minombre)) && (apellido.equals(miapellido)) && (efectivo.equals(micantidad))) {
					response.sendRedirect("html/combustible.html");
				}

				else {
					response.sendRedirect("index.html");
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
