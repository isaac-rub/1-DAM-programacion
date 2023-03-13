/*
 */
package tema.pkg5;
import java.time.Instant;
import java.time.Duration;
import static java.time.Duration.between;


/**
 *
 * @author usuario-mañana
 */
public class Adivinanza {
    private String Enunciado;
    private String Respuesta_correcta;
    private Instant Inicio;

    public Adivinanza(String e, String rc) {
        this.Enunciado = e;
        this.Respuesta_correcta = rc;
        
    }

    public String getEnunciado() {
        this.Inicio= Instant.now();
        return Enunciado;
    }
    void comprovar(String r) throws Exception{
    Instant antes =this.Inicio;
    this.Inicio=Instant.now();
    if (r!=this.Respuesta_correcta){
        throw new Exception(
                    "la respuesta es incorrecta ");
    
    }
      Duration t= Duration.between (antes,this.Inicio);
      if(t.getSeconds()>30){
          throw new Exception(
                    "el tiempo a sido superado ");
      }
    }
    
}
