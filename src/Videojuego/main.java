/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videojuego;

import java.util.ArrayList;

/**
 *
 * @author 66047656
 */
public class main {
    public static void main(String[] args) {
        
        ArrayList<Videojuego> vj = new ArrayList<>();
        
        Videojuego v1 = new Videojuego("RainWorld", 5);
        Videojuego v2 = new Videojuego("Voices Of TheVoid", 0);
        Videojuego v3 = new Videojuego("TLOZ Breath Of TheWild", 59);
        Videojuego v4 = new Videojuego("Rust", 7);
        
        vj.add(v1);
        vj.add(v2);
        vj.add(v3);
        vj.add(v4);
        
        System.out.println(vj);
        
        for(int i=0; i< vj.size();i++){
            Videojuego e = vj.get(i);
            System.out.println("Nombre: "+e.getTitulo() + "Precio: " + e.getPrecio());
        }
        System.out.println("La cantidad de videojuegos son " +vj.size());
    }
}
