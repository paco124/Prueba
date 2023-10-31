package Productos;

import Clases_Comprobante.Producto;


public class JUMEX extends Producto{
    private double descuento =0.7;
    public JUMEX() {
        super(1, "JUMEX", 10);
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio - (precio*descuento);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
