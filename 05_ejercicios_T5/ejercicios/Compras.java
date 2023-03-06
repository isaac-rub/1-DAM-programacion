/*
 */
package tema.pkg5;

import java.util.ArrayList;
import java.util.List;








/**
 *
 * @author usuario-mañana
 */
public class Compras {
    
    private double Presupuesto;
    private List<Double> precios = new ArrayList<>();
    
    
    
    public Compras(double p){
        this.Presupuesto=p;
    }
    void RegistrarCompra(double dinero)throws Exception {
        
        if (Presupuesto<dinero){
            
            throw new Exception(
                    "No hay suficiente dinero Faltan"+(dinero-Presupuesto));
            
        }
        this.precios.add(dinero);
        this.Presupuesto-=dinero;
        
    }

    public double getPresupuesto() {
        return Presupuesto;
    }

    public List<Double> getPrecios() {
        return precios;
    }

    

    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public void setPrecios(List<Double> precios) {
        this.precios = precios;
    }

   
    
    
}
