/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Linea;
import Clases.Triangulo;

/**
 *
 * @author Admin
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo("Rojo",4);
        Linea l = new Linea("Azul", 10);
        Triangulo t = new Triangulo(20, 8, 10, "Amarillo");
        Cuadrado q = new Cuadrado(3, 6, "Azul");
        c.Dibujar();
        System.out.println("El Radio del circulo es: "+c.getRadio());
        l.Dibujar();
        t.Dibujar();
        System.out.println(t.CalcularArea());
        q.Dibujar();
        System.out.println(q.CalcularArea());
        
        
        
    }
    
}
