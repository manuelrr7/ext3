package ajaxmvc.modelo.beans;

public class Provincia {

	private String codigoProvincia;
	private String provincia;
	private String error;
	
	public Provincia() {

	}
	
	public Provincia(String codigoProvincia, String provincia) {
		super();
		this.codigoProvincia = codigoProvincia;
		this.provincia = provincia;
		
	}
	
	public Provincia(String codigoProvincia, String provincia, String error) {
		super();
		this.codigoProvincia = codigoProvincia;
		this.provincia = provincia;
		this.error = error;
	}

	public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
}
