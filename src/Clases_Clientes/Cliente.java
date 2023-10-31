package Clases_Clientes;


public class Cliente extends TiposCliente{
    private String rfc;
    private String nombre;

    public Cliente(String rfc, String nombre, double descuento) {
        super(descuento);
        this.rfc = rfc;
        this.nombre = nombre;
    }

    @Override
    public double DescuentoTipoCliente() {
        return descuento;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
