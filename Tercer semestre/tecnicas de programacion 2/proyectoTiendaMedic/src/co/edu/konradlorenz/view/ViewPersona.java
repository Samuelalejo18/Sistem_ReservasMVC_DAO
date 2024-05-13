package co.edu.konradlorenz.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewPersona {
	Scanner sc = new Scanner(System.in);

	public int ingresarOpcion() {
		int opcion = 0;
		boolean verificarOpcion = false;
		do {
			try {
				System.out.println("Ingrese una opcion");
				opcion = sc.nextInt();
				verificarOpcion = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido(solo numeros)");
				sc.nextLine();
			}
		} while (!verificarOpcion);

		return opcion;
	}

	public void opcionesAutenticacionRegistro() {
		System.out.println("Bienvenido empleado a tienda Medic ");
		System.out.println("1. Autenticar empleado ");
		System.out.println("2.Registrar empleado ");
		System.out.println("0.Salir del sistema de reservas");
	}

	public String ingresarEmail() {
		System.out.println("Ingrese el email : ");
		String email = sc.next();
		return email;
	}

	public String ingresarContrasena() {
		sc.nextLine();
		System.out.println("Ingrese la contraseña : ");
		String contrasena = sc.next();
		return contrasena;
	}

	public String ingresarNombre() {
		System.out.println("Ingrese el nombre:");
		String nombre = sc.next();
		return nombre;
	}

	public String ingresarApellido() {
		System.out.println("Ingrese el apellido :");
		String apellido = sc.next();
		return apellido;
	}

	public int ingresarId() {
		int id = 0;
		boolean verificarId = false;
		do {

			try {
				System.out.println("Ingrese el ID :");
				id = sc.nextInt();
				verificarId = true;

			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido(solo numeros)");
				sc.nextLine();
			}
		} while (!verificarId);

		return id;
	}

	public long ingresarNumeroTelefono() {
		long numeroTelefono = 0;
		boolean verificarTelefono = false;

		do {
			try {
				System.out.println("Ingrese el número de teléfono :");
				numeroTelefono = sc.nextLong();
				verificarTelefono = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido(solo numeros)");
				sc.nextLine();
			}
		} while (!verificarTelefono);

		return numeroTelefono;
	}

	public String ingresarDireccion() {
		System.out.println("Ingrese la dirección :");
		String direccion = sc.next();
		return direccion;
	}

	public long ingresarCodigoEmpleado() {

		long codigoEmpleado = 0;
		boolean verificarCodigo = false;
		do {
			try {
				System.out.println("Ingrese el codigo del empleado :");
				codigoEmpleado = sc.nextLong();
				verificarCodigo = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido(solo numeros)");
				sc.nextLine();
			}
		} while (!verificarCodigo);

		return codigoEmpleado;

	}

	public String ingresarNombreEmpresa() {
		System.out.println("Ingrese la empresa :");
		String empresa = sc.next();
		return empresa;
	}

	public long ingresarCodigoProveedor() {

		long codigoProveedor = 0;
		boolean verificarCodigoProveedor = false;
		do {
			try {
				System.out.println("Ingrese el codigo del proveedor  :");
				codigoProveedor = sc.nextLong();
				verificarCodigoProveedor = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido(solo numeros)");
				sc.nextLine();
			}
		} while (!verificarCodigoProveedor);

		return codigoProveedor;

	}

	public void salirDelSistema() {
		System.out.println("\n");
		System.out.println("Cerrando tienda Medic");
	}

	public void mostrarAutenticacionExitosa() {
		System.out.println("Autenticación exitosa ");

	}

	public void mostrarAutenticacionFallida() {
		System.out.println("Autenticación fallida");

	}

	public void registroExitoso(String nombre) {
		System.out.println("Registro exitoso para el empleado " + nombre);

	}

	public void registroFallido(String nombre) {
		System.out.println("Registro fallido, para   " + nombre);

	}

	public void mostrarMensajeError(String error) {
		System.out.println(error);

	}

	public void mostrarOpcionesTienda() {
		System.out.println("1.Vender ");
		System.out.println("2. Registrar Producto/s ");
		System.out.println("3.Registrar Proveedor");
		System.out.println("4. Registrar Cliente");
		System.out.println("5.Ventas");
		System.out.println("6. Productos");
		System.out.println("7.Proveedores");
		System.out.println("");
	}

}
