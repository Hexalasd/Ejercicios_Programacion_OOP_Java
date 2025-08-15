/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;
import java.util.Scanner;
/**
 *
 * @author 66047656
 */

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner (System.in);
        Figura[] colection = new Figura[5];
      
        double lado1;
        double lado2;
        double lado3;
        double lado4;
        double aux1;
        double aux2;
        

        
        for (int i =0;i <2; i++){
            System.out.println("triangulo "+i);
        System.out.println("Ingrese el lado1 " +i);
             lado1 =gato.nextDouble();
        
        System.out.println("ingrese el lado2 "+i);
            lado2 =gato.nextDouble();
        
        System.out.println("ingrese el lado3 "+i);
            lado3 =gato.nextDouble();
            
        System.out.println("ingrese la base "+i);
            aux1 =gato.nextDouble();
        
         System.out.println("ingrese la altura "+i);
            aux2 =gato.nextDouble(); 
            
        colection[i]=new Triangulo(aux1, aux2, lado1, lado2, lado3);
         }
         for (int i=0;i<3;i ++){
            
             System.out.println("Ingrese el lado " +i);
             lado1 =gato.nextDouble();
        
        System.out.println("ingrese el lado1 "+i);
            lado2 =gato.nextDouble();
        
        System.out.println("ingrese el lado2 "+i);
            lado3 =gato.nextDouble();
          
         System.out.println("ingrese el lado3 "+i);
            lado3 =gato.nextDouble();    
            
         System.out.println("ingrese el lado4 "+i);
            lado4 =gato.nextDouble();    
            
        System.out.println("ingrese el ancho "+i);
            aux1 =gato.nextDouble();
        
         System.out.println("ingrese el largo "+i);
            aux2 =gato.nextDouble(); 
             
        
        colection[i]=new Rectangulo(aux1,aux2,lado1,lado2,lado3,lado4);
            
        }
    }
}
