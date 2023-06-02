package empresaDeServicios;

public class Servicio {
	private String tipoDeServicio;
	private String domicilioDeServicio;
	private Especialista especialista;
	private int costoServicio;
	private int costoMateriales;	
	private int codServicio;
	
	public Servicio(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int codServicio) {
        this.tipoDeServicio = tipoDeServicio;
        this.domicilioDeServicio = domicilioDeServicio;
        this.especialista = especialista;
        this.codServicio = codServicio;
    }
	
    public String getTipoDeServicio() {
		return tipoDeServicio;
	}

	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	public String getDomicilioDeServicio() {
		return domicilioDeServicio;
	}

	public void setDomicilioDeServicio(String domicilioDeServicio) {
		this.domicilioDeServicio = domicilioDeServicio;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}

	public double getCostoServicio() {
		return costoServicio;
	}

	public void setCostoServicio(int costoServicio) {
		this.costoServicio = costoServicio;
	}
	
	public int getCostoMateriales() {
		return costoMateriales;
	}
	
	public void setCostoMateriales(int costoMateriales) {
		this.costoMateriales = costoMateriales;
	}
	
	public int getCodServicio() {
		return codServicio;
	}
	
	public void setCodServicio(int codServicio) {
		this.codServicio = codServicio;
	}

//_________________________________________________________________________________________________________________________________________________________________________	
	
//CONSULTAR
	
	public String consultarTipoDeServicio() {
		return tipoDeServicio;
	}
	
	public Especialista consultarResponsable() {
		return especialista;
	}
	
	public String consultarDomicilioDeServicio() {
		return domicilioDeServicio;
	}
	
	
	public double finalizarServicio(int costoMateriales) {
		this.costoMateriales = costoMateriales;
		return costoMateriales + costoServicio;
	}
	
	public void cambiarEspecialistaResponsable(Especialista especialistaNuevo) {
		this.especialista = especialistaNuevo;
	}
		
		
	public double calcularPrecioDeServicio() { 
		return costoServicio + costoMateriales;
	}
	
}
