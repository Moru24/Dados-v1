/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dadooop;

import java.util.Scanner;

/**
 *
 * @author quete
 */
public class DadoOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        boolean conmutador = false;

        System.out.println("Vamos a tirar dados y a darte sus resultados" + " escoge cuantos vas a tirar");
        dadoOOPobjeto[] arrayDados = new dadoOOPobjeto[sc.nextInt()];

        for (int i = 0; i < arrayDados.length; i++) {
            arrayDados[i] = new dadoOOPobjeto(i);
            do {
                System.out.println("Escoge el numero de caras  del dado " + (i + 1) + " (recuerda que debe ser par)");
                arrayDados[i] = new dadoOOPobjeto(sc.nextInt());
                if (arrayDados[i].numeroCaras % 2 != 0 ||arrayDados[i].numeroCaras<=0 ) {
                    System.out.println("El numero no es par");
                    conmutador = false;
                }
                if (arrayDados[i].numeroCaras % 2 == 0) {
                    System.out.println("Numero de caras  del dado " + (i + 1) + " guardado");

                    conmutador = true;
                }
            } while (conmutador == false);

        }
        for (int l = 0; l < arrayDados.length; l++) {
            arrayDados[l].Tirar();
            System.out.println("--------------------------------------------------------------");

        }
        arrayDados[arrayDados.length-1].tiradaTotal();

    }

}
