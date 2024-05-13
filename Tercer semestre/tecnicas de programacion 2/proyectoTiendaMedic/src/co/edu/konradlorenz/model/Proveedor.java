package co.edu.konradlorenz.model;

public class Proveedor extends Persona {
    private String empresa;
    private long codigoProveedor;

    public Proveedor() {
        super();
    }

    public Proveedor(String nombre, String apellido, long telefono, String email, long id, String direccion) {
        super(nombre, apellido, telefono, email, id, direccion);

    }

    public Proveedor(String nombre, String apellido, long telefono, String email, long id, String direccion,
            String empresa, long codigoProveedor) {
        super(nombre, apellido, telefono, email, id, direccion);
        this.empresa = empresa;
        this.codigoProveedor = codigoProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(long codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    @Override
    public String toString() {
        return "Proveedor [empresa=" + empresa + ", codigoProveedor=" + codigoProveedor + "]";
    }

}
