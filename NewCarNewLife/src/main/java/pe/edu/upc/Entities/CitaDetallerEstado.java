package pe.edu.upc.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "CitaDetallerEstado")
public class CitaDetallerEstado {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cdetalle;

@ManyToOne
@JoinColumn(name = "Cestado",nullable=false)
	private Estado estado_Cestado;
	
	
	private Date Ddetalle;
	
	
	public CitaDetallerEstado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CitaDetallerEstado(int cdetalle, Estado estado_Cestado, Date ddetalle) {
		super();
		Cdetalle = cdetalle;
		this.estado_Cestado = estado_Cestado;
		Ddetalle = ddetalle;
	}
	public int getCdetalle() {
		return Cdetalle;
	}
	public void setCdetalle(int cdetalle) {
		Cdetalle = cdetalle;
	}
	public Estado getEstado_Cestado() {
		return estado_Cestado;
	}
	public void setEstado_Cestado(Estado estado_Cestado) {
		this.estado_Cestado = estado_Cestado;
	}
	public Date getDdetalle() {
		return Ddetalle;
	}
	public void setDdetalle(Date ddetalle) {
		Ddetalle = ddetalle;
	}
	
}
