package pe.edu.upc.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Entities.CitaDetallerEstado;
import pe.edu.upc.Entities.Estado;
import pe.edu.upc.Service.ICitaDetallerEstadoService;
import pe.edu.upc.Service.IEstadoService;

@Named
@RequestScoped

public class CitaDetallerEstadoController {

	@Inject
	private ICitaDetallerEstadoService cService;
	 
	@Inject
	private IEstadoService eService;
	//atributos
	List<CitaDetallerEstado> listaCitas;
	List<Estado> listaEstados;
	
	private CitaDetallerEstado citadetallerestado;
	private Estado estado;
	
	@PostConstruct
	public void init() {
		this.listaCitas=new ArrayList<CitaDetallerEstado>();
		this.listaEstados = new ArrayList<Estado>();
		this.citadetallerestado=new CitaDetallerEstado();
		this.estado=new Estado();
		this.listCitaDetallerEstado();
		this.listEstado();
		
	}

	//metodos personalizados
	
	public String newCitaDetallerEstado() {
		
		this.setCitadetallerestado(new CitaDetallerEstado());
		return "citadetallerestado.xhtml";
	}
	
	public void listEstado() {
		
		listaEstados=eService.list();
	}
	
	public void insertCitaDetallerEstado() {
		
		cService.insert(citadetallerestado);
		this.listCitaDetallerEstado();
			}	
	
	public void listCitaDetallerEstado() {
		
		listaCitas=cService.list();
		
		
	}
	//getters and setters
	public List<CitaDetallerEstado> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(List<CitaDetallerEstado> listaCitas) {
		this.listaCitas = listaCitas;
	}

	public List<Estado> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<Estado> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public CitaDetallerEstado getCitadetallerestado() {
		return citadetallerestado;
	}

	public void setCitadetallerestado(CitaDetallerEstado citadetallerestado) {
		this.citadetallerestado = citadetallerestado;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
