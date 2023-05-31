package tp;

import java.util.List;

public class Especialista {
	private String nombre;
	private String servicio;
	private int codigo;
	private int nroEspecialista;
	private String tipo;
	private List<Servicio> serviciosRealizados;
	
    public Especialista(String nombre, String servicio, int codigo, int nroEspecialista) {
        this.nombre = nombre;
        this.servicio = servicio;
        this.codigo = codigo;
        this.nroEspecialista = nroEspecialista;       
    	}
        
    public String consultarNombre() {
    	return nombre;
    }
    public String consultarTipoServicio() {
    	return servicio;
    }
    public int consultarCodigo() {
    	return codigo;
    }
    public int nroEspecialista() {
    	return nroEspecialista;
    }
    public String consultarTipo() {
    	return tipo;
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
