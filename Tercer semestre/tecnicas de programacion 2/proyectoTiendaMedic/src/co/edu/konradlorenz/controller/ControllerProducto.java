package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.Producto;
import co.edu.konradlorenz.model.Proveedor;
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
    ArrayList<Producto> productosAComprar = new ArrayList<>();
    ViewProducto viewProducto = new ViewProducto();
    ViewPersona viewPersona = new ViewPersona();

    public void agregarProducto() {
        int opcion = -1;
        while (opcion != 0) {
            viewProducto.mostrarMenuProductos();
            opcion = viewProducto.ingresarOpcion();

            switch (opcion) {
                case 1:
                    int opcion2 = -1;
                    while (opcion2 != 0) {
                        viewProducto.menuProveedor();
                        opcion2 = viewProducto.ingresarOpcion();
                        switch (opcion2) {
                            case 1:

                                productos.add(new Caminadora(viewProducto.pedirprecio(), viewProducto.pedirCantidad(),
                                        viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                        viewProducto.pedirMarca(),
                                        true, crearProveedor(), viewProducto.pedirMaterial(),
                                        viewProducto.esAjustable(),
                                        viewProducto.pedirprecioPorDia()));
                                break;
                            case 2:
                                productos.add(new Caminadora(viewProducto.pedirprecio(), viewProducto.pedirCantidad(),
                                        viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                        viewProducto.pedirMarca(),
                                        true, buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                        viewProducto.pedirMaterial(),
                                        viewProducto.esAjustable(),
                                        viewProducto.pedirprecioPorDia()));
                                break;

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

                                Proveedor proveedor = crearProveedor();
                                if (!registrarProveedor(proveedor)) {
                                    System.out.println("ya existe");
                                } else {
                                    registrarProveedor(proveedor);
                                    productos.add(new Muletas(viewProducto.pedirprecio(), viewProducto.pedirCantidad(),
                                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                            viewProducto.pedirMarca(),
                                            true, proveedor, viewProducto.pedirLongitud(),
                                            viewProducto.pedirMaterial(),
                                            viewProducto.esAjustable(), viewProducto.pedirprecioPorDia()));

                                }

                                break;
                            case 2:

                                productos.add(new Muletas(viewProducto.pedirprecio(), viewProducto.pedirCantidad(),
                                        viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                        viewProducto.pedirMarca(),
                                        true, buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                        viewProducto.pedirLongitud(),
                                        viewProducto.pedirMaterial(),
                                        viewProducto.esAjustable(), viewProducto.pedirprecioPorDia()));
                                break;
                            default:
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

                                productos.add(new SillaDeRuedas(viewProducto.pedirprecio(),
                                        viewProducto.pedirCantidad(),
                                        viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                        viewProducto.pedirMarca(),
                                        true, crearProveedor(), viewProducto.esElectrica(),
                                        viewProducto.pedirprecioPorDia()));
                                break;
                            case 2:
                                productos.add(new SillaDeRuedas(viewProducto.pedirprecio(),
                                        viewProducto.pedirCantidad(),
                                        viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(),
                                        viewProducto.pedirMarca(),
                                        true, buscarProveedorExistente(viewPersona.ingresarCodigoProveedor()),
                                        viewProducto.esElectrica(),
                                        viewProducto.pedirprecioPorDia()));
                                break;

                            default:
                                break;
                        }
                    }

                    break;
                case 4:
                    Canula canula = new Canula(viewProducto.pedirprecio(),
                            viewProducto.pedirCantidad(),
                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(), viewProducto.pedirMarca(),
                            false, crearProveedor(), viewProducto.pedirTamano(), viewProducto.pedirMaterial(),
                            viewProducto.pedirTipo());
                    productos.add(canula);
                    break;
                case 5:
                    CuelloOrtopedico cuelloOrtopedico = new CuelloOrtopedico(viewProducto.pedirprecio(),
                            viewProducto.pedirCantidad(),
                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(), viewProducto.pedirMarca(),
                            false, crearProveedor(), viewProducto.pedirTamano(), viewProducto.pedirMaterial(),
                            viewProducto.pedirSoporte());
                    productos.add(cuelloOrtopedico);

                    break;
                case 6:
                    Glucometro glucometro = new Glucometro(viewProducto.pedirprecio(),
                            viewProducto.pedirCantidad(),
                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(), viewProducto.pedirMarca(),
                            false, crearProveedor(), viewProducto.pedirModelo(),
                            viewProducto.pedirFuenteDeEnergia());
                    productos.add(glucometro);
                    break;
                case 7:
                    MediasCompresion mediasCompresion = new MediasCompresion(viewProducto.pedirprecio(),
                            viewProducto.pedirCantidad(),
                            viewProducto.pedirCodigo(), viewProducto.pedirDescripcion(), viewProducto.pedirMarca(),
                            false, crearProveedor(), viewProducto.pedirTamano(), viewProducto.pedirTipo(),
                            viewProducto.pedirLongitud());
                    productos.add(mediasCompresion);
                    break;
                case 8:

                    break;
                default:
                    break;
            }
        }
    }

    public void casosVenderAlquilarProducto() {
        int opcion = -1;
        while (opcion != 0) {
            viewProducto.mostrarMenuVentaAlquilerProducto();
            opcion = viewProducto.ingresarOpcion();
            switch (opcion) {
                case 1:

                    break;

                default:
                    break;
            }
        }
    }

    public Proveedor crearProveedor() {
        Proveedor proveedor = new Proveedor(viewPersona.ingresarNombre(), viewPersona.ingresarApellido(),
                viewPersona.ingresarNumeroTelefono(), viewPersona.ingresarEmail(), viewPersona.ingresarId(),
                viewPersona.ingresarDireccion(), viewPersona.ingresarNombreEmpresa(),
                viewPersona.ingresarCodigoEmpleado());

        return proveedor;
    }

    public boolean registrarProveedor(Proveedor proveedor) {
        boolean existProveedor1 = false;
        boolean existProveedor2 = false;
        boolean existProveedor3 = false;
        for (Proveedor proveedor1 : proveedores) {

            if (proveedor1.getCodigoProveedor() == proveedor.getCodigoProveedor()) {
                existProveedor1 = true;

            }
            if (proveedor1.getEmail().equals(proveedor.getEmail())) {
                existProveedor2 = true;
            }

            if (proveedor1.getId() == proveedor.getId()) {
                existProveedor3 = true;
            }
            if ((existProveedor1 && existProveedor2) && existProveedor3) {
                return false;
            } else {
                proveedores.add(proveedor);
                return true;
            }

        }
        return false;
    }

    public Proveedor buscarProveedorExistente(long codigoProveedor) {
        Proveedor proveedorBuscado = null;
        try {

        } catch (Exception e) {
            // TODO: handle exception
        }

        for (Proveedor proveedor : proveedores) {
            if (proveedor.getCodigoProveedor() == codigoProveedor) {
                proveedorBuscado = proveedor;
            }
        }
        return proveedorBuscado;
    }

    public Producto venderProducto(long codigo) {
        Producto procuctoAVender = null;
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                procuctoAVender = producto;
            }
        }
        // procuctoAVender.calcularPrecioTotal();
        return procuctoAVender;
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
    }

}