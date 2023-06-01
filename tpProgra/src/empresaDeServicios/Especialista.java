package empresaDeServicios;

import java.util.List;

public class Especialista {
	private int codigoEspecialista;
	private String nombreEspecialista;
	private String telefono;
	private String tipoDeServicio;
	private List<Servicio> serviciosRealizados;
	
    public Especialista(int codigoEspecialista, String nombreEspecialista, String telefono, String tipoDeServicio) {
        this.nombreEspecialista = nombreEspecialista;
        this.codigoEspecialista = codigoEspecialista;
        this.telefono = telefono;  
        this.tipoDeServicio = tipoDeServicio;
    	}
    
//_________________________________________________________________________________________________________________________________________________________________________	

//CONSULTAR
    
    public String consultarNombreEspecialista() {
    	return nombreEspecialista;
    }
    public int consultarCodigoEspecialista() {
    	return codigoEspecialista;
    }
    public String consultarTelefono() {
    	return telefono;
    }
    public String consultarTipoDeServicio() {
    	return tipoDeServicio;
    }
     
    
    
    public void agregarServicioRealizado(Servicio servicio) {
        serviciosRealizados.add(servicio);
        }
    
    public List<Servicio> consultarServiciosRealizados() {
        return serviciosRealizados;
    }
    public String obtenerHistorialServicios() {
        StringBuilder historial = new StringBuilder();
        for (Servicio servicio : serviciosRealizados) {
            historial.append("[").append(servicio.getCodigoServicio()).append(" - ")
            .append(servicio.consultarDomicilio()).append("] ").append(servicio.consultarDomicilio()).append("\n");
        }
        return historial.toString();
    }
	
    public List<Servicio> getHistorialServicios() {
        return serviciosRealizados;
    }

	
}
