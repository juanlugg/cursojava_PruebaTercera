package com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.curso.modelo.Categoria;
import com.curso.modelo.Producto;
import com.curso.modelo.dao.ProductoDao;
import com.curso.service.AlmacenService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 2.0.0 24/12/2024 Clase Servlet que gestionará el modificado del
 *          producto
 */
public class ModificarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("producto"));
		for (Producto p : AlmacenService.getAlmacenBD()) {
			if (p.getId() == id) {
				ProductoDao dao = new ProductoDao();
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"UTF-8\">");
				out.println("<title>Modificación exitoso</title>");
				out.println("</head>");
				out.println("<body style='background-color: #c4fffc'>");
				String nombre = request.getParameter("nombre");
				Categoria categoria = Categoria.valueOf(request.getParameter("categoria"));
				Double precio;
				int stock;
				try {
					precio = Double.parseDouble(request.getParameter("precio"));
				} catch (Exception e) {
					precio = 0.0;
				}
				try {
					stock = Integer.parseInt(request.getParameter("stock"));
				} catch (Exception e) {
					stock = 0;
				}				
				p.setNombre(nombre);
				p.setCategoria(categoria);
				p.setPrecio(precio);
				p.setStock(stock);

				dao.updateProducto(new Producto(id, nombre, categoria, precio, stock));
				
				out.println("<h2 align='center'> EL PRODUCTO [" + p.getId() + "] HA SIDO MODIFICADO </h2>");
				out.println("<p align='center'>" + p + "</p>");
				out.println("<br><a align='center' href='menu.html' ><b>VOLVER</b></a>");
				out.println("</body>");
				out.println("</html>");
				out.close();

			}
		}
	}

}
