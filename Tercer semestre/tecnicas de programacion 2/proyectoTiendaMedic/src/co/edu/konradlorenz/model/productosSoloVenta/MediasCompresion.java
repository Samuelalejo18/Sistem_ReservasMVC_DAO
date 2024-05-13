package co.edu.konradlorenz.model.productosSoloVenta;

import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.Proveedor;

public class MediasCompresion extends Producto {
	private int tamano;
	private String tipo;
	private int longitud;

	public MediasCompresion() {
		super();
	}

	public MediasCompresion(double precio, int cantidad, long codigo, String descripcion, String marca,
			boolean Alquilable, Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public MediasCompresion(double precio, int cantidad, long codigo, String descripcion, String marca,
			boolean Alquilable, Proveedor proveedor, int tamano, String tipo, int longitud) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		this.tamano = tamano;
		this.tipo = tipo;
		this.longitud = longitud;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public double calcularPrecioTotal(int cantidadComprar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "MediasCompresion [tamano=" + tamano + ", tipo=" + tipo + ", longitud=" + longitud + "]";
	}

}
