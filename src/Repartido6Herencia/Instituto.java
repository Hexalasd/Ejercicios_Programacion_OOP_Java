/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repartido6Herencia;

import java.util.ArrayList;

/**
 *
 * @author 66047656
 */
public class Instituto {
    private ArrayList <Estudiante> listaEstudiante = new ArrayList<>();
    private ArrayList <Docente> listaDocente = new ArrayList<>();
    private ArrayList <Administrativo> listaAdministrativo = new ArrayList<>();
    
    
    public void agregar(Estudiante e){
        listaEstudiante.add(e);
        
    }
}
