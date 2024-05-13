package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Empleado;
import co.edu.konradlorenz.model.MetodosEmpleado;
import co.edu.konradlorenz.view.ViewPersona;

public class Controller {
	ViewPersona objViewPersona = new ViewPersona();
	Empleado objEmpleadoAutenticado;
	MetodosEmpleado objMetodosEmpleado = new MetodosEmpleado();

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
				objEmpleadoAutenticado = MetodosEmpleado.autenticarse(objViewPersona.ingresarCodigoEmpleado(),
						objViewPersona.ingresarContrasena());
				if (objEmpleadoAutenticado != null) {
					objViewPersona.mostrarAutenticacionExitosa();
					opcionesTienda();
				} else {
					objViewPersona.mostrarAutenticacionFallida();
				}
				break;
			case 2:

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

				if (!MetodosEmpleado.registrar(empleado)) {
					objViewPersona.registroFallido(empleado.getNombre());

				} else {
					objViewPersona.registroExitoso(empleado.getNombre());
					MetodosEmpleado.registrar(empleado);

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
			opcion= objViewPersona.ingresarOpcion();
			switch (opcion) {
			case 1 : {
				
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		} while (opcion!=0);
	}

}
