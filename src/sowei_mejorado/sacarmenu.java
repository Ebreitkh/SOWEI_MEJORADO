/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sowei_mejorado;

import java.util.Scanner;

/**
 *
 * @author Beth
 */
public class sacarmenu {
    
    public void sacarMenu() {

        Scanner Sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("\t\tBIENVENIDO\t\t");
        System.out.println("=============================================\n");
        System.out.println("Elija la opcion de lo que desea realizar\n");

        System.out.println("1. Realizar pedido");
        System.out.println("2. salir del sistema");

        int opcion = Sc.nextInt();

        while (opcion==1)
        {

            Factura objimprimir = new Factura();
            objimprimir.imprimirFactura();

            System.out.println("Elija la opcion de lo que desea realizar\n");

            System.out.println("1. Realizar pedido");
            System.out.println("2. salir del sistema");

            opcion = Sc.nextInt();

        }
        System.exit(0);
    }
    
}
