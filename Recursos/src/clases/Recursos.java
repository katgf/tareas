/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Admin
 */
public class Recursos {
    
    public String Mensaje(){
        return "Estoy aprendiendo, pero seré el mejor programador del mundo";
    }
    
    public String Estado(){
    int nota =80;
    String msj;
    if(nota >=70){
        msj= "Aprobado";
    }else{
        msj = "Reprobado";
    }
    return msj;
    }

    public double Division(int dividendo, int divisor){
        double result;
        if(divisor ==0){
            divisor =1;
        }
        
        result= dividendo/divisor;
        return result;
    }
    
    public int[] Lista(int fin)
    {
        int lista[]= new int[fin];
        for(int x =0;x<fin;x++){
            lista[x]=x+1;
        }
        return lista;
    }
    
}
