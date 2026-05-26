package sinvisitor.service;

import sinvisitor.interfaces.Personaje;
import sinvisitor.model.*;

public class PersonajeService {

    // Operación 1: Reporte (usando instanceof)
    public void generarReporte(Personaje personaje) {

        if (personaje instanceof Guerrero) {
            Guerrero guerrero = (Guerrero) personaje;
            System.out.println(
                    "Guerrero: " +
                            guerrero.getNombre() +
                            " | Fuerza: " +
                            guerrero.getFuerza());
        } else if (personaje instanceof Mago) {
            Mago mago = (Mago) personaje;
            System.out.println(
                    "Mago: " +
                            mago.getNombre() +
                            " | Mana: " +
                            mago.getMana());
        } else if (personaje instanceof Arquero) {
            Arquero arquero = (Arquero) personaje;
            System.out.println(
                    "Arquero: " +
                            arquero.getNombre() +
                            " | Precision: " +
                            arquero.getPrecision());
        } else {
            System.out.println("Personaje de tipo desconocido.");
        }
    }

    // Operación 2: Experiencia ( usando instanceof)
    public void otorgarExperiencia(Personaje personaje) {
        if (personaje instanceof Guerrero) {
            System.out.println(personaje.getNombre() + " gana 100 XP");
        } else if (personaje instanceof Mago) {
            System.out.println(personaje.getNombre() + " gana 120 XP");
        } else if (personaje instanceof Arquero) {
            System.out.println(personaje.getNombre() + " gana 90 XP");
        } else {
            System.out.println("Personaje desconocido no recibe XP.");
        }
    }

    // Operación 3: Guardado (usando instanceof)
    public void guardarPersonaje(Personaje personaje) {
        if (personaje instanceof Guerrero) {
            Guerrero guerrero = (Guerrero) personaje;
            System.out.println(
                    "Guardando Guerrero: " +
                            guerrero.getNombre() +
                            " con fuerza " +
                            guerrero.getFuerza() +
                            " en la base de datos.");
        } else if (personaje instanceof Mago) {
            Mago mago = (Mago) personaje;
            System.out.println(
                    "Guardando Mago: " +
                            mago.getNombre() +
                            " con mana " +
                            mago.getMana() +
                            " en la base de datos.");
        } else if (personaje instanceof Arquero) {
            Arquero arquero = (Arquero) personaje;
            System.out.println(
                    "Guardando Arquero: " +
                            arquero.getNombre() +
                            " con precision " +
                            arquero.getPrecision() +
                            " en la base de datos.");
        } else {
            System.out.println("No se puede guardar un personaje desconocido.");
        }
    }
}
