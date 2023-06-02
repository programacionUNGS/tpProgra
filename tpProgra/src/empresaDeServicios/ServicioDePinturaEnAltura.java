package empresaDeServicios;

public class ServicioDePinturaEnAltura extends ServicioDePintura{
	private int cantPisos;
	private double valorAndamios;
	private double valorSeguro;
	
    public ServicioDePinturaEnAltura(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int costoServicio, int cantHoras, int codServicio, int metrosCuadrados, int precioPorMetroCuadrado, int cantPisos,double valorSeguro,double valorAndamios) {
        
    	super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio, cantHoras, codServicio, metrosCuadrados, precioPorMetroCuadrado);

        this.valorSeguro = valorSeguro;
        this.valorAndamios = valorAndamios;
        this.cantPisos = cantPisos;
    }
    
    
	public int getCantPisos() {
		return cantPisos;
	}

	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}

	public double getValorAndamios() {
		return valorAndamios;
	}

	public void setValorAndamios(double valorAndamios) {
		this.valorAndamios = valorAndamios;
	}

	public double getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	

//_________________________________________________________________________________________________________________________________________________________________________	

	@Override
	public double calcularPrecioDeServicio() {
		return super.calcularPrecioDeServicio() + valorAndamios + valorSeguro;
			
	}
		
	
	
	
	

	
}
