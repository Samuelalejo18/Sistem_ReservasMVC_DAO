/**
 * 
 */
package co.edu.konradlorenz.model.productosSoloVenta;

import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.Proveedor;

/**
 * 
 */
public class Glucometro extends Producto {

	private String modelo;
	private String fuenteEnergia;

	/**
	 * 
	 */
	public Glucometro() {
		super();
	}

	
	public Glucometro(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor) {
		super(precio, cantidad, codigo, descripcion, marca, Alquilable, proveedor);
		// TODO Auto-generated constructor stub
	}

	public Glucometro(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor, String modelo, String fuenteEnergia) {
		this.modelo = modelo;
		this.fuenteEnergia = fuenteEnergia;
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFuenteEnergia() {
		return fuenteEnergia;
	}

	public void setFuenteEnergia(String fuenteEnergia) {
		this.fuenteEnergia = fuenteEnergia;
	}
	
	@Override
	public double calcularPrecioTotal(int cantidadComprar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Glucometro [modelo=" + modelo + ", fuenteEnergia=" + fuenteEnergia + "]";
	}
	
	
	

}
