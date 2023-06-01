package empresaDeServicios;

public class ServicioDeGasInstalacion extends ServicioDeGas{

    public ServicioDeGasInstalacion(String tipoDeServicio, String domicilioDeServicio, Especialista especialista, int costoServicio, int costoMateriales, int cantHoras, String codServicio, int cantDeArtefactos, int precioPorArtefacto) {
    	
    	super(tipoDeServicio, domicilioDeServicio, especialista, costoServicio, costoMateriales, cantHoras, codServicio, cantDeArtefactos, precioPorArtefacto);
        
    }

//_________________________________________________________________________________________________________________________________________________________________________	

  @Override  
  public int calcularPrecioDeServicio(int cantDeArtefactos, int precioPorArtefacto) {
	  return precioPorArtefacto * cantDeArtefactos;
  }

    
}
