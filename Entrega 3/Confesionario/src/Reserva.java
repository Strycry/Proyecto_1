import java.util.Date;


public class Reserva {
	public Cliente cliente;
	public String tipo;
	public Sede sedeRecogida;
	public Sede sedeEntrega;
	public Date fechaRecogida;
	public Date fechaEntrega;
	public int valorProyectado;
	public Reserva(Cliente cliente, String tipo, Sede sedeRecogida,
			Sede sedeEntrega, Date fechaRecogida, Date fechaEntrega,
			int valorProyectado) {
		this.cliente = cliente;
		this.tipo = tipo;
		this.sedeRecogida = sedeRecogida;
		this.sedeEntrega = sedeEntrega;
		this.fechaRecogida = fechaRecogida;
		this.fechaEntrega = fechaEntrega;
		this.valorProyectado = valorProyectado;
	}
	
	public void anadirCostoDanos(){
		
	}
	
	public int generarExcedente(){
		return 1;
	}
	
	
}
