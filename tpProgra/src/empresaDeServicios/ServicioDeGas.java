package empresaDeServicios;

public class ServicioDeGas extends Servicio {
    private int cantDeArtefactos;
    private int precioPorArtefacto;
    
    public ServicioDeGas(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int codServicio, int cantDeArtefactos, int precioPorArtefacto) {
        super(tipoDeServicio, domicilioDeServicio, especialista, codServicio);

        this.cantDeArtefactos = cantDeArtefactos;
        this.precioPorArtefacto = precioPorArtefacto;

    }
        
    public int getCantDeArtefactos() {
		return cantDeArtefactos;
	}

	public void setCantDeArtefactos(int cantDeArtefactos) {
		this.cantDeArtefactos = cantDeArtefactos;
	}
	
	 public double getPrecioPorArtefacto() {
			return precioPorArtefacto;
		}

		public void setPrecioPorArtefacto(int precioPorArtefacto) {
			this.precioPorArtefacto = precioPorArtefacto;
		}

//_________________________________________________________________________________________________________________________________________________________________________	

	@Override  
	public double calcularPrecioDeServicio() {
		return super.calcularPrecioDeServicio() + (precioPorArtefacto * cantDeArtefactos);
	}
	
}
