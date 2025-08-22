/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videojuego;

/**
 *
 * @author 66047656
 */
public class Videojuego {
private String titulo;
private double precio;

public Videojuego(String titulo, double precio) {
this.titulo = titulo;
this.precio = precio;
        }   

public String getTitulo() {
return titulo;
        }

public double getPrecio() {
return precio;


        }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", precio=" + precio + '}';
    }
    
 }
