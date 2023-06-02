package empresaDeServicios;

public class Servicio {
	private String tipoDeServicio;
	private String domicilioDeServicio;
	private Especialista especialista;
	private int costoServicio;
	private int costoMateriales;	
	private int cantHoras;
	private int codServicio;
	
	public Servicio(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int costoServicio, int costoMateriales, int cantHoras, String codServicio) {
        this.tipoDeServicio = tipoDeServicio;
        this.domicilioDeServicio = domicilioDeServicio;
        this.especialista = especialista;
        this.costoServicio = costoServicio;
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
	
	public int getCantHoras() {
		return cantHoras;
	}
	
	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	public String getCodServicio() {
		return codServicio;
	}
	
	public void setCodServicio(String codServicio) {
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
	
	
	public double finalizarServicio(int costoMateriales, int cantHoras) {
		this.costoMateriales = costoMateriales;
		this.cantHoras = cantHoras;
		return costoMateriales * cantHoras;
	}
	
	public void cambiarEspecialistaResponsable(Especialista especialistaNuevo) {
		this.especialista = especialistaNuevo;
	}
		
		
	public double calcularPrecioDeServicio() { 
		return (costoServicio * cantHoras) + costoMateriales;
	}
	
}
