package Clases_Clientes;

public class ClientePreferente extends TiposCliente{
    
    private int codigo;
    private String razonSocial;
    
    @Override
    public double DescuentoTipoCliente() {
        return descuento;
    }

    public ClientePreferente(int codigo, String razonSocial, double descuento) {
        super(descuento);
        this.codigo = codigo;
        this.razonSocial = razonSocial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}
