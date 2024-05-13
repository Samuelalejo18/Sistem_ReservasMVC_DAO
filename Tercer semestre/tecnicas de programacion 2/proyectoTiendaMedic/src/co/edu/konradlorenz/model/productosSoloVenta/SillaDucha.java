package co.edu.konradlorenz.model.productosSoloVenta;

import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.Proveedor;

public class SillaDucha extends Producto {

	private String material;
	private String tipo;
	private int pesoSoportado;

	public SillaDucha() {

	}

	public SillaDucha(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public SillaDucha(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor, String material, String tipo, int pesoSoportado) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		this.material = material;
		this.tipo = tipo;
		this.pesoSoportado = pesoSoportado;
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

	public int getPesoSoportado() {
		return pesoSoportado;
	}

	public void setPesoSoportado(int pesoSoportado) {
		this.pesoSoportado = pesoSoportado;
	}

	@Override
	public double calcularPrecioTotal(int cantidadComprar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "SillaDucha [material=" + material + ", tipo=" + tipo + ", pesoSoportado=" + pesoSoportado + "]";
	}
	
	
	
	

}
