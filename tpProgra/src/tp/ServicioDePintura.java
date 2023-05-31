package tp;

public class ServicioDePintura extends Servicio {
	private int metrosCuadrados;
	private double precioPorMetroCuadrado;
	
	public ServicioDePintura(int )
	
	
	public int solicitarServicioPintura(int dni, int nroEspecialista,
			 String direccion, int metrosCuadrados,
			 double precioPorMetroCuadrado) {
		this.metrosCuadrados = metrosCuadrados;
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
	}
    @Override
    public int calcularFacturacionDeServicio() {
        // TODO Auto-generated method stub
        return 0;
    }
	
}
