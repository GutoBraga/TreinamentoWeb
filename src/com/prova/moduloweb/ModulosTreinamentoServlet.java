package com.prova.moduloweb;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prova.moduloweb.service.ModuloService;

/**
 * Servlet implementation class ModulosTreinamentoServlet
 */
@WebServlet("/modulos")
public class ModulosTreinamentoServlet extends HttpServlet{
	
	public ModulosTreinamentoServlet() {
		System.out.println("Iniciando a nosssa servlet...");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ModuloService service = new ModuloService();
		List<Modulo> listaModulos = null;
		try {
			listaModulos = service.consultarModulos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("modulos", listaModulos);
		
		RequestDispatcher rd = req.getRequestDispatcher("/consultar-modulos.jsp");
		rd.forward(req, resp);
	}
	
}
