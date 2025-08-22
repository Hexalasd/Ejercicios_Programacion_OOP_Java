/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticoArray;

import java.util.ArrayList;

/**
 *
 * @author 66047656
 */
public class Ej1 {
    public static void main(String[] args) {
        
        //un arreglo como un (int[]) y un ArrayList<Integer> tienen diferencias, primero el arreglo se llama con int y ArrayList se llama con Integer Directamente, y que el arreglo tiene una cantidad fija//
        
        //el ArrayList es mas flexible debido al dinamismo de tamaño y la habilidad de poder guardar objetos variables como tal//
        
        //ArrayList de frutas//
        ArrayList<String>frutas =new ArrayList<>();
        //ArrayList de colores//
        ArrayList<String>colores =new ArrayList<>();
        //ArrayList de numeros enteros//
        ArrayList<Integer>numeros =new ArrayList<>();
        //ArrayList de ciudades//
        ArrayList<String>ciudades =new ArrayList<>();
        //ArrayList de animales//
        ArrayList<String>animales =new ArrayList<>();
        
        
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
    
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("morado");
        colores.add("cyan");
                
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        ciudades.add("tecladolandia");
        ciudades.add("mouselandia");
        ciudades.add("panatallalandia");
        
       animales.add("perro");
       animales.add("gato");
       animales.add("loro");
       animales.add("conejo");
        
        System.out.println(frutas +" version 1 frutas ");
        
        System.out.println(frutas.get(1));
        frutas.set(0,"pera");
        
        System.out.println(frutas +" version 2 frutas "); 
        
        colores.remove(1);
        System.out.println(colores +" version 1 colores");
        
        System.out.println( "la cantidad de numeros en el array son: "+numeros.size());
        
        numeros.add(6);
        
        System.out.println(numeros);
        
        
        System.out.println(ciudades);
        ciudades.set(1,"PadLandia");
        System.out.println(ciudades +" modificado ");
        
        for(int i=0; i < 4;i++){
            System.out.println("Posicion "+ i +" "+ animales.get(i));
        }
        
    }
}
