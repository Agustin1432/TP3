package TrabajoPrácticoN3;

public abstract class Articulo {
	private String nombre;
	private double precio;
	
	public Articulo(String nombre2, double precio2) {
		
	}


	public abstract String descripcion();
	

	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + precio + "]";
	}
	

	
}
