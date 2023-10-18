import java.util.ArrayList;



public class Categoria {
	public String nombre;
	public ArrayList<Seguro> seguros;
	public Tarifa tarifa;
	public int tarifaDiaria;
	public ArrayList<Vehiculo> listaVehiculos;
	

	public Categoria(String nombre, ArrayList<Seguro> seguros, Tarifa tarifa,
			int tarifaDiaria, ArrayList<Vehiculo> listaVehiculos) {	
		this.nombre = nombre;
		this.seguros = seguros;
		this.tarifa = tarifa;
		this.tarifaDiaria = tarifaDiaria;
		this.listaVehiculos = listaVehiculos;

	}

	public ArrayList<Seguro> getSeguros() {
		return seguros;
	}

	public void setSeguros(ArrayList<Seguro> seguros) {
		this.seguros = seguros;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	

}
