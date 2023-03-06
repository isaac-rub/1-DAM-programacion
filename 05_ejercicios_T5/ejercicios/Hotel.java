/*
 */
package tema.pkg5;

/**
 *
 * @author usuario-mañana
 */
public class Hotel extends Edificio{
    private String clientes;
    private int maximo;
    
    public Hotel(String d, int np, int m) {
        super(d, np);
        this.maximo=m;
    }
    public void añadircliente(String c ){}
    
    public void retirarcliente(String c){}
    
}
