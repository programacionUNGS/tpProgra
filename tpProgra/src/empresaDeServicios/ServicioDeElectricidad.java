package empresaDeServicios;

public class ServicioDeElectricidad extends Servicio{
	private double valorHora;
	private int horasTrabajo;
	
	public ServicioDeElectricidad(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int costoServicio, int costoMateriales, int cantHoras, int codServicio, double valorHora, int horasTrabajo) {
		
		super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio, costoMateriales, cantHoras, codServicio);
		
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
	public double calcularPrecioDeServicio() {
		return super.calcularPrecioDeServicio() + (valorHora * horasTrabajo);
	}
	
}

