package TrabajoPracticoN3;

public abstract class Articulo {
	private String nombre;
	private double precio;
	
	public Articulo(String nombre2, double precio2) {
		this.nombre=nombre2;
		this.precio=precio2;
	}
	
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


	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + precio + "]";
	}



	

	
}
