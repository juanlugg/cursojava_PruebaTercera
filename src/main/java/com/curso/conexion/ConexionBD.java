package com.curso.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConexionBD {
	private static final String URL = "jdbc:mysql://localhost:3306/";
	private static final String USER = "root";
	private static final String PWD = "root";

	@Deprecated
	public static Connection conexion(String database) {
		Connection conex = null;

		try {
			conex = DriverManager.getConnection(URL + database, USER, PWD);
		} catch (SQLException e) {
			System.err.println("ERROR: No se pudo hacer la conexión a la base de datos: \n" + e);
		}
		return conex;
	}

	public static Connection conexionDataSource() {
		Connection c = null;
		DataSource ds;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/AlmacenDataSource"); 
			c = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
}
