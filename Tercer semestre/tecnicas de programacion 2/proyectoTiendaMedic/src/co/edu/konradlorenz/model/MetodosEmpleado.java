package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class MetodosEmpleado {

	private static ArrayList<Empleado> empleados = new ArrayList<>();
	private static Empleado empleadoAutenticado;
	public static Empleado objEmpleadoAutentificado;

	public MetodosEmpleado() {

	}
	
	public void pruebaEmpleado() {
		Empleado empleado= new Empleado("Samuel","monsalve",1234567890,"Samuelalejomonsalve@gmail.com",1014180728,"carrera 68g","lukas2012",1654321008);
		empleados.add(empleado);
	}

	public static boolean registrar(Empleado empleado) {
		boolean existeEmpleado1 = false;
		boolean existeEmpleado2 = false;
		boolean existeEmpleado3 = false;

		for (Empleado empleado1 : empleados) {

			if (empleado1.getCodigoEmpleado() == empleado.getCodigoEmpleado()) {
				existeEmpleado1 = true;

			}
			if (empleado1.getEmail().equals(empleado.getEmail())) {
				existeEmpleado2 = true;
			}

			if (empleado1.getId() == empleado.getId()) {
				existeEmpleado3 = true;
			}

		}

		if ((existeEmpleado1 && existeEmpleado2) && existeEmpleado3) {
			return false;
		} else {
			empleados.add(empleado);
			return true;
		}

	}

	public static Empleado autenticarse(long codigoEmpleado, String contrasena) {

		Empleado empleadoEncontrado = null;
		for (Empleado empleado : empleados) {
			if (empleado.getCodigoEmpleado() == codigoEmpleado) {
				empleadoEncontrado = empleado;
				break;
			}
		}
		if (empleadoEncontrado != null) {

			if (empleadoEncontrado.getContrasena().equals(contrasena)) {
				empleadoAutenticado = empleadoEncontrado;
				return empleadoAutenticado;
			} else {
				return null;
			}

		} else {
			return null;
		}

	}
	
	
	
}
