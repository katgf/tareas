/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte1;

import parte2.ElSalvador;
import parte2.Guatemala;
import parte2.Honduras;

/**
 *
 * @author Admin
 */
public class Tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**********************Parte 1****************************/
        Ciudadano citizen1 = new Ciudadano(); 
        Ciudadano citizen2 = new Ciudadano(24,"Gilberto Rodriguez", 4); 
    
        citizen1.setEdad(30);
        citizen1.setNombre("Martha Caceres");
        citizen1.setExperiencia(8);  
            
        
        System.out.println("Informacion de Ciudadano 1 es: Nombre -> "+citizen1.getNombre()+", Edad -> "+citizen1.getEdad()+", Experiencia -> "+citizen1.getExperiencia());
        System.out.println("Informacion de Ciudadano 2 es: Nombre -> "+citizen2.getNombre()+", Edad -> "+citizen2.getEdad()+", Experiencia -> "+citizen2.getExperiencia());

      
        
        
        /************************Parte 2***********************************/
        Honduras hn = new Honduras();
        Guatemala gt = new Guatemala();
        ElSalvador es = new ElSalvador();
        
        System.out.println(" El pais es : " + hn.getPais()+", y su presidente se llama: "+hn.getPresidente());
        System.out.println(" El pais es : " + gt.getPais()+", y su presidente se llama: "+gt.getPresidente());
        System.out.println(" El pais es : " + es.getPais()+", y su presidente se llama: "+es.getPresidente());
    }
    
}
