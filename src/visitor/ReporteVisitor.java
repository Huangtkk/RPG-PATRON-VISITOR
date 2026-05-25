package visitor;

import model.Guerrero;
import model.Mago;
import model.Arquero;

//clases concreta que implementan el visitor
public class ReporteVisitor implements PersonajeVisitor {

    @Override
    public void visitar(Guerrero guerrero) {
        System.out.println(
                "Guerrero: " +
                        guerrero.getNombre() +
                        " | Fuerza: " +
                        guerrero.getFuerza());
    }

    @Override
    public void visitar(Mago mago) {
        System.out.println(
                "Mago: " +
                        mago.getNombre() +
                        " | Mana: " +
                        mago.getMana());
    }

    @Override
    public void visitar(Arquero arquero) {
        System.out.println(
                "Arquero: " +
                        arquero.getNombre() +
                        " | Precision: " +
                        arquero.getPrecision());
    }
}
