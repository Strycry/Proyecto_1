
import java.util.Date;


public class AdministradorLocal extends Usuario{

	
	public AdministradorLocal(String nombre, int numeroCelular,
			String nacionalidad, Date fechaNacimiento, String login,
			String password, Licencia licencia, TarjetaCredito tarjetaCred,
			boolean estadoFuncionamientoTarjeta, String tipoUsuario) {
		super(nombre, numeroCelular, nacionalidad, fechaNacimiento, login, password,
				licencia, tarjetaCred, estadoFuncionamientoTarjeta, tipoUsuario);
	}


	private void creacionUsuario(String nombre, int numeroCelular, String nacionalidad,
			Date fechaNacimiento, String login, String password,
			Licencia licencia, TarjetaCredito tarjetaCred ,Empresa empresa, boolean estadoFuncionamientoTarjeta, String tipoUsuario){
		Usuario user = new Usuario( nombre,  numeroCelular,  nacionalidad,fechaNacimiento,  login,  password, 
				licencia,tarjetaCred, estadoFuncionamientoTarjeta, tipoUsuario);
		empresa.listaUsuarios.add(user);
	}
	
	
	private void registrarEmpleado (String nombre, int numeroCelular, String nacionalidad,
			Date fechaNacimiento, String login, String password,
			Licencia licencia, TarjetaCredito tarjetaCred,
			boolean estadoFuncionamientoTarjeta, String tipoUsuario, Sede sede,
			String cargo){
		Empleados emple = new Empleados(  nombre,  numeroCelular,  nacionalidad,
				 fechaNacimiento,  login,  password,
				 licencia,  tarjetaCred,
				 estadoFuncionamientoTarjeta,  tipoUsuario,  sede,
				 cargo);
		
		sede.empleados.add(emple);
	}
	
}
