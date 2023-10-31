package primer_examen_diseño;
import Clases_Comprobante.Producto;
import Productos.HERDEZ;
import Productos.JUMEX;

public class Fabrica_Cliente_Preferente {
    
    public Producto getProducto(int codigo,String nombre_producto,double precio){
        if(nombre_producto == "JUMEX"){return new JUMEX();}
        if(nombre_producto == "HERDEZ"){return new HERDEZ();}
        return new Producto(codigo,nombre_producto,precio);
    }
}
