package TrabajoPrácticoN3;

public class Herramientas extends Articulo{
	private String descripcion;

	
	public Herramientas(String nombre2, double precio2, String descripcion) {
		super(nombre2, precio2);
		this.descripcion = descripcion;
	}


	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public String toString() {
		return "Herramientas [descripcion=" + descripcion + "]";
	}

	
	
}
