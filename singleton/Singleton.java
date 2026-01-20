/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author Admin
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impresora usuario1= Impresora.getIntancia();
        Impresora usuario2= Impresora.getIntancia();
        Impresora usuario3= Impresora.getIntancia();
        
        usuario1.imprimir("Deber de POO");
        usuario1.imprimir("Deber de fisica");
        usuario2.imprimir("Trabajo de Fisica");
        usuario3.imprimir("Reporte de los ceros");
        
        System.out.println("Total de impresiones: " + usuario1.getTotalImpresiones());
        System.out.println("Total de impresiones: " + usuario2.getTotalImpresiones());
    }
    
}
