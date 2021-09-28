package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.Entities.CitaDetallerEstado;

public interface ICitaDetallerEstadoService {

	public void insert (CitaDetallerEstado C);
	List<CitaDetallerEstado> list();
}
