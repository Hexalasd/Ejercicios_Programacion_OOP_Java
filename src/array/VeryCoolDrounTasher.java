/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.ArrayList;

public class VeryCoolDrounTasher {
    public static void main(String[] args) {
        ArrayList<String>Nombres =new ArrayList();
        Nombres.add("Diego");
        Nombres.add("Valentina");
        Nombres.add("Arturo");
        
        System.out.println("inscritos al concurso de Drones" + Nombres);
        Nombres.remove(0);
        System.out.println("inscritos sin el primer indice" + Nombres);
        Nombres.set(0, "Bola");
        System.out.println("Inscritos con la modificacion" + Nombres);
        
               
    }
}
