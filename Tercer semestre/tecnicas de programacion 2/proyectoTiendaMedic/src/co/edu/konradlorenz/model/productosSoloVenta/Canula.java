package co.edu.konradlorenz.model.productosSoloVenta;

import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.personas.Proveedor;

public class Canula extends Producto {
	private int tamano;
	private String material;
	private String tipo;

	public Canula() {
		super();
	}

	public Canula(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public Canula(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor, int tamano, String material, String tipo) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		this.tamano = tamano;
		this.material = material;
		this.tipo = tipo;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calcularPrecioTotal(int cantidadComprar) {
		double total = 0;
		if (this.cantidad >= cantidadComprar) {
			total = precio * cantidadComprar;
		}
		return total;
	}

	@Override
	public String toString() {
		return "Canula [tamano=" + tamano + ", material=" + material + ", tipo=" + tipo + "]";
	}

}
