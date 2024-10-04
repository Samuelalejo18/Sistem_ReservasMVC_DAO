package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.excepciones.ProveedorNoExisteExcepcion;
import co.edu.konradlorenz.model.excepciones.ProveedorYaExisteExcepcion;
import co.edu.konradlorenz.model.personas.Proveedor;
import co.edu.konradlorenz.view.ViewPersona;

public class ControllerProveedor {
    ArrayList<Proveedor> proveedores = new ArrayList<>();
    ViewPersona viewPersona = new ViewPersona();

    public Proveedor crearProveedor() {
        Proveedor proveedor = new Proveedor(viewPersona.ingresarNombre(), viewPersona.ingresarApellido(),
                viewPersona.ingresarNumeroTelefono(), viewPersona.ingresarEmail(), viewPersona.ingresarId(),
                viewPersona.ingresarDireccion(), viewPersona.ingresarNombreEmpresa(),
                viewPersona.ingresarCodigoEmpleado());

        return proveedor;
    }

    public boolean registrarProveedor(Proveedor proveedor) throws ProveedorYaExisteExcepcion {
        boolean existProveedor1 = false;
        boolean existProveedor2 = false;
        boolean existProveedor3 = false;
        for (Proveedor proveedor1 : proveedores) {

            if (proveedor1.getCodigoProveedor() == proveedor.getCodigoProveedor()) {
                throw new ProveedorYaExisteExcepcion("El codigo del empleado ya existe");

            }
            if (proveedor1.getEmail().equals(proveedor.getEmail())) {
                throw new ProveedorYaExisteExcepcion("El correo ya existe");

            }

            if (proveedor1.getId() == proveedor.getId()) {
                throw new ProveedorYaExisteExcepcion("El id ya existe");

            }
            if ((existProveedor1 && existProveedor2) && existProveedor3) {
                throw new ProveedorYaExisteExcepcion("El proveedor ya esta registrado");

            } else {
                proveedores.add(proveedor);
                return true;
            }

        }
        return false;
    }

    public Proveedor buscarProveedorExistente(long codigoProveedor) throws ProveedorNoExisteExcepcion {
        Proveedor proveedorBuscado = null;
        boolean proveedorEncontrado = false;

        for (Proveedor proveedor : proveedores) {
            if (proveedor.getCodigoProveedor() == codigoProveedor) {
                proveedorBuscado = proveedor;
                proveedorEncontrado = true;
            }
        }
        if (!proveedorEncontrado) {
            throw new ProveedorNoExisteExcepcion("Proveedor no encontrado");

        }
        return proveedorBuscado;
    }

}
