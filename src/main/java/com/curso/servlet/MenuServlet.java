package com.curso.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.0.0 17/12/2024 Clase Servlet que tendrá como una función de Menu
 *          que navegará a otras opciones
 */
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String opcion = request.getParameter("opcion");
		String nav = "";
		switch (opcion) {
		case "LISTAR PRODUCTOS": {
			nav = "listarProductos.jsp";
			break;
		}
		case "AÑADIR PRODUCTO": {
			nav = "addProducto.jsp";
		}
			break;
		/*
		 * } case "MODIFICAR PRODUCTO": { break; } case "ELIMINAR PRODUCTO": { break; }
		 */
		}
		request.getRequestDispatcher(nav).include(request, response);

	}
}
