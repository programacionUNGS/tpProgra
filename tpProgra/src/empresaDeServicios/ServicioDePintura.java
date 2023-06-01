package empresaDeServicios;

public class ServicioDePintura extends Servicio {
	private int metrosCuadrados;
	private double precioPorMetroCuadrado;
	
	public ServicioDePintura(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int metrosCuadrados, double precioPorMetroCuadrado) {
		super(tipoDeServicio, domicilioDeServicio, especialista, (metrosCuadrados * precioPorMetroCuadrado));

		this.metrosCuadrados = metrosCuadrados;
		this.precioPorMetroCuadrado = precioPorMetroCuadrado;
	}
	
	
	
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getPrecioPorMetroCuadrado() {
		return precioPorMetroCuadrado;
	}

	public void setPrecioPorMetroCuadrado(double precioPorMetroCuadrado) {
		this.precioPorMetroCuadrado = precioPorMetroCuadrado;
	}
	
	

	public void solicitarServicioPintura(int dni, int nroEspecialista, String direccion, int metrosCuadrados, double precioPorMetroCuadrado) {
		this.metrosCuadrados = metrosCuadrados;
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
	}
   
  

//_________________________________________________________________________________________________________________________________________________________________________	

	@Override
	public double calcularPrecioDeServicio(int metrosCuadrados, double precioPorMetroCuadrado) {
	  return metrosCuadrados * precioPorMetroCuadrado;
	}
    
    
	
}
