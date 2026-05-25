package model;

import visitor.PersonajeVisitor;

public interface Personaje {

    void aceptar(PersonajeVisitor visitor); // Es la interfaz que recibe el visitor (Relacion de dependencia)
}