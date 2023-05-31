package tp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class Empresa {
	private String nombre;
	private double facturacion;
	private HashMap<String, Especialista> especialistas;
	private ArrayList<Cliente> clientes;
	private ArrayList<Servicio> servicios;
	
		public Empresa(String nombre) {
			clientes = new ArrayList<>();
			servicios = new ArrayList<>();
			facturacion = 0.0;
			HashMap<String, Especialista> especialistas = new HashMap<>();
			}
	
	   public void registrarCliente(String numero, String nombre, String contacto) {
	        Cliente cliente = new Cliente(numero, nombre, contacto);
	        clientes.add(cliente);
	    }

	    public void registrarEspecialista(String nombre, String servicio, int codigo, String numero) {
	        Especialista especialista = new Especialista(nombre, servicio, codigo, numero);
	        especialistas.put(especialista);
	    }
	
	    public void solicitarServicio(String tipo, Especialista nombreEspecialista, String domicilio) {
	    	Servicio servicio = new Servicio(tipo, nombreEspecialista, domicilio);
	    }
	    	
	    public double consultarFacturacion() {
	    	return facturacion;
	    }
	    
	    public double facturacionPorTipoDeServicio(String tipo);
	    
	    public void consultarServiciosAtendidos(int codigo);
	    
	    public int solicitarServicioPintura(int dni, int nroEspecialista, String direccion, int metrosCuadrados, double precioPorMetroCuadrado);

	    public int solicitarServicioPintura(int dni, int nroEspecialista,String direccion, int metrosCuadrados,double precioPorMetroCuadrado, int piso,double seguro, double alqAndamios);
	    
	    public int solicitarServicioGasistaInstalacion(int dni, int nroEspecialista,
	    		 String direccion, int cantArtefactos,
	    		 double precioPorArtefacto);
	    
	    public int solicitarServicioGasistaRevision(int dni, int nroEspecialista,
	    		 String direccion, int cantArtefactos,
	    		 double precioPorArtefacto);
	    
	    public double finalizarServicio(int codServicio, double costoMateriales);
	    
	    public Map<String,Integer> cantidadDeServiciosRealizadosPorTipo();
	    
	    public double facturacionTotalPorTipo(String tipoServicio);
	    
	    public double facturacionTotal();
	    
	    public void cambiarResponsable(int codServicio, int nroEspecialista);
	    
	    public String listadoServiciosAtendidosPorEspecialista(int nroEspecialista) {
	        Especialista especialista = null;
	        for (Especialista esp : listaEspecialistas) {
	            if (esp.getNumero() == nroEspecialista) {
	                especialista = esp;
	                break;
	            }
	        }
	        if (especialista == null) {
	            return "Especialista no encontrado";
	        }
	        StringBuilder listado = new StringBuilder();
	        listado.append("Listado de servicios atendidos por el especialista:\n");
	        for (Servicio servicio : especialista.getHistorialServicios()) {
	            listado.append(servicio.getCodigoServicio()).append(" - ").append(servicio.consultarTipo()).append(" ").append(servicio.getDomicilio()).append("\n");
	        }
	        return listado.toString();
	    }
	    
	    public static HashMap<String, Integer> cantidadDeServiciosRealizadosPorTipo(HashMap<String, Especialista> especialistas) {
	        HashMap<String, Integer> cantidadServiciosPorTipo = new HashMap<>();
	        for (Especialista especialista : especialistas.values()) {
	            String tipoServicio = especialista.consultarTipoServicio();
	            if (cantidadServiciosPorTipo.containsKey(tipoServicio)) {
	                int cantidadActual = cantidadServiciosPorTipo.get(tipoServicio);
	                cantidadServiciosPorTipo.put(tipoServicio, cantidadActual + 1);
	            } else {
	                cantidadServiciosPorTipo.put(tipoServicio, 1);
	            }
	        }
	        return cantidadServiciosPorTipo;
	    }

	
}
