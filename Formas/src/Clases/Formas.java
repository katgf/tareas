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
/*Clase Formas */


public class Formas {
       String forma;
    private String color;

    
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Formas() {
    }

     
    public void Dibujar(){
        System.out.println("Soy una figura llamada "+
                this.forma+ " y mi color es "+this.color);
    }
}
