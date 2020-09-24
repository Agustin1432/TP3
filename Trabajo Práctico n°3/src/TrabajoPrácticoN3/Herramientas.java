package TrabajoPrácticoN3;

public class Herramientas extends Articulo{
	
	
	public Herramientas(String nombre, double precio) {
		super(nombre, precio);
		
	}

	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public String toString() {
		return "Herramientas [descripcion=" + descripcion + "]";
	}

	@Override
	public String descripcion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
