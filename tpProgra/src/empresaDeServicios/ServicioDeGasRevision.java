package tp;

public class ServicioDeGasRevision extends ServicioDeGas {
    private int descuento;

    public servicioDeGasRevision(String tipoDeServicio, String domicilioDeServicio,double cantidadDeArfactos, int descuento) {

        super(tipoDeServicio,domicilioDeServicio,cantidadDeArfactos);
        this.descuento = descuento;
    
        // TODO Auto-generated constructor stub
    }
}
