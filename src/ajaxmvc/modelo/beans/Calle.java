package ajaxmvc.modelo.beans;

public class Calle {
	
	private String idCalle;
	private String codPoblacion;
	private String nombre;
	private String codPostal;
	private String error;
	
	public Calle() {

	}	
	
	public Calle(String idCalle, String nombre) {
		
		this.idCalle = idCalle;
		this.nombre = nombre;
	}
	
	public Calle(String idCalle, String codPoblacion, String nombre) {
		
		this.idCalle = idCalle;
		this.codPoblacion = codPoblacion;
		this.nombre = nombre;
	}
	
	public Calle(String idCalle, String codPoblacion, String nombre, String codPostal) {
		
		this.idCalle = idCalle;
		this.codPoblacion = codPoblacion;
		this.nombre = nombre;
		this.codPostal = codPostal;
	}
	
	public Calle(String idCalle, String codPoblacion, String nombre, String codPostal, String error) {
		
		this.idCalle = idCalle;
		this.codPoblacion = codPoblacion;
		this.nombre = nombre;
		this.codPostal = codPostal;
		this.error = error;
	}

	public String getIdCalle() {
		return idCalle;
	}

	public void setIdCalle(String idCalle) {
		this.idCalle = idCalle;
	}

	public String getCodPoblacion() {
		return codPoblacion;
	}

	public void setCodPoblacion(String codPoblacion) {
		this.codPoblacion = codPoblacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	

}
