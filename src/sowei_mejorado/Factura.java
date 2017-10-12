/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sowei_mejorado;

import java.util.Random;

/**
 *
 * @author ESTUDIANTE
 */
public class Factura {

    int Factura = 0;
    int Precio = 0;
    double Descuento = 0;
    double Total_pagar = 0;

    Random R = new Random();
    
    
    
    

    public void imprimirFactura() {

        Menu ObjIngredientes = new Menu();
        ObjIngredientes.SolicitarIngredientes();

        Cliente Objdatoscliente = new Cliente();
        Objdatoscliente.SolicitarDatosCliente();

        Factura = R.nextInt(901);
        
        
        if (ObjIngredientes.Tipo_de_pan == 1 && ObjIngredientes.Tipo_Carne == 1 && ObjIngredientes.Tipo_Acompanante == 1) {

            Precio = 8550;
        } else if (ObjIngredientes.Tipo_de_pan == 1 && ObjIngredientes.Tipo_Carne == 3 && ObjIngredientes.Tipo_Acompanante == 2) {

            Precio = 11000;
        } else {
            Precio = 10800;
        }
        
        if (Objdatoscliente.Edad_cliente >= 65) {
            Descuento = (Precio * 2) / 100;
        }
        
        Total_pagar = Precio - Descuento;

        //Se muestra por pantalla los datos de la factura segun lo que el usuario pidio
        System.out.println("Generando Factura...\n");
        System.out.println("=========================================================================");
        System.out.println("\t\t\t\t\t\tFactura Número " + Factura);
        System.out.println("\t\t\tSOWEI MEDELLIN\n");
        System.out.println("PEDIDO CLIENTE: " + Objdatoscliente.Cliente + "\n");
        System.out.println(ObjIngredientes.Pan_texto + "\t\t" + ObjIngredientes.Carne_texto + "\t\t" + ObjIngredientes.Acompanante_texto + "\t\t$" + Precio);
        System.out.println("\t\t\tDescuento (2%)\t\t\t\t$" + Descuento);
        System.out.println("TOTAL A PAGAR................................................." + Total_pagar);
        System.out.println("=========================================================================");

    }

}
