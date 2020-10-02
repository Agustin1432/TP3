package Controlador;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.swing.DefaultListModel;

import TrabajoPr�cticoN3.*;

public class Controlador {
	private LinkedHashSet <TrabajoPr�cticoN3.Cliente> cliente;
	private LinkedHashSet <TrabajoPr�cticoN3.Factura> factura;
	private LinkedHashSet <TrabajoPr�cticoN3.Herramientas> herramienta;
	private LinkedHashSet <TrabajoPr�cticoN3.Industrial> industrial;
	private LinkedHashSet <TrabajoPr�cticoN3.Domiciliaria> domiciliaria;
	private DefaultListModel <String> nombreArticulos;
	
	
	//GETTERS AND SETTERS
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
	public LinkedHashSet<TrabajoPr�cticoN3.Herramientas> getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(LinkedHashSet<TrabajoPr�cticoN3.Herramientas> herramienta) {
		this.herramienta = herramienta;
	}
	public LinkedHashSet<TrabajoPr�cticoN3.Industrial> getIndustrial() {
		return industrial;
	}
	public void setIndustrial(LinkedHashSet<TrabajoPr�cticoN3.Industrial> industrial) {
		this.industrial = industrial;
	}
	public LinkedHashSet<TrabajoPr�cticoN3.Domiciliaria> getDomiciliaria() {
		return domiciliaria;
	}
	public void setDomiciliaria(LinkedHashSet<TrabajoPr�cticoN3.Domiciliaria> domiciliaria) {
		this.domiciliaria = domiciliaria;
	}
	
	
	//METODOS DE CLIENTE
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
	public void editarCliente (String dni,TrabajoPr�cticoN3.Cliente cliente) {
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
	public void crearherramienta (TrabajoPr�cticoN3.Herramientas herramienta) {
			this.herramienta.add(herramienta);
		
	}
	public void crearIndustrial (TrabajoPr�cticoN3.Industrial industrial) {
		this.industrial.add(industrial);
	
	}
	public void crearDomiciliaria (TrabajoPr�cticoN3.Domiciliaria domiciliaria) {
		this.domiciliaria.add(domiciliaria);
	
	}
	//BUSCAR ARTICULO
	public TrabajoPr�cticoN3.Herramientas buscarHerramienta(String nombre) {
		int z=0;
		TrabajoPr�cticoN3.Herramientas buscar = null ;
		Iterator <Herramientas> iterador = this.herramienta.iterator();
		while(iterador.hasNext() && z==0) {
			if(nombre.equals(iterador.next().getNombre())) {
				buscar=new TrabajoPr�cticoN3.Herramientas(iterador.next().getNombre(), iterador.next().getPrecio(), iterador.next().getDescripcion());
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
	//EDITAR ARTICULO
	public void editarHerramienta (String nombre,TrabajoPr�cticoN3.Herramientas herramienta) {
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
	public void editarIndustrial (String nombre,TrabajoPr�cticoN3.Industrial industrial) {
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
	public void editarDomiciliaria (String nombre,TrabajoPr�cticoN3.Domiciliaria domiciliaria) {
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
	
	public DefaultListModel <String> listarArticulos() {
		Iterator <Herramientas> iterador = this.herramienta.iterator();
		Iterator <Industrial> iterador1 = this.industrial.iterator();
		Iterator <Domiciliaria> iterador2 = this.domiciliaria.iterator();
		nombreArticulos = null;
		while(iterador.hasNext()) {
			nombreArticulos.addElement(iterador.next().getNombre());
		}
		while(iterador1.hasNext()) {
			nombreArticulos.addElement(iterador1.next().getNombre());
		}
		while(iterador2.hasNext()) {
			nombreArticulos.addElement(iterador2.next().getNombre());
		}
		return nombreArticulos;
		
	}

}
