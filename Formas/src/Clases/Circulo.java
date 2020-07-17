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


public class Circulo extends Formas{
    private double Radio;
    private int diametro;
    
    public Circulo( String color,int diametro) {
        this.diametro=diametro;
        this.setRadio();
        setForma("Circulo");
        setColor(color);
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio() {
        this.Radio = CalcularRadio();
    }

   private double CalcularRadio(){
       return 0.5*diametro;
       
   }
    
}
