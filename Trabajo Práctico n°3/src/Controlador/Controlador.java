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
import modelo.Industrial;

public class Controlador {
	private LinkedHashSet <TrabajoPracticoN3.Cliente> cliente;
	private LinkedHashSet <TrabajoPracticoN3.Factura> factura;
	private LinkedHashSet <Articulo> articulo;
	
	DefaultListModel <String> nombreArticulos;
	
	public Controlador(){
		cliente = new LinkedHashSet<Cliente>();
		factura = new LinkedHashSet<Factura>();
		articulo = new LinkedHashSet <Articulo>();
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
	public LinkedHashSet<Articulo> getArticulo() {
		return articulo;
	}



	public void setArticulo(LinkedHashSet<Articulo> articulo) {
		this.articulo = articulo;
	}



	public DefaultListModel<String> getNombreArticulos() {
		return nombreArticulos;
	}

	public void setNombreArticulos(DefaultListModel<String> nombreArticulos) {
		this.nombreArticulos = nombreArticulos;
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
				if(dni.equals(iterador.next().getDni())) {
					iterador.remove();
				}
			}	
		}

	
	//METODOS DE ARTICULO
	public void crearArticulo (TrabajoPracticoN3.Articulo articulo) {
			this.articulo.add(articulo);
		
	}
	//BUSCAR ARTICULO
	public TrabajoPracticoN3.Articulo buscarArticulo(String nombre) {
		int z=0;
		TrabajoPracticoN3.Articulo buscar = null ;
		Iterator <Articulo> iterador = this.articulo.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPracticoN3.Articulo(iterador.next().getNombre(),iterador.next().getPrecio(),((Herramientas)iterador.next()).getDescripcion(),((Electricidad)iterador.next()).getPotenciaMaxima(),((Industrial)iterador.next()).getTemperaturaMaxima(),((Industrial)iterador.next()).getTemperatiraMinima());
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
	public void eliminarArticulo (String nombre) {
		int z=0;
		Iterator <Articulo> iterador = this.articulo.iterator();
		while(iterador.hasNext()&& z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				iterador.remove();
				z=1;
			}
		}	
	}
	
	
	public  DefaultListModel<Articulo> listarArticulos() {
		Iterator <Articulo> iterador = this.articulo.iterator();
		
		DefaultListModel<Articulo> modelo = new DefaultListModel<Articulo>();
		while(iterador.hasNext()) {
			modelo.addElement(iterador.next());
		}
		
		return modelo;
		
	}

}
