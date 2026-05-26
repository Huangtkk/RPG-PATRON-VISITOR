package model;

import interfaces.Personaje;
import interfaces.PersonajeVisitor;

//Clases concreta que implementan el visitor
public class Arquero implements Personaje {

    private String nombre;
    private int precision;

    public Arquero(String nombre, int precision) {
        this.nombre = nombre;
        this.precision = precision;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecision() {
        return precision;
    }

    @Override
    public void aceptar(PersonajeVisitor visitor) {
        visitor.visitar(this);
    }
}
