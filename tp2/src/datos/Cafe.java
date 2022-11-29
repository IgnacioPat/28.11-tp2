package datos;

public class Cafe {

	private static int au;
	private int id;
	private int tipo; 
	private double precio;
	private String nombre;
	private int cantidad=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Cafe(int id, int tipo, double precio,String nombre,int cantidad) {
		super();
		this.id = au;
		Cafe.au++;
		this.tipo = tipo;
		this.precio = precio;
		this.nombre= nombre;
	}
	@Override
	public String toString() {
		return "Compra de un cafe id " + id + ", tipo " + tipo + ", precio " + precio /*+",nombre " + nombre*/;
	}
	
	
	
}
