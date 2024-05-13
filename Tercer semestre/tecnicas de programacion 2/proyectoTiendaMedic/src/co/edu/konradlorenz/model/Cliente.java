package co.edu.konradlorenz.model;

public class Cliente extends Persona  implements PuntosCompra{

	private double puntosCompra;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, long telefono, String email, long id, String direccion) {
		super(nombre, apellido, telefono, email, id, direccion);
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String apellido, long telefono, String email, long id, String direccion,
			double puntosCompra) {
		super(nombre, apellido, telefono, email, id, direccion);
		this.puntosCompra = puntosCompra;
	}

	public double getPuntosCompra() {
		return puntosCompra;
	}

	public void setPuntosCompra(double puntosCompra) {
		this.puntosCompra = puntosCompra;
	}

	@Override
	public String toString() {
		return "Cliente [puntosCompra=" + puntosCompra + "]";
	}

	
	/*Puntos Colombia brinda por cada $700 en compras, acumulas 1 Punto. Eso quiere decir que 1000 puntos equivale a $700.000.*/
	@Override
	public void calcularPuntosPorCompra(double precioTotal) {
		double compra= precioTotal/700;
		double puntos= compra* PUNTO_COLOMBIA;
		setPuntosCompra(getPuntosCompra()+puntos);
	}

	

}
