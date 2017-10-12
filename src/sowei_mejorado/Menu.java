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
public class Menu {

    int Tipo_de_pan = 0;
    int Tipo_Carne = 0;
    int Tipo_Acompanante = 0;

    String Pan_texto = " ";
    String Carne_texto = " ";
    String Acompanante_texto = " ";

    Scanner Sc = new Scanner(System.in);

    public void SolicitarIngredientes() {

        System.out.println("********************SOWEI********************");

        do {
            System.out.println("=============================================");
            System.out.println("TIPO DE PAN. Escriba el numero del producto con el teclado");
            System.out.println("=============================================");
            System.out.println("1. Pan tradicional\n");
            System.out.println("2. Pan con oregano\n");
            Tipo_de_pan = Sc.nextInt();
            if (Tipo_de_pan == 1) {
                Pan_texto = "Pan tradicional";
            } else if (Tipo_de_pan == 2) {
                Pan_texto = "Pan con oregano";
            } else {
                System.out.println("Opcion no valida");
            }

        } while (Tipo_de_pan > 2 || Tipo_de_pan < 1);

        do {

            System.out.println("=============================================");
            System.out.println("CARNE. Escriba el numero del producto con el teclado");
            System.out.println("=============================================");
            System.out.println("1. Jamón\n");
            System.out.println("2. Pollo\n");
            System.out.println("3. Pavo\n");
            Tipo_Carne = Sc.nextInt();

            if (Tipo_Carne == 1) {
                Carne_texto = "Jamón";
            } else if (Tipo_Carne == 2) {

                Carne_texto = "Pollo";
            } else if (Tipo_Carne == 3) {
                Carne_texto = "Pavo";
            } else {
                System.out.println("Opcion no valida");
           
            }
        } while (Tipo_Carne > 3 || Tipo_Carne < 1);

        do {

            System.out.println("=============================================");
            System.out.println("ACOMPAÑANTE. Escriba el numero del producto con el teclado.");
            System.out.println("=============================================");
            System.out.println("1. Queso\n");
            System.out.println("2. Mayonesa\n");
            System.out.println("3. Verduras\n");
            Tipo_Acompanante = Sc.nextInt();

            if (Tipo_Acompanante == 1) {
                Acompanante_texto = "Queso";
            } else if (Tipo_Acompanante == 2) {
                Acompanante_texto = "Mayonesa";
            } else if (Tipo_Acompanante == 3) {
                Acompanante_texto = "Verduras";
            } else {
                System.out.println("Opcion no valida");
            }
        } while (Tipo_Acompanante > 3 || Tipo_Acompanante < 1);

    }

}
