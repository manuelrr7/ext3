package ajaxmvc.modelo.beans;

public class Poblacion {
	
	private String codigoPoblacion;
	private String poblacion;
	private String habitantes;
	private String codigoProvincia;
	private String error;
	
	
	public Poblacion() {


	}
	

	public Poblacion(String codigoPoblacion, String poblacion) {
		
		this.codigoPoblacion = codigoPoblacion;
		this.poblacion = poblacion;
	}
	
	
	public Poblacion(String codigoPoblacion, String poblacion, String habitantes, String codigoProvincia) {
		
		this.codigoPoblacion = codigoPoblacion;
		this.poblacion = poblacion;
		this.habitantes = habitantes;
		this.codigoProvincia = codigoProvincia;
	}

	
	public Poblacion(String codigoPoblacion, String poblacion, String habitantes, String codigoProvincia,
			String error) {
		
		this.codigoPoblacion = codigoPoblacion;
		this.poblacion = poblacion;
		this.habitantes = habitantes;
		this.codigoProvincia = codigoProvincia;
		this.error = error;
	}


	public String getCodigoPoblacion() {
		return codigoPoblacion;
	}


	public void setCodigoPoblacion(String codigoPoblacion) {
		this.codigoPoblacion = codigoPoblacion;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getHabitantes() {
		return habitantes;
	}


	public void setHabitantes(String habitantes) {
		this.habitantes = habitantes;
	}


	public String getCodigoProvincia() {
		return codigoProvincia;
	}


	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}
	
	
	
	

}
