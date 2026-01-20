/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton2;

/**
 *
 * @author Admin
 */
public class CajaRegistradora {
    private static CajaRegistradora instancia;
    private double totalVentas;
    private double totalFacturas;

    private CajaRegistradora() {
        totalVentas=0;
        System.out.println("Caja registradora lista");
    }
    public static CajaRegistradora getInstancia(){
        if(instancia==null){
            instancia= new CajaRegistradora();
        }
        return instancia;
    }
    public void registrarVenta(double monto){
        totalFacturas = totalFacturas +monto;
        totalVentas=totalVentas+monto;
        System.out.println("Venta Registrada");        
    }
    public void registrarFactura(double monto){
        totalVentas=totalVentas+monto;
        System.out.println("Factura Registrada " + monto);        
    }
    public double getTotalVentas(){
        return totalVentas;
    }
    public double getTotalFacturas(){
        return totalFacturas;
    }  
    public double getTotal(){
        return totalFacturas + totalVentas;
    }
}
