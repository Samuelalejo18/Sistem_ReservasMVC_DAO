package co.edu.konradlorenz.model;

public class Empleado extends Persona {
	private String contrasena;
	private long codigoEmpleado;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, long telefono, String email, long id, String direccion) {
		super(nombre, apellido, telefono, email, id, direccion);
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String apellido, long telefono, String email, long id, String direccion,
			String contrasena, long  codigoEmpleado) {
		super(nombre, apellido, telefono, email, id, direccion);
		this.contrasena = contrasena;
		this.codigoEmpleado= codigoEmpleado;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public long getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(long codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [contrasena=" + contrasena + ", codigoEmpleado=" + codigoEmpleado + "]";
	}
	

	
	

}
