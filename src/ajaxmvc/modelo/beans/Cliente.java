package ajaxmvc.modelo.beans;

public class Cliente {
	
	
	private String codigo;
	private String nombre;
	private String apellido;
	private String apellido2;
	private String calle;
	private String numero;
	private String piso;
	private String metros;
	private String codigoPoblacion;
	private String codigoProvincia;
	private String error;
	
	
	public Cliente() {

	}
	
	public Cliente(String codigo, String nombre, String apellido, String apellido2, String calle, String numero,
			 String codigoPoblacion, String codigoProvincia) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.calle = calle;
		this.numero = numero;
		this.codigoPoblacion = codigoPoblacion;
		this.codigoProvincia = codigoProvincia;
	}
	
	public Cliente(String codigo, String nombre, String apellido, String apellido2, String calle, String numero,
			String piso, String codigoPoblacion, String codigoProvincia) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.codigoPoblacion = codigoPoblacion;
		this.codigoProvincia = codigoProvincia;
	}
	
	public Cliente(String codigo, String nombre, String apellido, String apellido2, String calle, String numero,
			String piso, String metros, String codigoPoblacion, String codigoProvincia) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.metros = metros;
		this.codigoPoblacion = codigoPoblacion;
		this.codigoProvincia = codigoProvincia;
	}
	
	public Cliente(String codigo, String nombre, String apellido, String apellido2, String calle, String numero,
			String piso, String metros, String codigoPoblacion, String codigoProvincia, String error) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.metros = metros;
		this.codigoPoblacion = codigoPoblacion;
		this.codigoProvincia = codigoProvincia;
		this.error = error;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getMetros() {
		return metros;
	}

	public void setMetros(String metros) {
		this.metros = metros;
	}

	public String getCodigoPoblacion() {
		return codigoPoblacion;
	}

	public void setCodigoPoblacion(String codigoPoblacion) {
		this.codigoPoblacion = codigoPoblacion;
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
