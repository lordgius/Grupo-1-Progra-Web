package pe.edu.upc.ServiceImpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Dao.ICitaDetallerEstadoDao;
import pe.edu.upc.Entities.CitaDetallerEstado;
import pe.edu.upc.Service.ICitaDetallerEstadoService;

@Named
@RequestScoped
public class CitaDetallerEstadoServiceImpl implements ICitaDetallerEstadoService{

	@Inject
	private ICitaDetallerEstadoDao cDao;

	@Override
	public void insert(CitaDetallerEstado C) {
		cDao.insert(C);
		
	}

	@Override
	public List<CitaDetallerEstado> list() {
		
		return cDao.list();
	}
	
	
	
	
}
