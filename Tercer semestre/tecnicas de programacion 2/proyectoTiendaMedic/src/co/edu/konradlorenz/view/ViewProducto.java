package co.edu.konradlorenz.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewProducto {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenuProductos() {
        System.out.println(" Agragar producto: ");
        System.out.println("1.Caminadora  ");
        System.out.println("2.Muletas ");
        System.out.println("3.Silla de ruedas ");
        System.out.println("4.Canula ");
        System.out.println("5.Cuello Ortopedico ");
        System.out.println("6.Glucometro ");
        System.out.println("7.MediasComprension ");
        System.out.println("8.Muletas ");

    }

    public void mostrarMenuVentaAlquilerProducto() {
        System.out.println("1.Vender");
        System.out.println("2.Alquiltar");
    }

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

    public double pedirprecio() {
        double precio = 0;
        boolean verificarPrecio = false;
        do {
            try {
                System.out.println("Ingrese precio del producto");
                precio = sc.nextDouble();
                verificarPrecio = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un dato valido(solo numeros)");
                sc.nextLine();
            }
        } while (!verificarPrecio);
        return precio;
    }

    public int pedirCantidad() {
        int cantidad = 0;
        boolean verificarCantidad = false;
        do {
            try {
                System.out.println("Ingrese la cantidad del producto");
                cantidad = sc.nextInt();
                verificarCantidad = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un dato valido(solo numeros)");
                sc.nextLine();
            }
        } while (!verificarCantidad);
        return cantidad;
    }

    public long pedirCodigo() {
        long codigo = 0;
        boolean verificarCodigo = false;
        do {
            try {
                System.out.println("Ingrese el codigo del producto");
                codigo = sc.nextLong();
                verificarCodigo = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un dato valido(solo numeros)");
                sc.nextLine();
            }
        } while (!verificarCodigo);
        return codigo;
    }

    public String pedirDescripcion() {
        String descripcion = "";
        System.out.println("Ingrese la descripcion del producto");
        descripcion = sc.next();
        return descripcion;
    }

    public String pedirMarca() {
        String marca = "";
        System.out.println("Ingrese la marca del producto");
        marca = sc.next();
        return marca;
    }

    public String pedirMaterial() {
        String material = "";
        System.out.println("Ingrese el material del producto");
        material = sc.next();
        return material;
    }

    public boolean esAjustable() {
        String esONoAjustableString = "";
        boolean esONoAjustableBoolean = false;
        boolean verificarBoolean = false;
        do {
            try {
                System.out.print("Por favor, introduce 'si' o 'no' es ajustable: ");
                esONoAjustableString = sc.next().toLowerCase();
                if (esONoAjustableString.equals("si")) {
                    esONoAjustableBoolean = true;
                    verificarBoolean = true;
                } else if (esONoAjustableString.equals("no")) {
                    esONoAjustableBoolean = false;
                    verificarBoolean = true;
                } else {
                    throw new IllegalArgumentException("Por favor, introduce solo 'si' o 'no'.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!verificarBoolean);
        return esONoAjustableBoolean;

    }

    public double pedirprecioPorDia() {
        double precioPorDia = 0;
        boolean verificarPrecioPorDia = false;
        do {
            try {
                System.out.println("Ingrese precio por dia del producto");
                precioPorDia = sc.nextDouble();
                verificarPrecioPorDia = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un dato valido(solo numeros)");
                sc.nextLine();
            }
        } while (!verificarPrecioPorDia);
        return precioPorDia;
    }

    public int pedirLongitud() {
        int longitud = 0;
        boolean verificarLongitud = false;
        do {
            try {
                System.out.println("Ingrese la longitud del producto");
                longitud = sc.nextInt();
                verificarLongitud = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un dato valido(solo numeros)");
                sc.nextLine();
            }
        } while (!verificarLongitud);
        return longitud;
    }

    public boolean esElectrica() {
        String esONoElectricaString = "";
        boolean esONoElectricaBoolean = false;
        boolean verificarBoolean = false;
        do {
            try {

                System.out.print("Por favor, introduce 'si' o 'no' es electrica: ");
                esONoElectricaString = sc.next().toLowerCase();
                if (esONoElectricaString.equals("si")) {
                    esONoElectricaBoolean = true;
                    verificarBoolean = true;
                } else if (esONoElectricaString.equals("no")) {
                    esONoElectricaBoolean = false;
                    verificarBoolean = true;
                } else {
                    throw new IllegalArgumentException("Por favor, introduce solo 'si' o 'no'.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!verificarBoolean);
        return esONoElectricaBoolean;

    }

    public int pedirTamano() {
        int tamano = 0;
        boolean verificarTamano = false;
        do {
            try {
                System.out.println("Ingrese la tamaño del producto");
                tamano = sc.nextInt();
                verificarTamano = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un dato valido(solo numeros)");
                sc.nextLine();
            }
        } while (!verificarTamano);
        return tamano;
    }

    public String pedirTipo() {
        String tipo = "";
        System.out.println("Ingrese el tipo del producto");
        tipo = sc.next();
        return tipo;
    }

    public String pedirSoporte() {
        String soporte = "";
        System.out.println("Ingrese el soporte del producto");
        soporte = sc.next();
        return soporte;
    }

    public String pedirModelo() {
        String modelo = "";
        System.out.println("Ingrese el modelo del producto");
        modelo = sc.next();
        return modelo;
    }

    public String pedirFuenteDeEnergia() {
        String fuenteDeEnergia = "";
        System.out.println("Ingrese la fuente de energia del producto");
        fuenteDeEnergia = sc.next();
        return fuenteDeEnergia;
    }

    public void menuProveedor() {
        System.out.println("Menu Proveedor");
        System.out.println("1.Registrar Proveedor");
        System.out.println("2.Buscar  ProveedorPr ");
    }

}