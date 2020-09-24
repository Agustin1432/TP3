package Controlador;

import java.util.Iterator;
import java.util.LinkedHashSet;
import TrabajoPr�cticoN3.Articulo;
import TrabajoPr�cticoN3.Cliente;
import TrabajoPr�cticoN3.Factura;

public class Constructor {
	private LinkedHashSet <TrabajoPr�cticoN3.Cliente> cliente;
	private LinkedHashSet <TrabajoPr�cticoN3.Factura> factura;
	private LinkedHashSet <TrabajoPr�cticoN3.Herramientas> herramienta;
	private LinkedHashSet <TrabajoPr�cticoN3.Industrial> industrial;
	private LinkedHashSet <TrabajoPr�cticoN3.Domiciliaria> domiciliaria;
	
	
	
	public LinkedHashSet<TrabajoPr�cticoN3.Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(LinkedHashSet<TrabajoPr�cticoN3.Cliente> cliente) {
		this.cliente = cliente;
	}
	public LinkedHashSet<TrabajoPr�cticoN3.Factura> getFactura() {
		return factura;
	}
	public void setFactura(LinkedHashSet<TrabajoPr�cticoN3.Factura> factura) {
		this.factura = factura;
	}
	
	
	public void crearCliente (TrabajoPr�cticoN3.Cliente cliente) {
		this.cliente.add(cliente);
	}
	public TrabajoPr�cticoN3.Cliente buscarCliente (String dni) {
		int z=0;
		TrabajoPr�cticoN3.Cliente buscar = null ;
		Iterator <Cliente> iterador = this.cliente.iterator();
		while(iterador.hasNext()&& z==0) {
			if(iterador.next().getDni()==dni) {
				buscar=new TrabajoPr�cticoN3.Cliente(iterador.next().getNombre(),iterador.next().getApellido(),iterador.next().getDni(),iterador.next().getDireccion(),iterador.next().getTelefono());
				z=1;
			}
		}
		return buscar;	
	}
	//FALTA HACER EDITAR CLIENTE
	public void editarCliente (String dni) {
		
		Iterator <Cliente> iterador = this.cliente.iterator();
		while(iterador.hasNext()) {
			if(iterador.next().getDni()==dni) {
				
			}
		}	
	}
	public void eliminarCliente (String dni) {
			Iterator <Cliente> iterador = this.cliente.iterator();
			while(iterador.hasNext()) {
				if(iterador.next().getDni()==dni) {
					iterador.remove();
				}
			}	
		}

	
	public void crearArticulo (TrabajoPr�cticoN3.Herramientas herramienta,TrabajoPr�cticoN3.Industrial industrial,TrabajoPr�cticoN3.Domiciliaria domiciliaria) {
		if(herramienta==null) {
			this.herramienta.add(herramienta);
		}else{
			if(industrial==null) {
				this.industrial.add(industrial);
			}
			else{
				this.domiciliaria.add(domiciliaria);
			}
		}
	}
	
	public TrabajoPr�cticoN3.Articulo buscarArticulo(String nombre) {
		int z=0;
		TrabajoPr�cticoN3.Articulo buscar = null ;
		Iterator <Articulo> iterador = this.articulo.iterator();
		while(iterador.hasNext() && z==0) {
			if(iterador.next().==dni) {
				buscar=new TrabajoPr�cticoN3.Cliente(iterador.next().getNombre(),iterador.next().getApellido(),iterador.next().getDni(),iterador.next().getDireccion(),iterador.next().getTelefono());
				z=1;
			}
		}
		return buscar;	
	}
	
	
	
	
	
	
	
}
