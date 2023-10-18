
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Alquiler {
	private int id;
	private Vehiculo vehiculo;
	private Cliente cliente;
	private Date fechaInicio;
	private Date fechaFin;
	private Sede sedeRecogida;
	private Sede sedeEntrega;
	private ArrayList <Conductor> conductoresAdicionales;
	private ArrayList <Seguro> segurosSeleccionados;
	private int montoTotal;
	
	public Alquiler(int id, Vehiculo vehiculo, Cliente cliente,
			Date fechaInicio, Date fechaFin, Sede sedeRecogida,
			Sede sedeEntrega, ArrayList<Conductor> conductoresAdicionales,
			ArrayList<Seguro> segurosSeleccionados, int montoTotal) {
		this.id = id;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.sedeRecogida = sedeRecogida;
		this.sedeEntrega = sedeEntrega;
		this.conductoresAdicionales = conductoresAdicionales;
		this.segurosSeleccionados = segurosSeleccionados;
		this.montoTotal = montoTotal;
	}
	
	public void agregarConductorAdicional(Conductor conductor){
		conductoresAdicionales.add(conductor);
		System.out.println("El conductor adicional fue añadido con exito"); 
		
	}
	
	public void eliminarConductorAdicional(Conductor conductor){
		conductoresAdicionales.remove(conductor);
		System.out.println("El conductor adicional fue eliminado con exito"); 
		
	}
	
	public List <Conductor> obtenerConductoresAdicionales(){
		return conductoresAdicionales;
		
	}
	
	public void agregarSeguro (Seguro seguro){
		segurosSeleccionados.add(seguro);
		System.out.println("El seguro fue añadido con exito"); 
	}
	
	public void eliminarSeguro (Seguro seguro){
		segurosSeleccionados.remove(seguro);
		System.out.println("El seguro fue eliminado con exito"); }

	public List<Seguro> obtenerSegurosSeleccionados(){
		return segurosSeleccionados;
	
	
	}
	public int calcularMontoTotal(Categoria categoria, String temporada, Sede sede,Date fechaRecogida ,Date fechaEntrega, Sede sedeEntregar){
		 int cate = categoria.tarifaDiaria;
		 if (sedeEntregar != sede){
			 int nuevo = (int) (cate * 0.2);
		 }
		 int dias = fechaEntrega.getDay() - fechaEntrega.getDay();
		 
		 return cate * dias;
		
	}
	public void iniciarAlquiler(Cliente cliente, Sede sedeRecogida, Date fechaInicio, Date fechaFin, Categoria categoria, String temporada, Sede sede,Date fechaRecogida ,Date fechaEntrega, Sede sedeEntregar) {
	        System.out.println("Iniciando alquiler para el cliente: " + cliente.getNombre());
	        System.out.println("Vehículo: " + vehiculo.getCategoria());
	        System.out.println("Fecha de inicio: " + fechaInicio);
	        System.out.println("Fecha de fin: " + fechaFin);

	        // Realizar bloqueo en la tarjeta de crédito (simulado).
	        boolean bloqueoExitoso = bloquearTarjetaCredito(cliente.getTarjetaCred(), calcularMontoTotal( categoria,  temporada,  sede, fechaRecogida , fechaEntrega,  sedeEntregar));
	        if (bloqueoExitoso) {
	            System.out.println("La tarjeta de crédito ha sido bloqueada para el monto estimado.");
	            System.out.println("Alquiler iniciado con éxito.");
	        } else {
	            System.out.println("Error al bloquear la tarjeta de crédito. No se pudo iniciar el alquiler.");
	        }
	    }

	private boolean bloquearTarjetaCredito(TarjetaCredito tarjetaCred,
			int calcularMontoTotal) {
		return tarjetaCred.bloqueada ;
	} 
	
}

