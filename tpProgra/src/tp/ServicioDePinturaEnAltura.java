package tp;

public class ServicioDePinturaEnAltura extends ServicioDePintura{
	private int cantPisos;
	private double valorAndamios;
	private double valorSeguro;
	
    public ServicioDePinturaEnAltura(String tipoDeServicio, String domicilioDeServicio, int superficieApintar,
            double costoPorMetroCuadrado,double valorSeguro,double valorAndamios) {
        super(tipoDeServicio, domicilioDeServicio, superficieApintar, costoPorMetroCuadrado);

        this.valorSeguro = valorSeguro;
        this.valorAndamios = valorAndamios;

    }
	
	public double calcularPrecioDeServicio(double valorSeguro, double valorAndamios, int cantPisos);
	
}
