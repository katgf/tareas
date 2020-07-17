/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesAritmeticas;
/**
 *
 * @author Admin
 */
public class Operaciones {
    public static void main(String[] args){
        int val1, val2;
        
        val1=22;
        val2=16;
        
        int suma = val1+val2;
        int resta = val1-val2;
        int mult = val1*val2;
        int div = val1/val2;
        int mod = val1%val2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La Multiplicación es: "+mult);
        System.out.println("La División es: "+div);
        System.out.println("El mod o residuo es: "+mod);
        
    }
    
}
