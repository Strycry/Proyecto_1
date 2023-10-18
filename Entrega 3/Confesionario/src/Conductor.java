import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Conductor {
	public Licencia licencia;
	public String nombre;
	public int celular;
	public String correo;
	public Date fechaNacimiento;
	public String nacionalidad;
	public ArrayList<Reserva> reservas;

	public Conductor(Licencia licencia, String nombre, int celular,
			String correo, Date fechaNacimiento, String nacionalidad,
			ArrayList<Reserva> reservas) {
		this.licencia = licencia;
		this.nombre = nombre;
		this.celular = celular;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.reservas = reservas;
	}
	
	public Licencia getLicencia() {
		return licencia;
	}
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

