package co.edu.konradlorenz.model.productosAlquiler;

import co.edu.konradlorenz.model.Alquiler;
import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.personas.Proveedor;

public class Caminadora extends Producto implements Alquiler {

	private String material;
	private boolean ajustables;
	double precioPorDia;

	public Caminadora() {

	}

	public Caminadora(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public Caminadora(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor, String material, boolean ajustables, double precioPorDia) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		this.material = material;
		this.ajustables = ajustables;
		this.precioPorDia = precioPorDia;
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

	@Override
	public double calcularPrecioTotal(int cantidadComprar) {
		return 0;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	@Override
	public String toString() {
		return "Caminadora [material=" + material + ", ajustables=" + ajustables + "]";
	}

	@Override
	public double calcularPrecioAlquiler() {
		// TODO Auto-generated method stub
		return 0;
	}

}
