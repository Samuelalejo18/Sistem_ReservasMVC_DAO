package co.edu.konradlorenz.model;

public interface PuntosCompra {

	public final int PUNTO_COLOMBIA= 1;
	
	
	/*Puntos Colombia brinda por cada $700 en compras, acumulas 1 Punto. Eso quiere decir que 1000 puntos equivale a $700.000.*/
	public void calcularPuntosPorCompra(double precioTotal);
}
