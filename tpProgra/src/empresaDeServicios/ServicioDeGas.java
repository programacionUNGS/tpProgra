package empresaDeServicios;

public class ServicioDeGas extends Servicio {
    private int cantDeArtefactos;
    private int precioPorArtefacto;
    
    public ServicioDeGas(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int costoServicio, int costoMateriales, int cantHoras, int codServicio, int cantDeArtefactos, int precioPorArtefacto) {
        super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio, costoMateriales, cantHoras, codServicio);

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
