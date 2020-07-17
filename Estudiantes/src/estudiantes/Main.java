/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
       boolean seguir=true;
      int n=0;
      int num=0;      
      int menu=0;
      do{
          n=0;
        mensaje("menu del programa: "+
                "n1)ingresar multiplos del 3"+
                "n2)salir del programa");
         menu=numero(menu);
        switch(menu){
        case 1:
        mensaje("Ingrese un numero multiplos del 3");
        num=numero(num);
        if(num%3==0){
         if(num%2==0){
             mensaje("El numero "+num+" es multiplo de 3"+"n"+num+" / 2"+" = "+(num/2));
            n++;
            }
         if(num%5==0){
             mensaje("El numero "+num+" es multiplo de 3"+"n"+num+" / 5"+" = "+(num/5));
            n++;
            }
         if(num%3==0 && n==0){
             mensaje("El numero "+num+" es multiplo de 3"+"n"+num+" x 7"+" = "+(num*7));
            }
        }else{
         mensaje("el numero que ingreso no es multiplo de 6");
        }
        break;
        case 2:
        System.exit(0);
        break;
       }
      }while(seguir);
      }
    
     public static int numero(int num){
      Scanner leer= new Scanner(System.in);
      boolean seguir=true;
      do{
        try{
          num=leer.nextInt();
          seguir=false; 
                                                                }catch(Exception e){
          mensaje("Ingreso caracter no valido");
        }
      }while(seguir);
      return num;
    }
    public static String mensaje(String m){
        Scanner leer= new Scanner(System.in);
      System.out.println(m);
      return m;
    }
    
}
