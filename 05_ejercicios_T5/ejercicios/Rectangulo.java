/*
 */
package tema.pkg5;

/**
 *
 * @author usuario-mañana
 */
public class Rectangulo {
    
    private int Base;
    private int Altura;
    private int Area;

    public Rectangulo(int Base, int Altura) {
        this.Base = Base;
        this.Altura = Altura;
        this.Area=Base*Altura;
    }

    public void setBase(int b) {
        this.Base = b;
    }

    public void setAltura(int a) {
        this.Altura = a;
    }

    public int getBase() {
        return Base;
    }

    public int getAltura() {
        return Altura;
    }

    public int getArea() {
        return Area;
    }
    
    
}
