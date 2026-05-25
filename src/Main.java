import java.util.Arrays;
import java.util.List;
import model.*;
import visitor.*;

public class Main {

    public static void main(String[] args) {

        List<Personaje> personajes = Arrays.asList(
                new Guerrero("Thor", 100),
                new Mago("Merlin", 150),
                new Arquero("Legolas", 95));

        PersonajeVisitor reporte = new ReporteVisitor();
        PersonajeVisitor experiencia = new ExperienciaVisitor();
        PersonajeVisitor guardado = new GuardadoVisitor();

        System.out.println("=== REPORTES ===");

        for (Personaje personaje : personajes) {
            personaje.aceptar(reporte);
        }

        System.out.println("\n=== EXPERIENCIA ===");

        for (Personaje personaje : personajes) {
            personaje.aceptar(experiencia);
        }

        System.out.println("\n=== GUARDADO ===");

        for (Personaje personaje : personajes) {
            personaje.aceptar(guardado);
        }

    }
}
