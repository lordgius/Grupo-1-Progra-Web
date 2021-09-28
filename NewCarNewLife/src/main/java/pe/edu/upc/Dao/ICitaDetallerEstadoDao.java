package pe.edu.upc.Dao;

import java.util.List;

import pe.edu.upc.Entities.CitaDetallerEstado;

public interface ICitaDetallerEstadoDao {

	public void insert (CitaDetallerEstado C);
	List<CitaDetallerEstado> list();
}
