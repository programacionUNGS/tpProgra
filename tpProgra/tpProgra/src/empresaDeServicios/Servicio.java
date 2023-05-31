package empresaDeServicios;

public class Servicio {
	private String tipoDeServicio;
	private String domicilioDeServicio;
	private Especialista especialista;
	private double costoServicio;
	private double costoMateriales;
	private String codigoServicio;
	
	public Servicio(String tipoDeServicio, Especialista especialista, String domicilioDeServicio) {
	    this.tipoDeServicio = tipoDeServicio;
	    this.especialista = especialista;
	    this.domicilioDeServicio = domicilioDeServicio;
	}
	
	public Servicio(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio, double costoMateriales) {
        this.tipoDeServicio = tipoDeServicio;
        this.domicilioDeServicio = domicilioDeServicio;
        this.especialista = especialista;
        this.costoServicio = costoServicio;
        this.costoMateriales = costoMateriales;
    }
    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }
    
    public String getDomicilio() {
    	return domicilio;
    }
    
	public double finalizarServicio(double costoMateriales, double costoServicio);
		return;
	}
	
	public String consultarTipo() {
		return tipo;
	}
	
	public Especialista consultarResponsable() {
		return especialista;
		}
	
	public String consultarDomicilio() {
		return domicilio;
		}
	public void cambiarResponsable(Especialista especialista) {
		this.especialista = especialista;
	}
	
}
