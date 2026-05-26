package visitor;

import interfaces.PersonajeVisitor;

import model.Guerrero;
import model.Mago;
import model.Arquero;

//clases concreta que implementan el visitor
public class GuardadoVisitor implements PersonajeVisitor {

        @Override
        public void visitar(Guerrero guerrero) {
                System.out.println(
                                "Guardando Guerrero: " +
                                                guerrero.getNombre() +
                                                " con fuerza " +
                                                guerrero.getFuerza() +
                                                " en la base de datos.");
        }

        @Override
        public void visitar(Mago mago) {
                System.out.println(
                                "Guardando Mago: " +
                                                mago.getNombre() +
                                                " con mana " +
                                                mago.getMana() +
                                                " en la base de datos.");
        }

        @Override
        public void visitar(Arquero arquero) {
                System.out.println(
                                "Guardando Arquero: " +
                                                arquero.getNombre() +
                                                " con precision " +
                                                arquero.getPrecision() +
                                                " en la base de datos.");
        }

}
