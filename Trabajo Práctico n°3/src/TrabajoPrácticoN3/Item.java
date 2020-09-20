package TrabajoPrácticoN3;
import java.util.*;

public class Item {
	private HashSet <Articulo> articulo;
	private int cantidad;
	
	
	public HashSet<Articulo> getArticulo() {
		return articulo;
	}
	public void setArticulo(HashSet<Articulo> articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	public String toString() {
		return "Item [articulo=" + articulo + ", cantidad=" + cantidad + "]";
	}
	
	public Item(HashSet<Articulo> articulo, int cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	
	
	
	
	
}
