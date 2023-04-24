
package gwomwtria;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public interface figurageometrica extends coloreable {
    public int getperimetro();
     public double getarea();
    public void dibujar(Graphics a);        
    public  default cuadrado crearCuadradoIgualArea(Point esquinaSuperiorizquierda){
        double area = this.getarea();
        double lado = Math.sqrt(area);
        return new cuadrado (esquinaSuperiorizquierda, (int)lado, Color.YELLOW);
    
    } ;     
            
}
