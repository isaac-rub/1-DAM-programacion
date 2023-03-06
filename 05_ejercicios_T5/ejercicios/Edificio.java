/*
 */
package tema.pkg5;

/**
 *
 * @author usuario-mañana
 */
public class Edificio {
    
    private String direccion;
    private int numPlantas;

    public Edificio(String d, int np) {
        this.direccion = d;
        this.numPlantas = np;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumPlantas() {
        return numPlantas;
    }
    
    
    
}
