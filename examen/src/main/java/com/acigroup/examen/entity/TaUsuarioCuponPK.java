package com.acigroup.examen.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class TaUsuarioCuponPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JoinColumn(name = "id_cupon", referencedColumnName = "id_cupon")
	@ManyToOne(optional = false)
	private Ccupones cupon;
	
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne(optional = false)
	private Cusuario usuario;

	public TaUsuarioCuponPK() {
	}

	public TaUsuarioCuponPK(Ccupones cupon, Cusuario usuario) {
		super();
		this.cupon = cupon;
		this.usuario = usuario;
	}

	public Ccupones getCupon() {
		return cupon;
	}

	public void setCupon(Ccupones cupon) {
		this.cupon = cupon;
	}

	public Cusuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Cusuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "TaUsuarioCuponPK [cupon=" + cupon + ", usuario=" + usuario + "]";
	}
	
}
