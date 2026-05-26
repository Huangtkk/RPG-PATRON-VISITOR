package visitor;

import interfaces.PersonajeVisitor;

import model.Guerrero;
import model.Mago;
import model.Arquero;

//clases concreta que implementan el visitor
public class ExperienciaVisitor implements PersonajeVisitor {

        @Override
        public void visitar(Guerrero guerrero) {
                System.out.println(
                                guerrero.getNombre() +
                                                " gana 100 XP");
        }

        @Override
        public void visitar(Mago mago) {
                System.out.println(
                                mago.getNombre() +
                                                " gana 120 XP");
        }

        @Override
        public void visitar(Arquero arquero) {
                System.out.println(
                                arquero.getNombre() +
                                                " gana 90 XP");
        }

}
