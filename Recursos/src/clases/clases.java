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
public class clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursos r = new Recursos();
        System.out.println(r.Mensaje());
        
        System.out.println(r.Estado());
        
        System.out.println(r.Division(8, 5));
        
        int numeros[]= r.Lista(5);
        for(int x =0;x<5;x++){
            System.out.println(numeros[x]);
        }
        
    }
    
}
