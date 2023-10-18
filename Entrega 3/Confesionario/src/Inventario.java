import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class Inventario {
	public ArrayList vehiculosDisponibles;
	public ArrayList vehiculosAlquilados; 
	public ArrayList vehiculosNoDisponibles;
	
	
	public Inventario(ArrayList vehiculosDisponibles,
			ArrayList vehiculosAlquilados, ArrayList vehiculosNoDisponibles) {
		super();
		this.vehiculosDisponibles = vehiculosDisponibles;
		this.vehiculosAlquilados = vehiculosAlquilados;
		this.vehiculosNoDisponibles = vehiculosNoDisponibles;
	}

	public String estadoVehiculo(Vehiculo vehiculo){
		if (vehiculo.estado = false){
			return "El vehiculo no esta siendo alquilado";
		}
		else{
			return "El vehiculo esta siendo alquilado";
		}
		
	}
	
}
