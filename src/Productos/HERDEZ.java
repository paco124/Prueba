package Productos;
import Clases_Comprobante.Producto;


public class HERDEZ extends Producto{
    private double descuento =0.6; 
    public HERDEZ() {
        super(2, "HERDEZ", 20);
    }

    public double getPrecio() {
        return precio - (precio*descuento);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
