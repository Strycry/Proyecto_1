import java.util.Date;


public class Licencia {
	public int numero;
	public Date fechavencimiento;
	public String paisExpedicion;
	public Licencia(int numero, Date fechavencimiento, String paisExpedicion) {
		super();
		this.numero = numero;
		this.fechavencimiento = fechavencimiento;
		this.paisExpedicion = paisExpedicion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	public String getPaisExpedicion() {
		return paisExpedicion;
	}
	public void setPaisExpedicion(String paisExpedicion) {
		this.paisExpedicion = paisExpedicion;
	}
	
	
}
