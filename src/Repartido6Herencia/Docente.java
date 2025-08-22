/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repartido6Herencia;

/**
 *
 * @author 66047656
 */
public class Docente extends Persona{
    private int horas;
    private String reemplazo;

    public Docente(int horas, String reemplazo,String fnac, String nombre, String apellido, String cedula) {
        super(nombre,fnac, apellido, cedula);
        this.horas = horas;
        this.reemplazo = reemplazo;
    }
    
}

