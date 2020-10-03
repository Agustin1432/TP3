package TrabajoPracticoN3;

public class Herramientas extends Articulo{
	private String descripcion;

	
	public Herramientas(String nombre, double precio2, String descripcion) {
		super(nombre, precio2);
		this.descripcion = descripcion;
	}


	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public String toString() {
		return getNombre()+"Herramientas [descripcion=" + descripcion + "]";
	}

	
	
}
