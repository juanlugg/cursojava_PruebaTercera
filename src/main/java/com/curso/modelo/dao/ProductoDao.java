package com.curso.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso.conexion.ConexionBD;
import com.curso.modelo.Categoria;
import com.curso.modelo.Producto;

public class ProductoDao {
	private Connection c = null;

	public ProductoDao() {
		c = ConexionBD.conexionDataSource();
	}

	/**
	 * Función que realiza un select de toda la tabla producti
	 * 
	 * @return Lista de productos que están en la tabla producto
	 */
	public List<Producto> selectProductoAll() {
		List<Producto> productos = new ArrayList<Producto>();

		if (c != null) {
			System.out.println("Conectado correctamente");
			try (PreparedStatement ps = c.prepareStatement("SELECT * FROM producto")) {

				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Producto p = new Producto(rs.getInt("id"), rs.getString("nombre"),
							Categoria.valueOf(rs.getString("categoria")), rs.getDouble("precio"), rs.getInt("stock"));
					productos.add(p);
				}
			} catch (SQLException e) {
				System.err.println("ERROR: No se ha podido realizar la operación. \n" + e);
			}
		} else {
			System.err.println("No se ha podido conectar con la BD");
		}
		return productos;
	}
}
