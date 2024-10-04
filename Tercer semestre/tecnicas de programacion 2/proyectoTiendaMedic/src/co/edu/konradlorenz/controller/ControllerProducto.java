package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.excepciones.ProveedorNoExisteExcepcion;
import co.edu.konradlorenz.model.excepciones.ProveedorYaExisteExcepcion;
import co.edu.konradlorenz.model.personas.Proveedor;
import co.edu.konradlorenz.model.productosAlquiler.Caminadora;
import co.edu.konradlorenz.model.productosAlquiler.Muletas;
import co.edu.konradlorenz.model.productosAlquiler.SillaDeRuedas;
import co.edu.konradlorenz.model.productosSoloVenta.Canula;
import co.edu.konradlorenz.model.productosSoloVenta.CuelloOrtopedico;
import co.edu.konradlorenz.model.productosSoloVenta.Glucometro;
import co.edu.konradlorenz.model.productosSoloVenta.MediasCompresion;
import co.edu.konradlorenz.model.productosSoloVenta.SillaDucha;
import co.edu.konradlorenz.view.ViewPersona;
import co.edu.konradlorenz.view.ViewProducto;

class ControllerProducto {

    ArrayList<Proveedor> proveedores = new ArrayList<>();
    ArrayList<Producto> productos = new ArrayList<>();

    ViewProducto viewProducto = new ViewProducto();
    ViewPersona viewPersona = new ViewPersona();
ControllerProveedor controllerProveedor= new ControllerProveedor();

    public void agregarProducto() {
        int opcion = -1;
        while (opcion != 0) {
            viewProducto.mostrarMenuProductos();
            opcion = viewProducto.ingresarOpcion();
            registrarProductos();
            switch (opcion) {
                case 1:
                    int opcion2 = -1;
                    while (opcion2 != 0) {
                        viewProducto.menuProveedor();
                        opcion2 = viewProducto.ingresarOpcion();
                        switch (opcion2) {
                            case 1:
                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();
                                    controllerProveedor.registrarProveedor(proveedor);
                                    productos.add(
                                            new Caminadora(viewProducto.pedirprecio(), viewProducto.pedirCantidad(),
                                                    viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                                    viewProducto.pedirMarca(),
                                                    true, proveedor, viewProducto.pedirMaterial(),
                                                    viewProducto.esAjustable(),
                                                    viewProducto.pedirprecioPorDia()));
                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }

                                break;
                            case 2:
                                try {

                                    productos.add(new Caminadora(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            true, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.esAjustable(),
                                            viewProducto.pedirprecioPorDia()));
                                    break;
                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                            case 0:
                                viewProducto.mostrarMensaje("Ninguna caso");
                            default:

                                break;
                        }
                    }
                    break;
                case 2:

                    int opcion3 = -1;

                    while (opcion3 != 0) {
                        viewProducto.menuProveedor();
                        opcion3 = viewProducto.ingresarOpcion();
                        switch (opcion3) {

                            case 1:
                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();

                                    controllerProveedor.registrarProveedor(proveedor);
                                    viewProducto.mostrarMensaje("Proveedor");
                                    productos.add(new Muletas(viewProducto.pedirprecio(), viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            true, proveedor, viewProducto.pedirLongitud(),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.esAjustable(), viewProducto.pedirprecioPorDia()));

                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }

                                break;
                            case 2:
                                try {

                                    productos.add(new Muletas(viewProducto.pedirprecio(), viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            true, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.pedirLongitud(),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.esAjustable(), viewProducto.pedirprecioPorDia()));
                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }

                                break;
                            default:
                                viewProducto.mostrarMensaje("Caso no valido");
                                break;
                        }
                    }

                    break;
                case 3:
                    int opcion4 = -1;
                    while (opcion4 != 0) {
                        viewProducto.menuProveedor();
                        opcion4 = viewProducto.ingresarOpcion();
                        switch (opcion4) {
                            case 1:

                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();
                                    controllerProveedor.registrarProveedor(proveedor);
                                    productos.add(new SillaDeRuedas(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            true, proveedor, viewProducto.esElectrica(),
                                            viewProducto.pedirprecioPorDia()));

                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                            case 2:
                                try {
                                    productos.add(new SillaDeRuedas(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            true, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.esElectrica(),
                                            viewProducto.pedirprecioPorDia()));

                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;

                            default:

                                break;
                        }
                    }

                    break;
                case 4:
                    int opcion5 = -1;
                    while (opcion5 != 0) {
                        viewProducto.menuProveedor();
                        opcion5 = viewProducto.ingresarOpcion();
                        switch (opcion5) {
                            case 1:

                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();
                                    controllerProveedor.registrarProveedor(proveedor);
                                    productos.add(new Canula(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, proveedor, viewProducto.pedirTamano(),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.pedirTipo()));

                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }

                                break;
                            case 2:
                                try {
                                    productos.add(new Canula(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.pedirTamano(),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.pedirTipo()));

                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }

                                break;

                            default:
                                viewProducto.mostrarMensaje("Caso no valido");
                                break;
                        }
                    }

                    break;
                case 5:
                    int opcion6 = -1;
                    while (opcion6 != 0) {
                        viewProducto.menuProveedor();
                        opcion6 = viewProducto.ingresarOpcion();
                        switch (opcion6) {
                            case 1:

                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();
                                    controllerProveedor.registrarProveedor(proveedor);
                                    productos.add(new CuelloOrtopedico(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, proveedor, viewProducto.pedirTamano(),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.pedirSoporte()));

                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }

                                break;
                            case 2:
                                try {
                                    productos.add(new CuelloOrtopedico(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.pedirTamano(),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.pedirSoporte()));

                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;
                            default:
                                break;
                        }
                    }

                    break;
                case 6:

                    int opcion7 = -1;
                    while (opcion7 != 0) {
                        viewProducto.menuProveedor();
                        opcion7 = viewProducto.ingresarOpcion();
                        switch (opcion7) {
                            case 1:
                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();
                                    controllerProveedor.registrarProveedor(proveedor);
                                    productos.add(new Glucometro(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, proveedor, viewProducto.pedirModelo(),
                                            viewProducto.pedirFuenteDeEnergia()));
                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {
                                    productos.add(new Glucometro(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.pedirModelo(),
                                            viewProducto.pedirFuenteDeEnergia()));
                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;
                            default:
                                break;
                        }
                    }

                    break;
                case 7:
                    int opcion8 = -1;
                    while (opcion8 != 0) {
                        viewProducto.menuProveedor();
                        opcion8 = viewProducto.ingresarOpcion();
                        switch (opcion8) {
                            case 1:
                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();
                                    controllerProveedor.registrarProveedor(proveedor);
                                    productos.add(new MediasCompresion(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, proveedor, viewProducto.pedirTamano(),
                                            viewProducto.pedirTipo(),
                                            viewProducto.pedirLongitud()));
                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {

                                    productos.add(new MediasCompresion(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.pedirTamano(),
                                            viewProducto.pedirTipo(),
                                            viewProducto.pedirLongitud()));

                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 8:
                    int opcion9 = -1;
                    while (opcion9 != 0) {
                        viewProducto.menuProveedor();
                        opcion8 = viewProducto.ingresarOpcion();
                        switch (opcion9) {
                            case 1:
                                try {
                                    Proveedor proveedor = controllerProveedor.crearProveedor();
                                    controllerProveedor.registrarProveedor(proveedor);
                                    productos.add(new SillaDucha(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, proveedor, viewProducto.pedirMaterial(), viewProducto.pedirTipo(),
                                            viewProducto.pedirPesoSoportado()));
                                } catch (ProveedorYaExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {
                                    productos.add(new SillaDucha(viewProducto.pedirprecio(),
                                            viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            false, controllerProveedor.buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                            viewProducto.pedirMaterial(), viewProducto.pedirTipo(),
                                            viewProducto.pedirPesoSoportado()));

                                } catch (ProveedorNoExisteExcepcion e) {
                                    viewProducto.mostrarMensaje(e.getMessage());
                                    e.printStackTrace();
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

    

    public String hallarTipoProducto(Producto producto) {
        String tipoProducto = "";
        for (Producto producto2 : productos) {
            if (producto2 instanceof Canula) {
                tipoProducto = "Canula";
            } else if (producto2 instanceof CuelloOrtopedico) {
                tipoProducto = " Cuello Orto pedico";
            } else if (producto2 instanceof Glucometro) {
                tipoProducto = "Glucometro";
            } else if (producto2 instanceof MediasCompresion) {
                tipoProducto = " Medias Compresion";
            } else if (producto2 instanceof SillaDucha) {
                tipoProducto = "SillaDucha";
            } else if (producto2 instanceof Caminadora) {
                tipoProducto = " Caminadora";
            } else if (producto2 instanceof Muletas) {
                tipoProducto = "Muletas";
            } else if (producto2 instanceof SillaDeRuedas) {
                tipoProducto = "Silla de ruedas";
            }
        }
        return tipoProducto;
    }

    public void registrarProductos() {

        Proveedor proveedor = new Proveedor("samuel", "Monsalve", 123, "proveedor@gmail.com", 123, "mi casa",
                "copetrol", 132);
        proveedores.add(proveedor);
    }

}