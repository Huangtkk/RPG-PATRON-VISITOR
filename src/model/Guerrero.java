package model;

import visitor.PersonajeVisitor;

public class Guerrero implements Personaje {

    private String nombre;
    private int fuerza;

    public Guerrero(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public void aceptar(PersonajeVisitor visitor) {
        visitor.visitar(this);
    }
}
