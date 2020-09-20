package TrabajoPrácticoN3;

public abstract class Electricidad extends Articulo {
	private double potenciaMaxima;

	


	public double getPotenciaMaxima() {
		return potenciaMaxima;
	}

	public void setPotenciaMaxima(double potenciaMaxima) {
		this.potenciaMaxima = potenciaMaxima;
	}

	public String toString() {
		return "Electricidad [potenciaMaxima=" + potenciaMaxima + "]";
	}

	
	public Electricidad(String nombre, double precio, double potenciaMaxima) {
		super(nombre, precio);
		this.potenciaMaxima = potenciaMaxima;
	}
	
	
}
