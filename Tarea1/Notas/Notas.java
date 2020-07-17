
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

/**
 *
 * @author Admin
 */
public class Notas {
     public static void main(String[] args){
           String[] nombre = new String[4];
            nombre[0]="Camila";
            nombre[1]="Katerin";
            nombre[2]="Leonel";
            nombre[3]="Cinthia";

            int[] nota =new int[4];
            nota[0]=90;
            nota[1]=55;
            nota[2]=98;
            nota[3]=80;
            
            for(int x=0;x<4;x++){
                String stat;
                if(nota[x] <70){
                    stat="Reprobado";
                }else{
                    stat="Aprobado";
                }
                System.out.println("Alumno: "+nombre[x]+ ", Nota: "+nota[x]+ ", Estado: "+ stat);
            
            }
     }
}
