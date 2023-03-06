/*
 */
package tema.pkg5;

/**
 *
 * @author usuario-mañana
 */
public class Sorteo {

    private double DineroCupon;
    private int PagosRealizados;
    private int PagosPendientes;
    private int TotalParticipantes;
    private double DineroRecogido;

    public Sorteo(double D, int T) {
        this.DineroCupon = D;
        this.TotalParticipantes = T;
        this.PagosRealizados=0;
        this.PagosPendientes=T;
    }

    void RegistrarPago() {
        this.PagosPendientes--;
        this.PagosRealizados++;
        this.DineroRecogido+=DineroCupon;
    }

    void ApuntarNuevoParticipante() {
        this.TotalParticipantes++;
        this.PagosPendientes++;
    }

    public double getDineroCupon() {
        return this.DineroCupon;
    }

    public int getPagosRealizados() {
        return this.PagosRealizados;
    }

    public int getPagosPendientes() {
        return this.PagosPendientes;
    }

    public double getDineroRecogido() {
        return this.DineroRecogido;
    }

   

}
