package empresaDeServicios;

public class ServicioDeElectricidad extends Servicio{
	private double valorHora;
	private int horasTrabajo;
	
	public ServicioDeElectricidad(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int horasTrabajo, int codServicio, double valorHora) {
		
		super(tipoDeServicio, domicilioDeServicio, especialista, codServicio);
		
		this.valorHora = valorHora;
		this.horasTrabajo = horasTrabajo;
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
	public double calcularPrecioDeServicio() {
		return super.calcularPrecioDeServicio() + (valorHora * horasTrabajo);
	}
	
}

