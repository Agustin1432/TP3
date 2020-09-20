package TrabajoPrácticoN3;

public class Industrial extends Electricidad{
	private double temperatiraMinima;
	private double temperaturaMaxima;
	
	
	
	
	public double getTemperatiraMinima() {
		return temperatiraMinima;
	}
	public void setTemperatiraMinima(double temperatiraMinima) {
		this.temperatiraMinima = temperatiraMinima;
	}
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public String toString() {
		return "Industrial [temperatiraMinima=" + temperatiraMinima + ", temperaturaMaxima=" + temperaturaMaxima + "]";
	}
	
	public Industrial(String nombre, double precio, double potenciaMaxima, double temperatiraMinima,
			double temperaturaMaxima) {
		super(nombre, precio, potenciaMaxima);
		this.temperatiraMinima = temperatiraMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}
	@Override
	public String descripcion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
