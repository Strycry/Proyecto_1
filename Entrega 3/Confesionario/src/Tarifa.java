import java.util.Date;


public class Tarifa {
	public Categoria categoria;
	public String temporada;
	public Sede sede;
	
	public Tarifa(Categoria categoria, String temporada, Sede sede) {
		this.categoria = categoria;
		this.temporada = temporada;
		this.sede = sede;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	public int generarTarifa (Categoria categoria, String temporada, Sede sede,Date fechaRecogida ,Date fechaEntrega, Sede sedeEntregar){
		 int cate = categoria.tarifaDiaria;
		 if (sedeEntregar != sede){
			 int nuevo = (int) (cate * 0.2);
		 }
		 int dias = fechaEntrega.getDay() - fechaEntrega.getDay();
		 
		 return cate * dias;
	}
}
