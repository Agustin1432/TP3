package TrabajoPracticoN3;
import java.util.*;

public class Item {
	private Articulo articulo;
	private int cantidad;
	
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	public String toString() {
		return "Item [articulo=" + articulo + ", cantidad=" + cantidad + "]";
	}
	
	public Item(Articulo articulo, int cantidad) {
		super();
		this.articulo =  articulo;
		this.cantidad = cantidad;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	
	
	
	
}
