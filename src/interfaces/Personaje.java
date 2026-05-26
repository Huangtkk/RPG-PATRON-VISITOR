package interfaces;

public interface Personaje {

    void aceptar(PersonajeVisitor visitor); // Es la interfaz que recibe el visitor (Relacion de dependencia)
}