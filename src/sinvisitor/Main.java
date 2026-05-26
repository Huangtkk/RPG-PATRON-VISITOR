package sinvisitor;

import java.util.Arrays;
import java.util.List;
import sinvisitor.interfaces.Personaje;
import sinvisitor.model.*;
import sinvisitor.service.PersonajeService;

public class Main {

    public static void main(String[] args) {

        List<Personaje> personajes = Arrays.asList(
                new Guerrero("Thor", 100),
                new Mago("Merlin", 150),
                new Arquero("Legolas", 95));

        PersonajeService service = new PersonajeService();

        System.out.println("=== REPORTES ===");
        for (Personaje personaje : personajes) {
            service.generarReporte(personaje);
        }

        System.out.println("\n=== EXPERIENCIA===");
        for (Personaje personaje : personajes) {
            service.otorgarExperiencia(personaje);
        }

        System.out.println("\n=== GUARDADO SIN VISITOR===");
        for (Personaje personaje : personajes) {
            service.guardarPersonaje(personaje);
        }
    }
}
