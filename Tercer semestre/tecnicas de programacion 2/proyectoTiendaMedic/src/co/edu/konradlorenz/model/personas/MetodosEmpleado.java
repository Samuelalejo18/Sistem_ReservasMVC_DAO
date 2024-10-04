package co.edu.konradlorenz.model.personas;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

import co.edu.konradlorenz.model.excepciones.RegistroExcepcion;

public class MetodosEmpleado {

	private static ArrayList<Empleado> empleados = new ArrayList<>();
	private static Empleado empleadoAutenticado;
	public static Empleado objEmpleadoAutentificado;

	public MetodosEmpleado() {

	}

	public void pruebaEmpleado() {
		Empleado empleado = new Empleado("Samuel", "monsalve", 1234567890, "Samuelalejomonsalve@gmail.com", 1014180728,
				"carrera 68g", "lukas2012", 1654321008);
		empleados.add(empleado);
	}

	public static boolean registrar(Empleado empleado) throws RegistroExcepcion {
		boolean existeEmpleado1 = false;
		boolean existeEmpleado2 = false;
		boolean existeEmpleado3 = false;

		for (Empleado empleado1 : empleados) {

			if (empleado1.getCodigoEmpleado() == empleado.getCodigoEmpleado()) {
				throw new RegistroExcepcion("El codigo ya existe");

			}
			if (empleado1.getEmail().equals(empleado.getEmail())) {
				throw new RegistroExcepcion("El correo ya existe");
			}

			if (empleado1.getId() == empleado.getId()) {
				throw new RegistroExcepcion("El id ya existe");
			}

		}

		if ((existeEmpleado1 && existeEmpleado2) && existeEmpleado3) {
			throw new RegistroExcepcion("El empleado ya esta registrado");
		} else {
			empleados.add(empleado);
			return true;
		}

	}

	public static Empleado autenticarse(long codigoEmpleado, String contrasena) throws LoginException {

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
				throw new LoginException("Autenticacion fallida");
			}

		} else {
			throw new LoginException("El empleado no existe");
			
		}

	}

}
