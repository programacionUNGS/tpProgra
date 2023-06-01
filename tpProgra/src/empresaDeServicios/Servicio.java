package empresaDeServicios;

public class Servicio {
	private String tipoDeServicio;
	private String domicilioDeServicio;
	private Especialista especialista;
	private double costoServicio;
	private double costoMateriales;	
	private int cantHoras;
	
	public Servicio(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio) {
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

	public void setCostoServicio(double costoServicio) {
		this.costoServicio = costoServicio;
	}
	
	public double getCostoMateriales() {
		return costoMateriales;
	}
	
	public void setCostoMateriales(double costoMateriales) {
		this.costoMateriales = costoMateriales;
	}
	
	public int getCantHoras() {
		return cantHoras;
	}
	
	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
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
	
	
	
	
	public double finalizarServicio(double costoMateriales, int cantHoras) { //ESTO TMBIEN ESTA EN EMPRESA
		this.costoMateriales = costoMateriales;
		this.cantHoras = cantHoras;
		return costoMateriales + cantHoras;
	}
		
	public void cambiarResponsable(Especialista especialista) {
		this.especialista = especialista;
	}
	
	public double calcularPrecioDeServicio() { 
		return (costoServicio * cantHoras) + costoMateriales;
	}
	
}
