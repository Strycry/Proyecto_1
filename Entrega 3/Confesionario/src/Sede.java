
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Sede {
	public String nombre;
	public String ubicacion;
	public Date horaAbrir;
	public Date horaCerrar;
	public ArrayList<Empleados> empleados;
	public ArrayList<Vehiculo> listaVehiculosSede;
	public AdministradorLocal administradorLocal;



	public Sede(String nombre, String ubicacion, Date horaAbrir,
			Date horaCerrar, ArrayList<Empleados> empleados,
			ArrayList<Vehiculo> listaVehiculosSede,
			AdministradorLocal administradorLocal) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.horaAbrir = horaAbrir;
		this.horaCerrar = horaCerrar;
		this.empleados = empleados;
		this.listaVehiculosSede = listaVehiculosSede;
		this.administradorLocal = administradorLocal;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public Date getHoraAbrir() {
		return horaAbrir;
	}



	public void setHoraAbrir(Date horaAbrir) {
		this.horaAbrir = horaAbrir;
	}



	public Date getHoraCerrar() {
		return horaCerrar;
	}



	public void setHoraCerrar(Date horaCerrar) {
		this.horaCerrar = horaCerrar;
	}



	public ArrayList<Empleados> getEmpleados() {
		return empleados;
	}



	public void setEmpleados(ArrayList<Empleados> empleados) {
		this.empleados = empleados;
	}



	public ArrayList<Vehiculo> getListaVehiculosSede() {
		return listaVehiculosSede;
	}



	public void setListaVehiculosSede(ArrayList<Vehiculo> listaVehiculosSede) {
		this.listaVehiculosSede = listaVehiculosSede;
	}



	public AdministradorLocal getAdministradorLocal() {
		return administradorLocal;
	}



	public void setAdministradorLocal(AdministradorLocal administradorLocal) {
		this.administradorLocal = administradorLocal;
	}


	
	
	
}
