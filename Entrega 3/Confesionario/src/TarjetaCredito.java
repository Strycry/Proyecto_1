import java.util.Date;


public class TarjetaCredito {
	public String titular;
	public int numero;
	public int cvc;
	public String marca;
	public Date vencimiento;
	public boolean bloqueada;
	public TarjetaCredito(String titular, int numero, int cvc, String marca,
			Date vencimiento, boolean bloqueada) {
		this.titular = titular;
		this.numero = numero;
		this.cvc = cvc;
		this.marca = marca;
		this.vencimiento = vencimiento;
		this.bloqueada = bloqueada;
	}
	
	public void actualizaTarjetaEstado(TarjetaCredito tarjeta){
		if (tarjeta.bloqueada = false){
			tarjeta.bloqueada = true;
		}
		else{
			tarjeta.bloqueada = false;
		}
	}

}
