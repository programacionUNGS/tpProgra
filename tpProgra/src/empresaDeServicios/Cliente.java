package empresaDeServicios;

public class Cliente {
	private int dni;
	private String nombre;
	private String contacto;

    public Cliente(int dni, String nombreCliente, String contacto) {
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
