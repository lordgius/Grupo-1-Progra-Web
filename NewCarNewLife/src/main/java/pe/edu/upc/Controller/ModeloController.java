package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Entities.Marca;
import pe.edu.upc.Entities.Modelo;
import pe.edu.upc.Service.IMarcaService;
import pe.edu.upc.Service.IModeloService;

@Named
@RequestScoped
public class ModeloController {

	@Inject
	private IModeloService moService;
	
	@Inject
	private IMarcaService mService;
	
	private Modelo modelo;
	private Marca marca;
	
	List<Modelo> listaModelos;
	List<Marca> listaMarcas;
	
	@PostConstruct
	public void init() {
		this.listaMarcas = new ArrayList<Marca>();
		this.listaModelos =new ArrayList<Modelo>();
		this.modelo= new Modelo();
		this.marca= new Marca();
		this.listMarca();
		this.listModelo();
	}
	
	public String newModelo() {
		this.setModelo(new Modelo());
		return "modelo.xhtml";
	}
	
	public void listMarca() {
		listaMarcas= mService.list();
	}
	
	public void insertModelo() {
		moService.insert(modelo);
		this.listModelo();
	}
	
	public void listModelo() {
		listaModelos = moService.list(); 
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Modelo> getListaModelos() {
		return listaModelos;
	}

	public void setListaModelos(List<Modelo> listaModelos) {
		this.listaModelos = listaModelos;
	}

	public List<Marca> getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}
	
	
}
