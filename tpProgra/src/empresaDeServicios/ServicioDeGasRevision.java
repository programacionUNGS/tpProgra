package empresaDeServicios;

public class ServicioDeGasRevision extends ServicioDeGas {
    private int descuento;
    
    public ServicioDeGasRevision(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int costoServicio, int costoMateriales, int cantHoras, int codServicio, int cantDeArfactos, int precioPorArtefacto, int descuento) {
    	
        super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio, costoMateriales, cantHoras, codServicio, cantDeArfactos, precioPorArtefacto);
        
        this.descuento = descuento;
    }

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
//_________________________________________________________________________________________________________________________________________________________________________	

	@Override
	public double calcularPrecioDeServicio() {
		return super.calcularPrecioDeServicio() - descuento;
	}

}
