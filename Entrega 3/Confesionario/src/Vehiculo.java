import java.util.ArrayList;
import java.util.List;


public class Vehiculo {
	public String placa;
	public Sede sede;
	public String marca;
	public String modelo;
	public String color;
	public String transmision;
	public Categoria categoria;
	public ArrayList<Seguro> seguros;
	public boolean estado;
	public boolean disposicion;
	
	
	public Vehiculo(String placa, Sede sede, String marca, String modelo, String color,
			String transmision, Categoria categoria, ArrayList<Seguro> seguros,
			boolean disposicion) {
		this.placa = placa;
		this.sede = sede;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.transmision = transmision;
		this.categoria = categoria;
		this.seguros = seguros;
		this.disposicion = disposicion;
	}

	public String estadoDisposicion (Vehiculo vehiculo, Cliente cliente){
		if (vehiculo.estado = true){
			return "EL vehiculo esta alquilado por" + cliente ;
		}
		
		else if (vehiculo.disposicion = false){
			return "El vehiculo no esta siendo alquilado y aun no esta listo para ser alquilado" ;
		}
		else{
			return "El vehiculo no esta siendo alquilado pero esta disponible para alquilar";
		}
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public boolean getDisposicion() {
		return disposicion;
	}


	public void setDisposcion(boolean disposicion) {
		this.disposicion = disposicion;
	}


	public String generarRegistro(){
		return null;
	}
	
}
