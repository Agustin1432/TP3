package Controlador;

import java.util.Iterator;
import java.util.LinkedHashSet;
import TrabajoPr�cticoN3.*;

public class Controlador {
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
	
	public TrabajoPr�cticoN3.Herramientas buscarHerramienta(String nombre) {
		int z=0;
		TrabajoPr�cticoN3.Herramientas buscar = null ;
		Iterator <Herramientas> iterador = this.herramienta.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPr�cticoN3.Herramientas(iterador.next().getNombre(), iterador.next().getPrecio());
				z=1;
			}
		}
		return buscar;	
	}
	
	public TrabajoPr�cticoN3.Industrial buscarIndustrial(String nombre) {
		int z=0;
		TrabajoPr�cticoN3.Industrial buscar = null ;
		Iterator <Industrial> iterador = this.industrial.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPr�cticoN3.Industrial(iterador.next().getNombre(), iterador.next().getPrecio(), iterador.next().getPotenciaMaxima(),iterador.next().getTemperatiraMinima(),iterador.next().getTemperaturaMaxima());
				z=1;
			}
		}
		return buscar;	
	}
	
	public TrabajoPr�cticoN3.Domiciliaria buscarDomiciliaria(String nombre) {
		int z=0;
		TrabajoPr�cticoN3.Domiciliaria buscar = null ;
		Iterator <Domiciliaria> iterador = this.domiciliaria.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPr�cticoN3.Domiciliaria(iterador.next().getNombre(), iterador.next().getPrecio(), iterador.next().getPotenciaMaxima());
				z=1;
			}
		}
		return buscar;	
	}
	
	
	
}
