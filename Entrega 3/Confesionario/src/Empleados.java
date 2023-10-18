import java.util.ArrayList;
import java.util.Date;



public class Empleados extends Usuario {
	public Sede sede;
	public String cargo;

	public Empleados(String nombre, int numeroCelular, String nacionalidad,
			Date fechaNacimiento, String login, String password,
			Licencia licencia, TarjetaCredito tarjetaCred,
			boolean estadoFuncionamientoTarjeta, String tipoUsuario, Sede sede,
			String cargo) {
		super(nombre, numeroCelular, nacionalidad, fechaNacimiento, login,
				password, licencia, tarjetaCred, estadoFuncionamientoTarjeta,
				tipoUsuario);
		this.sede = sede;
		this.cargo = cargo;
	}


	private void reservarCarro (Vehiculo vehiculo,Sede sedeRecoger, Date fechaLlegada,Date horaLlegada, Sede sedeEntregar,
			Date horasDevolver, String temporada){
		if (vehiculo.estado = true){
			System.out.println("El carro no puede ser reservado pues ya esta alquilado");
		}
		
		else if (vehiculo.estado = false && (comparacion(horaLlegada,sedeRecoger.horaAbrir) == -1 || comparacion(horaLlegada,sedeRecoger.horaAbrir) == 1)){
			System.out.println("La hora dada para recoger el vehiculo esta fuera de las horas de atencion de la sede elegida");
		}
		
		else{
			System.out.println("El carro fue reservado con exito \n Debera pagar el valor correspondiente"
					+ generarTarifa (vehiculo.getCategoria(),  temporada, sedeRecoger, fechaLlegada , fechaLlegada, sedeEntregar) + "al 30% del valor total del alquiler lo cual es el siguiente monto") ;
		}
	}
	
	public int generarTarifa (Categoria categoria, String temporada, Sede sede,Date fechaRecogida ,Date fechaEntrega, Sede sedeEntregar){
		 int cate = categoria.tarifaDiaria;
		 if (sedeEntregar != sede){
			 int nuevo = (int) (cate * 0.2);
		 }
		 int dias = fechaEntrega.getDay() - fechaEntrega.getDay();
		 
		 return cate * dias;
	}
	
	public int comparacion (Date date1, Date date2){
		int comparacion = date1.compareTo(date2);
		if (comparacion < 0) {
            return -1;
        } else if (comparacion > 0) {
            return 1;
        } else {
            return 0;
        }
	}
	private void cambiarEstadoVehiculo (Vehiculo vehiculo){
		if (vehiculo.estado = true){
			vehiculo.estado = false;
		}
		else{
			vehiculo.estado = true;
		}
		
	}
	
	
}
