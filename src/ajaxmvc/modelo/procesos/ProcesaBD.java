package ajaxmvc.modelo.procesos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Random;

import ajaxmvc.modelo.beans.*;

/**
 * Se encarga de proporcionar el servicio de acceso a BD
 * @author Eduardo A. Ponce
 * @version Ajax-MVC2
 */
public class ProcesaBD {
	
	/**
	 * Datasource
	 */
	DataSource ds = null;
	
	/**
	 * Constructor que recibe el datasource
	 * @param ds El datasource para el acceso a la base de datos
	 */
	public ProcesaBD(DataSource ds) {
		this.ds = ds;
	}
	/**
	 * Comprueba si existe un usuario y se valida su clave. En caso de login y clave correctos, 
	 * se devuelve true, en caso contrario, false.
	 * @param login Login del usuario a localizar
	 * @param clave Clave del usuario a localizar
	 * @return
	 */
	public boolean eliminaCliente(String codigo) {
		boolean existe = false;
		Connection conBD = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = null;
	
		sentenciaSQL = "select * from clientes where Codigo = '"+codigo+"'";
		try {
        	conBD = ds.getConnection();
        	st = conBD.createStatement();
        	rs = st.executeQuery(sentenciaSQL);

        	if (rs.next())
        	{
        		if (rs.getString("Codigo").equals(codigo)){
            		sentenciaSQL = "DELETE FROM clientes WHERE Codigo = '"+codigo+"'";
            		st.executeUpdate(sentenciaSQL);
        			existe = true;
        		}
        			
        	}
        }
        catch(Exception excepcion) {
        	excepcion.printStackTrace();
        }
		finally {
			if (conBD!=null)
				try {
					conBD.close();
				}
				catch(SQLException sqle)
				{
					System.out.println(sqle);
				}
		}		
		return existe;
	}

	
	
	/**
	 * Devuelve un ArrayList de objetos provincia
	 * @return El objeto provincia que corresponde al codigo que le pasamos
	 */
	public ArrayList<Provincia> getProvincias() {
		ArrayList<Provincia> lista = new ArrayList<Provincia>();
		Provincia provincia = null;
		
		Connection conBD = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = null;
		
		sentenciaSQL = "select * from provincias";
		try {
        	conBD = ds.getConnection();
        	st = conBD.createStatement();
        	rs = st.executeQuery(sentenciaSQL);

        	while (rs.next())
        	{
        		provincia = new Provincia();
        		provincia.setCodigoProvincia(rs.getString("CodigoProvincia"));
        		provincia.setProvincia(rs.getString("Provincia"));
        		lista.add(provincia);
        	}
        }
        catch(Exception excepcion) {
        	excepcion.printStackTrace();
        }
		finally {
			if (conBD!=null)
				try {
					conBD.close();
				}
				catch(SQLException sqle)
				{
					System.out.println(sqle);
				}
		}		
		return lista;
	}
	
	
	
	/**
	 * Devuelve un ArrayList de objetos poblacion
	 * @return El objeto poblacion que corresponde al codigo que le pasamos
	 */
	public ArrayList<Poblacion> getPoblaciones(String codigo) {
		ArrayList<Poblacion> lista = new ArrayList<Poblacion>();
		Poblacion poblacion = null;
		
		Connection conBD = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = null;
		
		sentenciaSQL = "select * from poblaciones where CodigoProvincia = '"+codigo+"'";
		try {
        	conBD = ds.getConnection();
        	st = conBD.createStatement();
        	rs = st.executeQuery(sentenciaSQL);

        	while (rs.next())
        	{
        		poblacion = new Poblacion();
        		poblacion.setCodigoPoblacion(rs.getString("CodigoPoblacion"));
        		poblacion.setPoblacion(rs.getString("Poblacion"));
        		lista.add(poblacion);
        	}
        }
        catch(Exception excepcion) {
        	excepcion.printStackTrace();
        }
		finally {
			if (conBD!=null)
				try {
					conBD.close();
				}
				catch(SQLException sqle)
				{
					System.out.println(sqle);
				}
		}		
		return lista;
	}
	
	
	/**
	 * Devuelve un ArrayList de objetos calle
	 * @return El objeto calle que corresponde al codigo que le pasamos
	 */
	public ArrayList<Calle> getCalles(String codigo) {
		ArrayList<Calle> lista = new ArrayList<Calle>();
		Calle calle = null;
		
		Connection conBD = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = null;
		
		sentenciaSQL = "select * from callespoblaciones where CodPoblacion = '"+codigo+"'";
		try {
        	conBD = ds.getConnection();
        	st = conBD.createStatement();
        	rs = st.executeQuery(sentenciaSQL);

        	while (rs.next())
        	{
        		calle = new Calle();
        		calle.setIdCalle(rs.getString("idCalle"));
        		calle.setNombre(rs.getString("Nombre"));
        		lista.add(calle);
        	}
        }
        catch(Exception excepcion) {
        	excepcion.printStackTrace();
        }
		finally {
			if (conBD!=null)
				try {
					conBD.close();
				}
				catch(SQLException sqle)
				{
					System.out.println(sqle);
				}
		}		
		return lista;
	}
	
	
	
	
	/**
	 * Devuelve un ArrayList de objetos Cliente
	 * @return El objeto cliente que corresponde al codigo que le pasamos
	 */
	public ArrayList<Cliente> getCliente(String codigo) {
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		Cliente lcliente = null;
		
		Connection conBD = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = null;
		
		sentenciaSQL = "select * from clientes where Codigo = '"+codigo+"'";
		try {
        	conBD = ds.getConnection();
        	st = conBD.createStatement();
        	rs = st.executeQuery(sentenciaSQL);

        	while (rs.next())
        	{
        		lcliente = new Cliente();
        		lcliente.setCodigo(rs.getString("Codigo"));
        		lcliente.setNombre(rs.getString("Nombre"));
        		lcliente.setApellido(rs.getString("Apellido"));
        		lcliente.setApellido2(rs.getString("Apellido2"));
        		lcliente.setCalle(rs.getString("Calle"));
        		lcliente.setNumero(rs.getString("Numero"));
        		lcliente.setPiso(rs.getString("Piso"));
        		lcliente.setMetros(rs.getString("Metros"));
        		lcliente.setCodigoPoblacion(rs.getString("CodigoPoblacion"));
        		lcliente.setCodigoProvincia(rs.getString("CodigoProvincia"));
        		cliente.add(lcliente);
        	}
        }
        catch(Exception excepcion) {
        	excepcion.printStackTrace();
        }
		finally {
			if (conBD!=null)
				try {
					conBD.close();
				}
				catch(SQLException sqle)
				{
					System.out.println(sqle);
				}
		}		
		return cliente;
	}
	
	
	
	
	/**
	 * Realiza el proceso de registro de un usuario. Si el proceso se completa correctamente
	 * se devolverá true, en caso contrario, false.
	 * @param user Objeto que encapsula login y clave del usuario a registrar.
	 * @return true si se ha podido registrar al usuario, false en caso contrario.
	 */
	public boolean registrar(Cliente cliente){
		boolean registrado = false;
		Connection conBD = null;
		Statement st = null;
		ResultSet rs = null;
		String sentenciaSQL = null;
	
		sentenciaSQL = "select * from clientes where Codigo = '"+cliente.getNombre()+"'";
		try {
        	conBD = ds.getConnection();
        	st = conBD.createStatement();
        	rs = st.executeQuery(sentenciaSQL);

        	if (!rs.next())
        	{
        		sentenciaSQL = "insert into clientes(Nombre , Apellido , Apellido2 , Calle , Numero , Piso , Metros , CodigoPoblacion , CodigoProvincia )"
        				+ " values('"+cliente.getNombre()+"','"+cliente.getApellido()+"','"+cliente.getApellido2()+"'"
        						+ ",'"+cliente.getCalle()+"','"+cliente.getNumero()+"','"+cliente.getPiso()+"','"+cliente.getMetros()+"'"
        								+ ",'"+cliente.getCodigoPoblacion()+"','"+cliente.getCodigoProvincia()+"')";
        		st.executeUpdate(sentenciaSQL);

        		registrado=true;
        	}
        }
        catch(Exception excepcion) {
        	excepcion.printStackTrace();
        }
		finally {
			if (conBD!=null)
				try {
					conBD.close();
				}
				catch(SQLException sqle)
				{
					System.out.println(sqle);
				}
		}	
		return registrado;
	}
}
