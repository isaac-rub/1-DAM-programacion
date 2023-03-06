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
    }
    void RegistrarPago(){
    this.PagosPendientes--;
    this.PagosRealizados++;
    }
    void ApuntarNuevoParticipante(){
    this.TotalParticipantes++;
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

    public void setDineroCupon(double DineroCupon) {
        this.DineroCupon = DineroCupon;
    }

    public void setPagosRealizados(int PagosRealizados) {
        this.PagosRealizados = PagosRealizados;
    }

    public void setPagosPendientes(int PagosPendientes) {
        this.PagosPendientes = PagosPendientes;
    }

    public void setTotalParticipantes(int TotalParticipantes) {
        this.TotalParticipantes = TotalParticipantes;
    }

    public void setDineroRecogido(double DineroRecogido) {
        this.DineroRecogido = DineroRecogido;
    }
        
    
    
}
