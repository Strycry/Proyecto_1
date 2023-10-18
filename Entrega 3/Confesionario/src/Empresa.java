
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class Empresa {
	
	
	public String nombre;
	public ArrayList<Cliente> cliente;
	public ArrayList<Sede> sedes;
	public Admin administrador;
	public Inventario inventario;
	public ArrayList<Usuario> listaUsuarios;
	public ArrayList<Vehiculo> listaVehiculos;
	private BufferedReader bufEntrada;
	private FileReader flujoLee;
	private FileWriter flujoEscr;
	private PrintWriter bufSalida;
	

	public Empresa(String nombre, ArrayList<Cliente> cliente,
			ArrayList<Sede> sedes, Admin administrador, Inventario inventario,
			ArrayList<Usuario> listaUsuarios,
			ArrayList<Vehiculo> listaVehiculos, BufferedReader bufEntrada,
			FileReader flujoLee, FileWriter flujoEscr, PrintWriter bufSalida,
			Scanner scanner) {
		super();
		this.nombre = nombre;
		this.cliente = cliente;
		this.sedes = sedes;
		this.administrador = administrador;
		this.inventario = inventario;
		this.listaUsuarios = listaUsuarios;
		this.listaVehiculos = listaVehiculos;
		this.bufEntrada = bufEntrada;
		this.flujoLee = flujoLee;
		this.flujoEscr = flujoEscr;
		this.bufSalida = bufSalida;
		this.scanner = scanner;
	}
	
	
	
	public Empresa(){
		this.bufEntrada = null;
		this.flujoLee = null;
		this.flujoEscr = null;
		this.bufSalida = null;
	}
	
	
	public String leerDatos()throws IOException{
		this.flujoLee = new FileReader("agenda.txt");
		bufEntrada = new BufferedReader(flujoLee);
		String datos = "";
		String linea = this.bufEntrada.readLine();
		while (linea!=null){
			datos += linea +"\n";
			linea = this.bufEntrada.readLine();
			
		}
		bufEntrada.close();
		return datos;
	}
	
	public void EscribeDatos(String datos)throws IOException{
		flujoEscr = new FileWriter("agenda.txt", true);
		bufSalida = new PrintWriter(flujoEscr);
		bufSalida.println(datos);
		bufSalida.close();
		
	}

	Scanner scanner = new Scanner(System.in);
	public static void main( String[] args ){
		
		
	}
	
	public void ejecutarAplicacion(){
		System.out.println("La aplicacion ha iniciado \n ");
		System.out.println("Ingrese su login de usuario");
		String username = scanner.nextLine();
		System.out.println("Ingrese su contraseña de usuario");
		String password = scanner.nextLine();
		
		
		for (Usuario user : listaUsuarios){
			if(username.equals(user.login) && password.equals(user.password)){
				if(user.getTipoUsuario().equals("administrador"));
				iniciarAplicacion1(user.login);
			}
				else if (user.getTipoUsuario().equals("administradorLocal")){
				iniciarAplicacion2(user.login);
			}
			
				else if (user.getTipoUsuario().equals("Cliente")){
					iniciarAplicacion4(user.login);
			}
				
				else if (user.getTipoUsuario().equals("Empleado")){
					iniciarAplicacion3(user.login);}}
	}
	
	

	private void iniciarAplicacion1(String administrador) {
		System.out.println("Funciones administrador \n"
				+ "Dar carro de baja"
				+ "Compara-anadir carro");
	}

	private void iniciarAplicacion2(String administradorLocal) {
		System.out.println("Funciones administrador local \n"
				+ "Creacion de usuario \n"
				+ "Registrar empleado \n");
	}
	private void iniciarAplicacion3(String Empleado) {
		System.out.println("Funciones empleado \n"
				+ "Reservar carro \n"
				+ "Generar tarifa \n"
				+"Alquilar carro \n"
				+"Cambiar estado vehiculo \n");
	}
	private void iniciarAplicacion4(String Cliente) {
		System.out.println("Funciones cliente "
				+ "Generar cobro alquiler"
				+ "Generar excedente");
	}


	public void registrarUsuarioNuevo( String nombre, String login,int numeroCelular , String nacionalidad,
			Date fechaNacimiento,String password, Licencia licencia, TarjetaCredito tarjetaCred,boolean estadoFuncionamientoTarjeta){
		Usuario user = new Usuario(nombre,numeroCelular, nacionalidad, fechaNacimiento,login,password, licencia, tarjetaCred, estadoFuncionamientoTarjeta, password);
		listaUsuarios.add(user);
	}
	
	public void actualizarEstado(Vehiculo vehiculo){
		if (vehiculo.estado = true){
			vehiculo.estado = false;
		}
		
		else{
			vehiculo.estado = true;
		}
	}
	
	public void generarReserva (Vehiculo vehiculo,Sede sedeRecoger, Date fechaLlegada,Date horaLlegada, Sede sedeEntregar,
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
	
	public String conocerEstadoCliente (Cliente cliente, String categoria){
		if (cliente.estadoFuncionamientoTarjeta = false){
			return "El cliente tiene un alquiler en curso";
		}
		else {
			return "El cliente no tiene ningun alquiler en curso";
		}
		
	}
	
	
	
}
