package empresaDeServicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Empresa {
	private String nombre;
	private double facturacion;
	private Map<Integer, Especialista> especialistas;
	private List<Cliente> clientes;
	private ArrayList<Servicio> servicios;
	
		public Empresa(String nombre) {
			clientes = new ArrayList<>();
			servicios = new ArrayList<>();
			facturacion = 0.0;
			this.nombre	= nombre;
			}
//REGISTRAR
		
	   public void registrarNuevoCliente(String nombre, int dni, String contacto) {
	        Cliente cliente = new Cliente(nombre, dni, contacto);
	        clientes.add(cliente);
	    }
	   
	   public void registrarNuevoServicio(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio) {
		   Servicio servicio = new Servicio(tipoDeServicio, domicilioDeServicio, especialista, costoServicio);
		   servicios.add(servicio);
	   }
	   
	   public void registrarNuevoEspecialista(String nombreEspecialista, int codigoEspecialista, int telefono, String servicioEspecializado) { 
	        Especialista especialista = new Especialista(nombreEspecialista, codigoEspecialista, telefono, servicioEspecializado);
	        especialistas.put(codigoEspecialista, especialista);
	    }
	   
//EXCEPCIONES DE LOS SOLICITAR DE CADA SERVICIO (ESTOY X ARMAR EL CODIGO QUE FALTA)
	   
	   public int solicitarServicioDeElectricidad(int dni, int codigoEspecialista, String domicilioDeServicio, double valorHora, int horasTrabajo) {
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
	   
	   
	   public int solicitarServicioDePintura(int dni, int codigoEspecialista, String domicilioDeServicio, int metrosCuadrados, double precioPorMetroCuadrado) {
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
	   
	   
	   public int solicitarServicioDePinturaEnAltura(int dni, int codigoEspecialista, String domicilioDeServicio, int metrosCuadrados, double precioPorMetroCuadrado, int cantPisos, double valorAndamios, double valorSeguro) {
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
	   
	   
	   public int solicitarServicioDeGasInstalacion(int dni, int codigoEspecialista, String domicilioDeServicio, int cantDeArtefactos, double precioPorArtefacto) {
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
	   
	   
	   public int solicitarServicioDeGasRevision(int dni, int codigoEspecialista, String domicilioDeServicio, int cantDeArtefactos, double precioPorArtefacto) {
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
	   
	   
	   
	   
	   /* Se registra que el servicio solicitado ya fué concluido. Para esto se debe
	   * ingresar el costo de los materiales utilizados para poder realizar el
	   * trabajo.
	   *
	   * Se devuelve el precio que se debe facturar al cliente.
	   * Este precio se obtiene sumando el costo de los materiales con el costo del
	   * servicio realizado. Cada tipo de servicio tiene su forma de calcular el
	   * costo del trabajo.
	   *
	   * Si el código de servicio no está en el sistema o el mismo ya fué finalizado,
	   * se debe generar una excepción.
	   *
	   * Se debe realizar esta operación en O(1).
	   */
	   public double finalizarServicio(int codServicio, double costoMateriales);
	  
	   
	   
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
	   
	   
	   /**
	   * Devuelve la suma del precio facturado de todos los servicios finalizados que                ?????FALTA ESTO
	   * son del tipo pasado por parámetro.
	   * Si el tipo de servicio es invalido, debe generar una excepción. /
	   */
	   public double facturacionTotalPorTipo(String tipoServicio) {
	   		double precioFacturadoDeUnTipoDeServicio = 0;
	   		for (Servicio servicio : servicios) {
	   			if (esInvalido(tipoServicio)== true) {
	   				throw new RuntimeException("El tipo de servicio es invalido");
	   			}else if (){
	   				
	   			}
	   		}	
	   }
	   	public boolean esInvalido (String tipoDeservicio) {
	   		for(Servicio servicio : servicios) {
	   			if (servicio.getTipoDeServicio().equals(tipoDeservicio)) {
	   				return false;
	   			}
	   		}
	   		return true;
	   	}
	   
	   
	   /**
	   * Devuelve la suma del precio facturado de todos los servicios finalizados que
	   * realizó la empresa.
	   */
	   public double facturacionTotal() {
		   
	   }
	   /**
	   * Debe cambiar el especialista responsable del servicio.
	   * Si código de Servicio o el nroEspecialista no están registrados en el sistema
	   * se debe generar una excepción.
	   * Si el especialista no se especializa en este tipo de servicio se debe generar
	   * una excepción.
	   *
	   *
	   * Se debe realizar esta operación en O(1).
	   */
	   public void cambiarResponsable(int codServicio, int nroEspecialista) {
		   
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
