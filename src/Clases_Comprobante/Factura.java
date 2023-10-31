package Clases_Comprobante;
import Clases_Clientes.Cliente;
import Clases_Clientes.ClientePreferente;
import java.util.ArrayList;
import java.util.List;


public class Factura extends Comprobante{
    private double total;
    private Cliente cliente;
    private ClientePreferente clientePreferente;
    private List<Producto> listaProductos = new ArrayList<>();

    public Factura(char tipo, int numero, Fecha fecha,Cliente cliente) {
        super(tipo, numero, fecha);
        this.cliente = cliente;
        
    }

    public Factura(char tipo, int numero, Fecha fecha, ClientePreferente clientePreferente) {
        super(tipo, numero, fecha);
        this.clientePreferente = clientePreferente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClientePreferente getClientePreferente() {
        return clientePreferente;
    }

    public void setClientePreferente(ClientePreferente clientePreferente) {
        this.clientePreferente = clientePreferente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void agregarProducto(Producto agregar_producto){
        listaProductos.add(agregar_producto);
    }
    public void mostrarProductos(){
        String s="Lista de Productos:\n";
        for (int i = 0; i < listaProductos.size(); i++) {
            s+="Producto: "+(i+1)+"es: "+listaProductos.get(i)+"\n";
        }
        System.out.println(s);
    }

    public void mostrar() {
        System.out.println("Factura{" + "total=" + total + ", cliente=" + cliente.toString() + ", listaProductos=" + listaProductos + '}');
    }

    
    public void mostrarPreferente() {
        System.out.println("Factura{" + "total=" + total + ", clientePreferente=" + clientePreferente.toString() + ", listaProductos=" + listaProductos + '}');
    }
    
    
    
    
}
