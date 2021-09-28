package pe.edu.upc.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.Dao.ICitaDetallerEstadoDao;
import pe.edu.upc.Entities.CitaDetallerEstado;

public class CitaDetallerEstadoDaoImpl implements ICitaDetallerEstadoDao{

	@PersistenceContext(unitName = "NewCarNewLife")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(CitaDetallerEstado C) {
		try {
			
			
			em.persist(C);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al insertar");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CitaDetallerEstado> list() {

		List<CitaDetallerEstado> lista=new ArrayList<CitaDetallerEstado>();
		try {
			Query q=em.createQuery("select C from CitaDetallerEstado C");
			lista=(List<CitaDetallerEstado>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al listar");
		}
		return lista;
	}
}
