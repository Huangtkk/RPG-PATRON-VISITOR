package visitor;

import model.Guerrero;
import model.Mago;
import model.Arquero;

// Es la interfaz que define las operaciones que se pueden realizar sobre los elementos concretos
public interface PersonajeVisitor {

    void visitar(Guerrero guerrero);

    void visitar(Mago mago);

    void visitar(Arquero arquero);

}
