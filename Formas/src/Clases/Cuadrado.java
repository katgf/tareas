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


public class Cuadrado extends Formas2d{
    private double Area;

    public Cuadrado(int base, int altura, String Color) {
        setBase(base);
        setAltura(altura);
        setColor(Color);
        setForma("Cuadrado");
    }

    public double getArea() {
        return Area;
    }

    public void setArea() {
        this.Area = this.CalcularArea();
    }


    @Override
    public double CalcularArea() {
        return getBase()*getAltura();
      }
    
    
}
