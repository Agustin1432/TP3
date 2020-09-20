package TrabajoPrácticoN3;

public abstract class Articulo {
	private String nombre;
	private double precio;
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract String descripcion();
	

	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public Articulo(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
}
