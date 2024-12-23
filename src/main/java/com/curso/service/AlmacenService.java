package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.curso.modelo.Categoria;
import com.curso.modelo.Producto;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.0.0 17/12/2024 
 * Clase que contiene la lista de productos que ya están guardados
 */

public class AlmacenService {
	private static List<Producto> almacen = new ArrayList<>(Arrays.asList(
			new Producto(1, "Plátano", Categoria.ALIMENTICIO, 0.5, 321),
			new Producto(2, "Lapiz", Categoria.PAPELERIA, 1.0, 150),
			new Producto(3, "Libreta", Categoria.PAPELERIA, 3.25, 85),
			new Producto(4, "Muñequeras", Categoria.DEPORTE, 8.20, 35),
			new Producto(5, "Lapiz", Categoria.PAPELERIA, 1.0, 50),
			new Producto(6, "Play 5", Categoria.TECNOLOGIA, 500.0, 27),
			new Producto(7, "Lego", Categoria.OCIO, 15.0, 125),
			new Producto(8, "Gel de ducha", Categoria.HIGIENE, 5.0, 108),
			new Producto(9, "Agua oxigenada", Categoria.ENFERMERIA, 3.50, 76),
			new Producto(10, "Queso", Categoria.ALIMENTICIO, 2.0, 240)
			));

	public static List<Producto> getAlmacen() {
		return almacen;
	}
}