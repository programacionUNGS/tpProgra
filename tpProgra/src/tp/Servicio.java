package tp;

public class Servicio {
	private String tipo;
	private String domicilio;
	private Especialista especialista;
	private double costoServicio;
	private double costoMateriales;
	private String codigoServicio;
	
	public Servicio(String tipo, Especialista especialista, String domicilio) {
	    this.tipo = tipo;
	    this.especialista = especialista;
	    this.domicilio = domicilio;
	}
	
	public Servicio(String tipo, String domicilio, Especialista especialista, double costoServicio, double costoMateriales) {
        this.tipo = tipo;
        this.domicilio = domicilio;
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
