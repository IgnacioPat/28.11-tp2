package datos;

public class Cliente {
	private int id;
	private static int au;
	private String nombre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Cliente(int id, String nombre) {
		super();
		this.id = au;
		au++;
		this.nombre = nombre;
	}

	
	
}
