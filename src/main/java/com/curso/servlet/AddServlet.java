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
 * @version 2.0.0 24/12/2024 Clase Servlet que gestionará el añadir un producto
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductoDao dao = new ProductoDao();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Agreando Producto</title>");
		out.println("</head>");
		out.println("<body style='background-color: #c4fffc'>");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			boolean idExiste = false;
			for (Producto p : AlmacenService.getAlmacenBD()) {
				if (p.getId() == id) {
					idExiste = true;
					break;
				}
			}

			if (idExiste) {
				out.println("<h3 align='center' style='color:red;'>EL ID [" + id
						+ "] YA ESTA ASOCIADO A OTRO PRODUCTO</h3>");
			} else {
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

				dao.insertProducto(new Producto(id, nombre, categoria, precio, stock));

				out.println("<h3 align='center'> EL PRODUCTO [" + id + "] HA SIDO INSERTADO </h3>");
			}

		} catch (Exception e) {
			out.println("<h3 align='center' style='color:red;'> ID INTRODUCIDO TIENE UN FORMATO INCORRECTO </h3>");
		} finally {
			out.println("<br><a align='center' href='menu.html' ><b>VOLVER</b></a>");

			out.println("</body>");
			out.println("</html>");
			out.close();
		}

	}
}
