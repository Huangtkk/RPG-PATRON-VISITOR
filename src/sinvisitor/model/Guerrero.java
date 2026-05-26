package sinvisitor.model;

import sinvisitor.interfaces.Personaje;

public class Guerrero implements Personaje {

    private String nombre;
    private int fuerza;

    public Guerrero(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }
}
