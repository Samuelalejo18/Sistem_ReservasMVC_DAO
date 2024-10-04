package co.edu.konradlorenz.controller;

import javax.security.auth.login.LoginException;

import co.edu.konradlorenz.model.excepciones.RegistroExcepcion;
import co.edu.konradlorenz.model.personas.Empleado;
import co.edu.konradlorenz.model.personas.MetodosEmpleado;
import co.edu.konradlorenz.view.ViewPersona;

public class Controller {
	ViewPersona objViewPersona = new ViewPersona();
	Empleado objEmpleadoAutenticado;
	MetodosEmpleado objMetodosEmpleado = new MetodosEmpleado();
	ControllerProducto controllerProducto = new ControllerProducto();

	public void funcionar() {

		objMetodosEmpleado.pruebaEmpleado();
		opcionesAutenticacionRegistro();
	}

	public void opcionesAutenticacionRegistro() {

		int opcion = -1;
		while (opcion != 0) {

			objViewPersona.opcionesAutenticacionRegistro();
			opcion = objViewPersona.ingresarOpcion();
			switch (opcion) {
				case 1:
					try {
						objEmpleadoAutenticado = MetodosEmpleado.autenticarse(objViewPersona.ingresarCodigoEmpleado(),
								objViewPersona.ingresarContrasena());
								opcionesTienda();
					} catch (LoginException e) {
						objViewPersona.mostrarMensaje(e.getMessage());
						e.printStackTrace();
					}
					/*
					 * if (objEmpleadoAutenticado != null) {
					 * objViewPersona.mostrarAutenticacionExitosa();
					 * opcionesTienda();
					 * } else {
					 * objViewPersona.mostrarAutenticacionFallida();
					 * }
					 */
					break;
				case 2:
					try {
						String nombre = objViewPersona.ingresarNombre();
						String apellido = objViewPersona.ingresarApellido();
						long telefono = objViewPersona.ingresarNumeroTelefono();
						String email = objViewPersona.ingresarEmail();
						int id = objViewPersona.ingresarId();
						String direccion = objViewPersona.ingresarDireccion();
						String contrasena = objViewPersona.ingresarContrasena();
						long codigoEmpleado = objViewPersona.ingresarCodigoEmpleado();
						Empleado empleado = new Empleado(nombre, apellido, telefono, email, id, direccion, contrasena,
								codigoEmpleado);
						MetodosEmpleado.registrar(empleado);
					} catch (RegistroExcepcion e) {
						objViewPersona.mostrarMensaje(e.getMessage());
						e.printStackTrace();
					}

				case 0:
					objViewPersona.salirDelSistema();
					break;
				default:

			}
		}
	}

	public void opcionesTienda() {
		int opcion = -1;
		do {
			objViewPersona.mostrarOpcionesTienda();
			opcion = objViewPersona.ingresarOpcion();
			switch (opcion) {
				case 1:
					break;
				case 2:
					controllerProducto.agregarProducto();
					break;

				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
			}

		} while (opcion != 0);
	}

}
