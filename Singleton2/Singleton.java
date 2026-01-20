/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Singleton {
    
    /**
    * @param args the command line arguments
    */
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       ModuloVentas ventas= new ModuloVentas();
       ModuloFacturacion facturacion=new ModuloFacturacion();
       int op;
       double monto, montof;
       do{
           System.out.println("SISTEMA CAJA REGISTRADORA");
           System.out.println("Opcion1: Registrar Venta");
           System.out.println("Opcion2: Registrar Factura");
           System.out.println("Opcion3: Ver total ventas");
           System.out.println("Opcion4: Ver total Facturas");
           System.out.println("Opcion5: Salir");
           System.out.print("Ingrese una opcion: ");
           op=sc.nextInt();
           switch(op){
               case 1: 
                   System.out.println("Ingresar monto de la venta: ");
                   monto=sc.nextDouble(); 
                   ventas.vender(monto);
                   facturacion.facturar(monto); 
                   break;
               case 2:
                   System.out.println("Total de venta con facturacion: ");
                   montof=sc.nextDouble(); 
                   facturacion.facturar(montof); 
                   
                   break;
               case 3:
                   CajaRegistradora caja= CajaRegistradora.getInstancia();
                   System.out.println("Total acumulado en la caja sin facturacion " + caja.getTotalVentas());break;
               case 4:
                   CajaRegistradora cajaf= CajaRegistradora.getInstancia();
                   System.out.println("Total acumulado de la facturacion en la caja  " + cajaf.getTotalFacturas());break;
               case 5:
                   CajaRegistradora cajar= CajaRegistradora.getInstancia();
                   System.out.println("Total acumulado en la caja " + cajar.getTotal());break;
               case 6:
                   break;
               default:
                   System.out.println("Opcion no valida");
           }
       }while(op!=4);
       sc.close();
   } 
}
