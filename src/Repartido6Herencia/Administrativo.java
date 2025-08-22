/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repartido6Herencia;

/**
 *
 * @author 66047656
 */
public class Administrativo extends Persona {
    private String turno;

    public Administrativo(String turno,String fnac, String nombre, String apellido, String cedula) {
        super(nombre,fnac, apellido, cedula);
        this.turno = turno;
    }
    
}
