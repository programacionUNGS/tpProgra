package empresaDeServicios;

public class Cliente {
	private String nombre;
	private int dni;
	private String contacto;

    public Cliente(String nombreCliente, int dni, String contacto) {
        this.nombre = nombreCliente;
        this.dni = dni;
        this.contacto = contacto;
    }
	public String nombre() {
		return nombre;
	}
	public int dni () {
		return dni;
	}
	public String contacto() {
		return contacto;
	}
}
