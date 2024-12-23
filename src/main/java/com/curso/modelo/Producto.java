package com.curso.modelo;

/**
 * 
 * @author Juan Luis Guerra Gennich
 * @version 1.0.0 17/12/2024 Clase que representa lo que será un objeto de
 *          producto
 */
public final class Producto {
	private int id;
	private String nombre;
	private Categoria categoria;
	private double precio;
	private int stock;

	public Producto(int id, String nombre, Categoria categoria, double precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[ID = " + id + " | nombre = " + nombre + " | categoria = " + categoria + " | precio = " + precio
				+ " | stock = " + stock + "]";
	}

}
