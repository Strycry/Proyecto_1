import java.util.Date;



public class Usuario {
	public String nombre;
	public int numeroCelular;
	public String nacionalidad;
	public Date fechaNacimiento;
	public String login;
	public String password;
	public Licencia licencia;
	public TarjetaCredito tarjetaCred;
	public boolean estadoFuncionamientoTarjeta;
	public String tipoUsuario;
	


	public Usuario(String nombre, int numeroCelular, String nacionalidad,
			Date fechaNacimiento, String login, String password,
			Licencia licencia, TarjetaCredito tarjetaCred,
			boolean estadoFuncionamientoTarjeta, String tipoUsuario) {
		this.nombre = nombre;
		this.numeroCelular = numeroCelular;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.login = login;
		this.password = password;
		this.licencia = licencia;
		this.tarjetaCred = tarjetaCred;
		this.estadoFuncionamientoTarjeta = estadoFuncionamientoTarjeta;
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean isEstadoFuncionamientoTarjeta() {
		return estadoFuncionamientoTarjeta;
	}
	public void setEstadoFuncionamientoTarjeta(boolean estadoFuncionamientoTarjeta) {
		this.estadoFuncionamientoTarjeta = estadoFuncionamientoTarjeta;
	}
	
	public Licencia getLicencia() {
		return licencia;
	}
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	public TarjetaCredito getTarjetaCred() {
		return tarjetaCred;
	}
	public void setTarjetaCred(TarjetaCredito tarjetaCred) {
		this.tarjetaCred = tarjetaCred;
	}
	

	
}
