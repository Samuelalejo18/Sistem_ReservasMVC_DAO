package co.edu.konradlorenz.model.productosSoloVenta;

import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.Proveedor;

public class CuelloOrtopedico extends Producto {
	private int tamano;
	private String material;
	private String soporte;

	public CuelloOrtopedico() {
		// TODO Auto-generated constructor stub
	}

	public CuelloOrtopedico(double precio, int cantidad, long codigo, String descripcion, String marca,
			boolean Alquilable, Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public CuelloOrtopedico(double precio, int cantidad, long codigo, String descripcion, String marca,
			boolean Alquilable, Proveedor proveedor, int tamano, String material, String soporte) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		this.tamano = tamano;
		this.material = material;
		this.soporte = soporte;
	}

	public int getTamano() {
		return tamano;
	}

	public void settamano(int tamano) {
		this.tamano = tamano;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}

	@Override
	public double calcularPrecioTotal(int cantidadComprar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "CuelloOrtopedico [tamano=" + tamano + ", material=" + material + ", soporte=" + soporte + "]";
	}

}
