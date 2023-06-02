package empresaDeServicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Empresa {
	private double facturacion;
	private Map<Integer, Especialista> especialistas;
	private List<Cliente> clientes;
	private ArrayList<Servicio> servicios;
	
		public Empresa() {
			clientes = new ArrayList<>();
			servicios = new ArrayList<>();
			facturacion = 0.0;
			}
//REGISTRAR
		
	   public void registrarCliente(int dni, String nombre, String contacto) {
	        Cliente cliente = new Cliente(dni, nombre, contacto);
	        clientes.add(cliente);
	    }
	   
	   public void registrarServicio(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio) {
		   Servicio servicio = new Servicio(tipoDeServicio, domicilioDeServicio, especialista, costoServicio);
		   servicios.add(servicio);
	   }
	   
	   public void registrarEspecialista(int codigoEspecialista, String nombreEspecialista, String telefono, String servicioEspecializado) { 
	        Especialista especialista = new Especialista(codigoEspecialista, nombreEspecialista, telefono, servicioEspecializado);
	        especialistas.put(codigoEspecialista, especialista);
	    }
	   
//EXCEPCIONES DE LOS SOLICITAR DE CADA SERVICIO
	   
	   public int solicitarServicioElectricidad(int dni, int codigoEspecialista, String domicilioDeServicio, double valorHora, int horasTrabajo) {
		   if (!clientes.equals(dni)){
			   throw new RuntimeException("El dni ingresado no corresponde a un cliente registrado");
		   }
		   if (!especialistas.containsKey(codigoEspecialista)) {
			   throw new RuntimeException("El codigo del especialista es invalido");
		   }
		   if (!especialistas.get(codigoEspecialista).consultarTipoDeServicio.equals("ServicioDeElectricidad")){ //////?????????
			   throw new RuntimeException("El esepcialista no se esta especializado en este tipo de servicio");
		   }
		   if (domicilioDeServicio == null) {
			   throw new RuntimeException("Debe ingresar un domicilio");
		   }
		   if (valorHora <= 0) {
			   throw new RuntimeException("El valor del precio por hora no puede ser menor o igual a cero");
		   }
		   if (horasTrabajo <= 0) {
			   throw new RuntimeException("La cantidad de horas trabajadas no puede ser menor o igual a cero");
		   }
	   }
	   
	   
	   public int solicitarServicioPintura(int dni, int codigoEspecialista, String domicilioDeServicio, int metrosCuadrados, double precioPorMetroCuadrado) {
		   if (!clientes.equals(dni)){
			   throw new RuntimeException("El dni ingresado no corresponde a un cliente registrado");
		   }
		   if (!especialistas.containsKey(codigoEspecialista)) {
			   throw new RuntimeException("El codigo del especialista es invalido");
		   }
		   if (!especialistas.get(codigoEspecialista).consultarTipoDeServicio.equals("ServicioDeElectricidad")){ //////?????????
			   throw new RuntimeException("El esepcialista no se esta especializado en este tipo de servicio");
		   }
		   if (domicilioDeServicio == null) {
			   throw new RuntimeException("Debe ingresar un domicilio");
		   }
		   if (precioPorMetroCuadrado <= 0) {
			   throw new RuntimeException("El precio del servicio por metro cuadrado no puede ser menor o igual a cero");
		   }
		   if (metrosCuadrados <= 0) {
			   throw new RuntimeException("La cantidad de metros cuadrados de la superficie a pintar no puede ser menor o igual a cero");
		   }
	   }
	   
	   
	   public int solicitarServicioPintura(int dni, int codigoEspecialista, String domicilioDeServicio, int metrosCuadrados, double precioPorMetroCuadrado, int cantPisos, double valorAndamios, double valorSeguro) {
		   if (!clientes.equals(dni)){
			   throw new RuntimeException("El dni ingresado no corresponde a un cliente registrado");
		   }
		   if (!especialistas.containsKey(codigoEspecialista)) {
			   throw new RuntimeException("El codigo del especialista es invalido");
		   }
		   if (!especialistas.get(codigoEspecialista).consultarTipoDeServicio.equals("ServicioDeElectricidad")){ //////?????????
			   throw new RuntimeException("El esepcialista no se esta especializado en este tipo de servicio");
		   }
		   if (domicilioDeServicio == null) {
			   throw new RuntimeException("Debe ingresar un domicilio");
		   }
		   if (precioPorMetroCuadrado <= 0) {
			   throw new RuntimeException("El precio del servicio por metro cuadrado no puede ser menor o igual a cero");
		   }
		   if (metrosCuadrados <= 0) {
			   throw new RuntimeException("La cantidad de metros cuadrados de la superficie a pintar no puede ser menor o igual a cero");
		   }
		   if (cantPisos <= 0) {
			   throw new RuntimeException("La cantidad de pisos a pintar no puede ser menor o igual a cero");
		   }
		   if (valorAndamios <=0) {
			   throw new RuntimeException("El valor de los andamios no pude ser menor o igual a cero");
		   }
		   if (valorSeguro <=0) {
			   throw new RuntimeException("El valor del seguro no puede ser menor o igual a cero");
		   }
	   }
	   
	   
	   public int solicitarServicioGasistaInstalacion(int dni, int codigoEspecialista, String domicilioDeServicio, int cantDeArtefactos, int precioPorArtefacto) {
		   if (!clientes.equals(dni)){
			   throw new RuntimeException("El dni ingresado no corresponde a un cliente registrado");
		   }
		   if (!especialistas.containsKey(codigoEspecialista)) {
			   throw new RuntimeException("El codigo del especialista es invalido");
		   }
		   if (!especialistas.get(codigoEspecialista).consultarTipoDeServicio.equals("ServicioDeElectricidad")){ //////?????????
			   throw new RuntimeException("El esepcialista no se esta especializado en este tipo de servicio");
		   }
		   if (domicilioDeServicio == null) {
			   throw new RuntimeException("Debe ingresar un domicilio");
		   }
		   if (cantDeArtefactos <= 0) {
			   throw new RuntimeException("La cantidad de artefactos no pude ser menor o igual a cero");
		   }
		   if (precioPorArtefacto <= 0) {
			   throw new RuntimeException("El precio por intalar un artefacto no pude ser menor o igual a cero");
		   }
	   }
	   
	   
	   public int solicitarServicioGasistaRevision(int dni, int codigoEspecialista, String domicilioDeServicio, int cantDeArtefactos, int precioPorArtefacto) {
		   if (!clientes.equals(dni)){
			   throw new RuntimeException("El dni ingresado no corresponde a un cliente registrado");
		   }
		   if (!especialistas.containsKey(codigoEspecialista)) {
			   throw new RuntimeException("El codigo del especialista es invalido");
		   }
		   if (!especialistas.get(codigoEspecialista).consultarTipoDeServicio.equals("ServicioDeElectricidad")){ //////?????????
			   throw new RuntimeException("El esepcialista no se esta especializado en este tipo de servicio");
		   }
		   if (domicilioDeServicio == null) {
			   throw new RuntimeException("Debe ingresar un domicilio");
		   }
		   if (cantDeArtefactos <= 0) {
			   throw new RuntimeException("La cantidad de artefactos no pude ser menor o igual a cero");
		   }
		   if (precioPorArtefacto <= 0) {
			   throw new RuntimeException("El precio por intalar un artefacto no pude ser menor o igual a cero");
		   }
	   }
	   
	   
	   
	   public double finalizarServicio(int codServicio, int costoMateriales) {
		   Servicio servicioGuardado= null;
		   for (Servicio servicio : servicios){
			   if (servicio.getCodServicio() == codServicio) {
				   servicioGuardado = servicio;
			   }
		   }
		   if (servicioGuardado == null) {
			   throw new RuntimeException("El codigo del servicio no es valido");
		   }
		   double montoDeFinalizarServicio = costoMateriales + servicioGuardado.calcularPrecioDeServicio();
		   facturacion += montoDeFinalizarServicio;
		   
		   return  montoDeFinalizarServicio; 
	   }
	  
	   
	   
	   public static HashMap<String, Integer> cantidadDeServiciosRealizadosPorTipo(HashMap<String, Especialista> especialistas) {
 	        HashMap<String, Integer> cantidadServiciosPorTipo = new HashMap<>();
 	        for (Especialista especialista : especialistas.values()) {
 	            String tipoServicio = especialista.consultarTipoDeServicio();
 	            if (cantidadServiciosPorTipo.containsKey(tipoServicio)) {
 	                int cantidadActual = cantidadServiciosPorTipo.get(tipoServicio);
 	                cantidadServiciosPorTipo.put(tipoServicio, cantidadActual + 1);
 	            } else {
 	                cantidadServiciosPorTipo.put(tipoServicio, 1);
 	            }
 	        }
 	        return cantidadServiciosPorTipo;
 	    }
	   
	  
	   public double facturacionTotalPorTipo(String tipoServicio) {
	   		double precioFacturadoDeUnTipoDeServicio = 0;
	   		for (Servicio servicio : servicios) {
	   			if (esInvalido(tipoServicio) == true) {
	   				throw new RuntimeException("El tipo de servicio es invalido");
	   			}
	   			if (servicio.getTipoDeServicio().equals(tipoServicio)){
	   				precioFacturadoDeUnTipoDeServicio += servicio.calcularPrecioDeServicio();
	   			}
	   		}
	   		return precioFacturadoDeUnTipoDeServicio;
	   }
	   
	   	public boolean esInvalido (String tipoDeservicio) {
	   		for(Servicio servicio : servicios) {
	   			if (servicio.getTipoDeServicio().equals(tipoDeservicio)) {
	   				return false;
	   			}
	   		}
	   		return true;
	   	}
	   	
	   
	   
	   public double facturacionTotal() {
		   return facturacion;
	   }

	   
	   public void cambiarResponsable(int codigoServicio, int nroEspecialista) {

		   Servicio servicioGuardado= null;
		   for (Servicio servicio : servicios){
			   if (servicio.getCodServicio() ==codigoServicio) {
				   servicioGuardado = servicio;
			   }
		   }
		   if (servicioGuardado == null) {
			   throw new RuntimeException("El codigo del servicio no es valido");
		   }

		   Especialista especialistaGuardado = null; 
		   for (Especialista especialista : especialistas.values()) {
			   if (especialista.consultarCodigoEspecialista() == nroEspecialista) {
				   especialistaGuardado = especialista;
			   }
		   }
		   if (especialistaGuardado == null) {
			   throw new RuntimeException("El nro de especialista no es valido");
		   }

		   if (!especialistaGuardado.consultarTipoDeServicio().equals(servicioGuardado.consultarTipoDeServicio())) {
			   throw new RuntimeException("El especialista no se especializa en el servicio requerido");
		   }
		   
		   servicioGuardado.cambiarEspecialistaResponsable(especialistaGuardado);
		   
	   }   
	   

	   
	   
	   public String listadoServiciosAtendidosPorEspecialista(int nroEspecialista) {
	        Especialista especialista = null;
	        for (Especialista esp : especialistas) {
	            if (esp.consultarCodigo() == nroEspecialista) {
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
	   
//____________________________________________________________________________________________________________________________________________________________________________	   
	    	
	   
	    public List<Especialista> obtenerListaEspecialistas() {
	        List<Especialista> listaEspecialistas = new ArrayList<>();
	        for (Especialista especialista : especialistas.values()) {
	            listaEspecialistas.add(especialista);
	        }

	        return listaEspecialistas;
	    }
	   
	    
	    
	    
	
}
