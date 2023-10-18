import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cliente extends Usuario{
	public String tipo;
	public Sede sedeRecoger;
	public Sede sedeEntregar;	
	public Date fechaRecogida;
	public Date fechaEntrega;
	public int valorproyectado;
	public ArrayList<Alquiler> alquileres;
		

	

	public Cliente(String nombre, int numeroCelular, String nacionalidad,
			Date fechaNacimiento, String login, String password,
			Licencia licencia, TarjetaCredito tarjetaCred,
			boolean estadoFuncionamientoTarjeta, String tipoUsuario,
			String tipo, Sede sedeRecoger, Sede sedeEntregar,
			Date fechaRecogida, Date fechaEntrega, int valorproyectado,
			ArrayList<Alquiler> alquileres) {
		super(nombre, numeroCelular, nacionalidad, fechaNacimiento, login,
				password, licencia, tarjetaCred, estadoFuncionamientoTarjeta,
				tipoUsuario);
		this.tipo = tipo;
		this.sedeRecoger = sedeRecoger;
		this.sedeEntregar = sedeEntregar;
		this.fechaRecogida = fechaRecogida;
		this.fechaEntrega = fechaEntrega;
		this.valorproyectado = valorproyectado;
		this.alquileres = alquileres;
	}

	public int generarCobroAlquiler(Categoria categoria, String temporada, Sede sede,Date fechaRecogida ,Date fechaEntrega, Sede sedeEntregar){
		int cate = categoria.tarifaDiaria;
		 if (sedeEntregar != sede){
			 int nuevo = (int) (cate * 0.2);
		 }
		 int dias = fechaEntrega.getDay() - fechaEntrega.getDay();
		 
		 return cate * dias;
		
	}
	public int generarExcedente(){
		
		return valorproyectado;
		
	}
}
