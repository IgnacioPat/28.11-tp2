package datos;

public class Cafe {

	private static int au;
	private int id;
	private int tipo; 
	private double precio;
	
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
	public Cafe(int id, int tipo, double precio) {
		super();
		this.id = au;
		Cafe.au++;
		this.tipo = tipo;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Cafe [id=" + id + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	
	
}
