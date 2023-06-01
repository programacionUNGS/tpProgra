package empresaDeServicios;

public class ServicioDeGas extends Servicio {
    private int cantDeArtefactos;
    private double precioPorArtefacto;
    
    public ServicioDeGas(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio, int cantDeArtefactos, double precioPorArtefacto) {
        super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio);

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

	
	
}
