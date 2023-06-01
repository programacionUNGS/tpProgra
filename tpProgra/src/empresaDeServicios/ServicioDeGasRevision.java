package empresaDeServicios;

public class ServicioDeGasRevision extends ServicioDeGas {
    private double descuento;
    
    public ServicioDeGasRevision(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio, int cantDeArfactos, double descuento) {

        super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio, cantDeArfactos);
        
        this.descuento = descuento;
    }

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
//_________________________________________________________________________________________________________________________________________________________________________	

	@Override
	public double calcularPrecioDeServicio(int cantDeArtefactos, double costoDeServicio, double decuento) {
		if (cantDeArtefactos >= 5) {
			return costoDeServicio - descuento;
		}else {
			return costoDeServicio;
		}
	}

}
