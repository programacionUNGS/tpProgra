package empresaDeServicios;

public class ServicioDeGasInstalacion extends ServicioDeGas{

    public ServicioDeGasInstalacion(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, double costoServicio, int cantDeArtefactos, double precioPorArtefacto) {
    	
    	super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio, cantDeArtefactos, precioPorArtefacto);
        
    }

//_________________________________________________________________________________________________________________________________________________________________________	

  @Override  
  public double calcularPrecioDeServicio(int cantDeArtefactos, double precioPorArtefacto) {
	  return precioPorArtefacto * cantDeArtefactos;
  }

    
}
