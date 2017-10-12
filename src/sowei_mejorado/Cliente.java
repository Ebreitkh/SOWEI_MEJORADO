/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sowei_mejorado;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Cliente {
    
    int Edad_cliente = 0;
    String Cliente = " ";
    Scanner Sc = new Scanner(System.in);
    
     public void SolicitarDatosCliente() {

        System.out.println(" ***Escriba el nombre del cliente*** ");
        Cliente = Sc.nextLine();

        System.out.println(" ***Escriba la edad del cliente*** ");
        Edad_cliente = Sc.nextInt();

    }
    
}
