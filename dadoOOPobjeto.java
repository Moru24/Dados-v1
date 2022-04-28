/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadooop;

/**
 *
 * @author quete
 */
public class dadoOOPobjeto {

    int numeroCaras;
    String tipoTirada;
    static int tirada;
    static int tiradaCritica;
    static int tiradaTotal;
    
    

    /**
     * @return the numeroCaras
     */
    dadoOOPobjeto(int caras) {
        numeroCaras = caras;
    }

    public void Tirar() {
        tirada++;
        int tirada1 = 0;
        tirada1 = (int) Math.floor(Math.random() * (numeroCaras+1-1) + 1);
        tiradaTotal+=tirada1;
        System.out.println("◙ Tu tirada del dado " + tirada + " es " + tirada1);
        this.tipoTirada(tirada1);
    }
    public void tirarCritico() {
        tiradaCritica++;
        int tirada1 = 0;
        tirada1 = (int) Math.floor(Math.random() * (numeroCaras+1-1) + 1);
        tiradaTotal+=tirada1;
        System.out.println("◙ Tu tirada del dado critico " + tiradaCritica + " es " + tirada1);
      
    }
    

    public void tipoTirada(int tirada) {
        if (tirada == numeroCaras) {
            System.out.println("◙ Ha sido critico");
            tipoTirada="critico";
            this.critico(tirada);
        }
        if (tirada == 1) {
            System.out.println("◙ Has sacado pifia!!!");

        }

    }
    public void critico(int criticoTirada){
        dadoOOPobjeto dadoCritico=new dadoOOPobjeto(this.numeroCaras);
        dadoCritico.tirarCritico();
        
    }
    
    public void tiradaTotal(){
        System.out.println("◙ Has tirado "+(tirada+tiradaCritica)+" dados de los cuales "+tiradaCritica+" han sido criticos ");
        System.out.println("◙ La suma de las tiradas es "+ tiradaTotal);
    }

}
