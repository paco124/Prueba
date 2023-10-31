package Clases_Clientes;

public abstract class TiposCliente {
    public double descuento;

    public TiposCliente(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public abstract double DescuentoTipoCliente();
}
