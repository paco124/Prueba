package Clases_Comprobante;

import Clases_Clientes.Cliente;


public class Producto {
    private int codigo_prod;
    private String descripcion;
    public double precio;

    public Producto(int codigo_prod, String descripcion, double precio) {
        this.codigo_prod = codigo_prod;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(int codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPresio() {
        return precio;
    }

    public void setPresio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo_prod=" + codigo_prod + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
}
