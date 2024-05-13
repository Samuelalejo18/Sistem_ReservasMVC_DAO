package co.edu.konradlorenz.model;

public abstract class Producto {

	protected double precio;
	protected int cantidad;
	private long codigo;
	private String descripcion;
	private String marca;
	private boolean Alquilable;
	private Proveedor proveedor;

	public Producto() {
	}

	public Producto(double precio, int cantidad, long codigo, String descripcion, String marca, boolean Alquilable,
			Proveedor proveedor) {
		this.precio = precio;
		this.cantidad = cantidad;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		this.Alquilable= Alquilable;
		this.proveedor = proveedor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAlquilable() {
		return Alquilable;
	}

	public void setAlquilable(boolean Alquilable) {
		this.Alquilable = Alquilable;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public abstract double calcularPrecioTotal(int cantidadComprar);

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", cantidad=" + cantidad + ", codigo=" + codigo + ", descripcion="
				+ descripcion + ", marca=" + marca + ", Alquilable=" + Alquilable + ", proveedor=" + proveedor + "]";
	}

	
}
