
public class Seguro {
	public int costoAdicional;
	private String tipoSeguro;
	
	public Seguro(int costoAdicional, String tipoSeguro) {
		this.costoAdicional = costoAdicional;
		this.tipoSeguro = tipoSeguro;
	}

	public void setCostoAdicional(int costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
	
	public int getCostoAdicional() {
		return costoAdicional;
	}
}
