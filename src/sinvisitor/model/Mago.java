package sinvisitor.model;

public class Mago implements Personaje {

    private String nombre;
    private int mana;

    public Mago(String nombre, int mana) {
        this.nombre = nombre;
        this.mana = mana;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public int getMana() {
        return mana;
    }
}
