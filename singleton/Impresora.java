/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author Admin
 */
public class Impresora {
    private int totalImpresiones;
    private static Impresora instancia;

    private Impresora() {
        System.out.println("Impresora encendida");
    }
    
    public static Impresora getIntancia(){
        if(instancia==null){
            instancia= new Impresora();
        }
        return instancia;
        
    }
    public void imprimir(String documento){
        totalImpresiones++;
        System.out.println("Documento Impreso: " + documento);
    }
    public int getTotalImpresiones(){
        return totalImpresiones;
    }
}
