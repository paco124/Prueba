package primer_examen_diseño;

import Clases_Clientes.*;
import Clases_Comprobante.*;


public class Primer_Examen_Diseño {

    
    public static void main(String[] args) {
        Fabrica_Cliente_Preferente fabrica = new Fabrica_Cliente_Preferente();
        
        Producto p1= fabrica.getProducto(0, "JUMEX", 0);
        Producto p2= fabrica.getProducto(0, "HERDEZ", 0);
        Producto p3 = fabrica.getProducto(5,"LECHUGA",20);
        
        Producto c1 = new Producto(3,"COCA",15);
        Producto c2 = new Producto(4,"GALLETAS",16);
        
        
        Fecha f1 = new Fecha(19,9,2023);
        Comprobante comp1 = new Comprobante('A',1,f1);
        Comprobante comp2 = new Comprobante('B',2,f1);
        
        Cliente cli1 = new Cliente("MELF","FRANCISCO",0.2);
        ClientePreferente cliP1 = new ClientePreferente(1,"Razon Social",0.4);
        
        Factura fac1 = new Factura(comp1.getTipo(),comp1.getNumero(),f1,cli1);
        fac1.agregarProducto(c1);
        fac1.agregarProducto(c2);
        
        Factura fac2 = new Factura(comp2.getTipo(),comp2.getNumero(),f1,cliP1);
        fac2.agregarProducto(p1);
        fac2.agregarProducto(p2);
        fac2.agregarProducto(p3);
        System.out.println("Factura Cliente:");
        fac1.mostrar();
        System.out.println("Factura Cliente Preferente:");
        fac2.mostrarPreferente();
    
        
    }
    
}
