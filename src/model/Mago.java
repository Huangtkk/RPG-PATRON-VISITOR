package model;

import interfaces.Personaje;
import interfaces.PersonajeVisitor;

//Clases concreta que implementan el visitor
public class Mago implements Personaje {

    private String nombre;
    private int mana;

    public Mago(String nombre, int mana) {
        this.nombre = nombre;
        this.mana = mana;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void aceptar(PersonajeVisitor visitor) {
        visitor.visitar(this);
    }

}
