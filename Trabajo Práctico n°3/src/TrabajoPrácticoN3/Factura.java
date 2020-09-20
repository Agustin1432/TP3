package TrabajoPrácticoN3;
import java.util.*;
public class Factura {
	private Date fecha;
	private long nroFactura;
	private char letra;
	private Cliente cliente;
	private Item item;
	
	
	
	
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public long getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(long nroFactura) {
		this.nroFactura = nroFactura;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public String toString() {
		return "Factura [fecha=" + fecha + ", nroFactura=" + nroFactura + ", letra=" + letra + "]";
	}
	
	public Factura(Date fecha, long nroFactura, char letra, Cliente cliente, Item item) {
		super();
		this.fecha = fecha;
		this.nroFactura = nroFactura;
		this.letra = letra;
		this.cliente = cliente;
		this.item = item;
	}
	
	
	
		
	
	
}
