/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Admin
 */


public class Linea extends Formas{
    int Largo;

    public Linea(String color,int Largo) {
         setColor(color);
         setForma("Linea");
                
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }
    
    
}
