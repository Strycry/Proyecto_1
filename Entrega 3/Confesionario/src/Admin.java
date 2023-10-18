import java.util.ArrayList;
import java.util.Date;



public class Admin extends Usuario{
		
	


	public Admin(String nombre, int numeroCelular, String nacionalidad,
			Date fechaNacimiento, String login, String password,
			Licencia licencia, TarjetaCredito tarjetaCred,
			boolean estadoFuncionamientoTarjeta, String tipoUsuario) {
		super(nombre, numeroCelular, nacionalidad, fechaNacimiento, login, password,
				licencia, tarjetaCred, estadoFuncionamientoTarjeta, tipoUsuario);

	}

	private void agregar_comprarCarro (String placa, String marca,String modelo, String color, String tipoTransmision ,Categoria categoria, Sede sede, ArrayList<Seguro> seguros,
					boolean disposicion){
		Vehiculo carro = new Vehiculo( placa, sede, marca, modelo,  color,  tipoTransmision , categoria,  seguros, disposicion);
		sede.listaVehiculosSede.add(carro);
		
	}
	
	private void darCarroDeBaja(Vehiculo vehiculo){
		vehiculo.sede.listaVehiculosSede.remove(vehiculo);
	}
}