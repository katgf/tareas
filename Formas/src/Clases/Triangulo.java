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


public class Triangulo extends Formas2d{
    private int Angulo;

    @Override
    public double CalcularArea() {
            return (0.5*getBase())*(getAltura());
        }

    public Triangulo(int Angulo,int base,int altura,String Color) {
        setForma("Triangulo");
        setColor(Color);
        setBase(base);
        setAltura(altura);
        this.Angulo = Angulo;
    }

    public int getAngulo() {
        return Angulo;
    }

    public void setAngulo(int Angulo) {
        this.Angulo = Angulo;
    }

    
}
