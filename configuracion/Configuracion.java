/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package configuracion;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Configuracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ConfiguracionApp configuracion1=ConfiguracionApp.getInstancia();
        System.out.print("Ingrese el idioma al que desea configurar: ");
        String idioma=sc.nextLine();
        configuracion1.registrarIdioma(idioma);
        System.out.println("Ingrese el tema entre claro y oscuro");
        String tema=sc.nextLine();
        configuracion1.registrarTema(tema);
        System.out.println("Configuracion terminada");
        System.out.println(" ");
        System.out.println("Configuracion principal");
        System.out.println("Idioma: " + configuracion1.getIdioma());
        System.out.println("Tema: " + configuracion1.getTema());
        System.out.println("Desea ingresar una configuracion adicional? 1/si  2/no");
        int op=sc.nextInt();
        sc.nextLine();
        if(op==1){
            ConfiguracionApp configuracion2=ConfiguracionApp.getInstancia();
            System.out.print("Ingrese el idioma al que desea configurar: ");
            String idioma2=sc.nextLine();
            configuracion2.registrarIdioma(idioma2);
            System.out.println("Ingrese el tema entre claro y oscuro");
            String tema2=sc.nextLine();
            configuracion2.registrarTema(tema2);
            System.out.println("Configuracion terminada");
            System.out.println(" ");
            System.out.println("Configuracion secundaria");
            System.out.println("Idioma: " + configuracion2.getIdioma());
            System.out.println("Tema: " + configuracion2.getTema());
        }else{
            System.out.println("Gracias por usar el programa");
        }
        
       
    }
    
}
