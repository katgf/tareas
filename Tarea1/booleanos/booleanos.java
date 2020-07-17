/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleanos;

/**
 *
 * @author Admin
 */
public class booleanos {
    public static void main(String[] args){
        int M=6;
        int T =1;
        int K = -10;
        
        boolean Mayorque=M>T;
        boolean division = T/K ==5;
        boolean SumaResta = (M+T ==7)|| (M-T==5);

        System.out.println("M > T es :"+ Mayorque);    
        System.out.println("T/k==5 es :"+ division);    
        System.out.println("(M+T ==7)|| (M-T==5) es :"+ SumaResta);    
    }
}
