package Controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

import Interfaz.VentanaPrincipal;
import TrabajoPracticoN3.*;

public class Controlador {
	private LinkedHashSet <TrabajoPracticoN3.Cliente> cliente;
	private LinkedHashSet <TrabajoPracticoN3.Factura> factura;
	private LinkedHashSet <TrabajoPracticoN3.Herramientas> herramienta;
	private LinkedHashSet <TrabajoPracticoN3.Industrial> industrial;
	private LinkedHashSet <TrabajoPracticoN3.Domiciliaria> domiciliaria;
	DefaultListModel <String> nombreArticulos;
	
	public Controlador(){
		cliente = new LinkedHashSet<Cliente>();
		factura = new LinkedHashSet<Factura>();
		herramienta = new LinkedHashSet<Herramientas>();
		industrial = new LinkedHashSet<Industrial>();
		domiciliaria = new LinkedHashSet<Domiciliaria>();
		nombreArticulos= new DefaultListModel <String>();	
	}

	
	
	//GETTERS AND SETTERS
	public LinkedHashSet<TrabajoPracticoN3.Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(LinkedHashSet<TrabajoPracticoN3.Cliente> cliente) {
		this.cliente = cliente;
	}
	public LinkedHashSet<TrabajoPracticoN3.Factura> getFactura() {
		return factura;
	}
	public void setFactura(LinkedHashSet<TrabajoPracticoN3.Factura> factura) {
		this.factura = factura;
	}
	public LinkedHashSet<TrabajoPracticoN3.Herramientas> getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(LinkedHashSet<TrabajoPracticoN3.Herramientas> herramienta) {
		this.herramienta = herramienta;
	}
	public LinkedHashSet<TrabajoPracticoN3.Industrial> getIndustrial() {
		return industrial;
	}
	public void setIndustrial(LinkedHashSet<TrabajoPracticoN3.Industrial> industrial) {
		this.industrial = industrial;
	}
	public LinkedHashSet<TrabajoPracticoN3.Domiciliaria> getDomiciliaria() {
		return domiciliaria;
	}
	public void setDomiciliaria(LinkedHashSet<TrabajoPracticoN3.Domiciliaria> domiciliaria) {
		this.domiciliaria = domiciliaria;
	}
	
	
	//METODOS DE CLIENTE
	public void crearCliente (TrabajoPracticoN3.Cliente cliente) {
		this.cliente.add(cliente);
	}
	public TrabajoPracticoN3.Cliente buscarCliente (String dni) {
		TrabajoPracticoN3.Cliente buscar = null ;
		TrabajoPracticoN3.Cliente next= null;
		Iterator <Cliente> iterador = this.cliente.iterator();
		while(iterador.hasNext()) {
			next=iterador.next();
			if(dni.equals(next.getDni())) {
				buscar=new TrabajoPracticoN3.Cliente(next.getNombre(),next.getApellido(),next.getDni(),next.getDireccion(),next.getTelefono());
			}
		}
		return buscar;	
	}
	public void editarCliente (String dni,TrabajoPracticoN3.Cliente cliente) {
		int z=0;
		Iterator <Cliente> iterador = this.cliente.iterator();
		while(iterador.hasNext()&& z==0) {
			if(dni.equals(iterador.next().getDni())) {
				iterador.remove();
				this.cliente.add(cliente);
				z=1;
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

	
	//METODOS DE ARTICULO
	public void crearherramienta (TrabajoPracticoN3.Herramientas herramienta) {
			this.herramienta.add(herramienta);
		
	}
	public void crearIndustrial (TrabajoPracticoN3.Industrial industrial) {
		this.industrial.add(industrial);
	
	}
	public void crearDomiciliaria (TrabajoPracticoN3.Domiciliaria domiciliaria) {
		this.domiciliaria.add(domiciliaria);
	
	}
	//BUSCAR ARTICULO
	public TrabajoPracticoN3.Herramientas buscarHerramienta(String nombre) {
		int z=0;
		TrabajoPracticoN3.Herramientas buscar = null ;
		Iterator <Herramientas> iterador = this.herramienta.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPracticoN3.Herramientas(iterador.next().getNombre(), iterador.next().getPrecio(), iterador.next().getDescripcion());
				z=1;
			}
		}
		return buscar;	
	}
	public TrabajoPracticoN3.Industrial buscarIndustrial(String nombre) {
		int z=0;
		TrabajoPracticoN3.Industrial buscar = null ;
		Iterator <Industrial> iterador = this.industrial.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPracticoN3.Industrial(iterador.next().getNombre(), iterador.next().getPrecio(), iterador.next().getPotenciaMaxima(),iterador.next().getTemperatiraMinima(),iterador.next().getTemperaturaMaxima());
				z=1;
			}
		}
		return buscar;	
	}
	public TrabajoPracticoN3.Domiciliaria buscarDomiciliaria(String nombre) {
		int z=0;
		TrabajoPracticoN3.Domiciliaria buscar = null ;
		Iterator <Domiciliaria> iterador = this.domiciliaria.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPracticoN3.Domiciliaria(iterador.next().getNombre(), iterador.next().getPrecio(), iterador.next().getPotenciaMaxima());
				z=1;
			}
		}
		return buscar;	
	}
	//EDITAR ARTICULO
	public void editarHerramienta (String nombre,TrabajoPracticoN3.Herramientas herramienta) {
		int z=0;
		Iterator <Herramientas> iterador = this.herramienta.iterator();
		while(iterador.hasNext()&& z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				iterador.remove();
				this.herramienta.add(herramienta);
				z=1;
			}
		}	
	}
	public void editarIndustrial (String nombre,TrabajoPracticoN3.Industrial industrial) {
		int z=0;
		Iterator <Industrial> iterador = this.industrial.iterator();
		while(iterador.hasNext()&& z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				iterador.remove();
				this.industrial.add(industrial);
				z=1;
			}
		}	
	}
	public void editarDomiciliaria (String nombre,TrabajoPracticoN3.Domiciliaria domiciliaria) {
		int z=0;
		Iterator <Domiciliaria> iterador = this.domiciliaria.iterator();
		while(iterador.hasNext()&& z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				iterador.remove();
				this.domiciliaria.add(domiciliaria);
				z=1;
			}
		}	
	}
	//ELIMINAR ARTICULO
	public void eliminarHerramienta (String nombre) {
		int z=0;
		Iterator <Herramientas> iterador = this.herramienta.iterator();
		while(iterador.hasNext()&& z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				iterador.remove();
				z=1;
			}
		}	
	}
	public void eliminarIndustrial (String nombre) {
		int z=0;
		Iterator <Industrial> iterador = this.industrial.iterator();
		while(iterador.hasNext()&& z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				iterador.remove();
				z=1;
			}
		}	
	}
	public void eliminarDomiciliaria (String nombre) {
		int z=0;
		Iterator <Domiciliaria> iterador = this.domiciliaria.iterator();
		while(iterador.hasNext()&& z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				iterador.remove();
				z=1;
			}
		}	
	}
	
	public  ListModel<String> listarArticulos() {
		Iterator <Herramientas> iterador = this.herramienta.iterator();
		Iterator <Industrial> iterador1 = this.industrial.iterator();
		Iterator <Domiciliaria> iterador2 = this.domiciliaria.iterator();
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		while(iterador.hasNext()) {
			modelo.addElement(iterador.next().getNombre());
		}
		while(iterador1.hasNext()) {
			modelo.addElement(iterador1.next().getNombre());
		}
		while(iterador2.hasNext()) {
			modelo.addElement(iterador2.next().getNombre());
		}
		return modelo;
		
	}

}
