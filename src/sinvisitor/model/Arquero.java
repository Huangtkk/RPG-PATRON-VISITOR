package sinvisitor.model;

public class Arquero implements Personaje {

    private String nombre;
    private int precision;

    public Arquero(String nombre, int precision) {
        this.nombre = nombre;
        this.precision = precision;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public int getPrecision() {
        return precision;
    }
}
