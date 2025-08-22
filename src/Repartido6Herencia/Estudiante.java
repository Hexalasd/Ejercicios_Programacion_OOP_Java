package Repartido6Herencia;

public class Estudiante extends Persona {
    private boolean habilitado;

    public Estudiante(boolean habilitado, String nombre, String apellido, String cedula, String fnac) {
        super(nombre, apellido, cedula, fnac);
        this.habilitado = habilitado;
    }

}