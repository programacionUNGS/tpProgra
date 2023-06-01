package empresaDeServicios;

public class ServicioDeElectricidad extends Servicio{
	private double valorHora;
	private int horasTrabajo;
	
	public ServicioDeElectricidad(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio, double valorHora, int horasTrabajo) {
		
		super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio);
		
		this.setValorHora(valorHora);
		this.setHorasTrabajo(horasTrabajo);
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
//_________________________________________________________________________________________________________________________________________________________________________	

	@Override
	public double calcularPrecioDeServicio(double valorHora, int horasTrabajo) {
		double precio = valorHora * horasTrabajo;
		return precio;
	}
	
}

