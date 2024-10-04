package co.edu.konradlorenz.model.productosAlquiler;

import co.edu.konradlorenz.model.Alquiler;
import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.personas.Proveedor;

public class Muletas extends Producto implements Alquiler {
	private int longitud;
	private String material;
	private boolean ajustables;
	private double precioPorDia;

	public Muletas() {
		super();
	}

	public Muletas(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public Muletas(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor, int longitud, String material, boolean ajustables, double precioPorDia) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		this.longitud = longitud;
		this.material = material;
		this.ajustables = ajustables;
		this.precioPorDia = precioPorDia;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isAjustables() {
		return ajustables;
	}

	public void setAjustables(boolean ajustables) {
		this.ajustables = ajustables;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	@Override
	public double calcularPrecioTotal(int cantidadComprar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPrecioAlquiler() {
		double precioDeAlquiler = 0;
		if (this.getCantidad() > 0) {
			precioDeAlquiler = precioPorDia * DIAS_DE_ALQUILER;
		}
		return precioDeAlquiler;
	}

}
