package co.edu.konradlorenz.model.productosAlquiler;

import co.edu.konradlorenz.model.Alquiler;
import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.Proveedor;

public class SillaDeRuedas extends Producto implements Alquiler {

	private boolean electrica;
	// Precio de alquiler por dia
	private double precioPorDia;

	public SillaDeRuedas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SillaDeRuedas(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public SillaDeRuedas(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor, boolean electrica, double precioPorDia) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		this.electrica = electrica;
		this.precioPorDia = precioPorDia;
	}

	public boolean isElectrica() {
		return electrica;
	}

	public void setElectrica(boolean electrica) {
		this.electrica = electrica;
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
