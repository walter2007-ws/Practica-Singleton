/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

/**
 *
 * @author Admin
 */
public class ConfiguracionApp {
    private static ConfiguracionApp instancia;
    private String idioma;
    private String tema;

    private ConfiguracionApp() {
    }
    
    public static ConfiguracionApp getInstancia(){       
        if(instancia==null){
            instancia= new ConfiguracionApp();
        }
        return instancia;
    }
    public void registrarIdioma(String lenguaje){
        idioma=lenguaje;
        System.out.println("Idioma registrado");
    }
    public void registrarTema(String temas){
        tema=temas;
        System.out.println("Tema registrado");
    }
    public String getIdioma() {
        return idioma;
    }

    public String getTema() {
        return tema;
    }
    
    

    
    
}
