package empresaDeServicios;

public class ServicioDeGasInstalacion extends ServicioDeGas{
	private int descuento;

    public servicioDeGasInstalacion(String tipoDeServicio, String domicilioDeServicio,double cantidadDeArfactos, int descuento) {
    	super(tipoDeServicio,domicilioDeServicio,cantidadDeArfactos);
        
    	this.descuento = descuento;

        // TODO Auto-generated constructor stub
    }


}
