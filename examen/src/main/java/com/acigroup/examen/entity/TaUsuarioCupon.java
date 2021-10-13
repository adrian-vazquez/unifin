package com.acigroup.examen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ta_usuario_cupon")
public class TaUsuarioCupon implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TaUsuarioCuponPK taUsuarioCuponPK;	
	
	@Column(name = "is_utilizado")
	private String isUtilizado;
	
	public TaUsuarioCupon() {
	}	

	public TaUsuarioCupon(TaUsuarioCuponPK taUsuarioCuponPK, String isUtilizado) {
		super();
		this.taUsuarioCuponPK = taUsuarioCuponPK;
		this.isUtilizado = isUtilizado;
	}

	public String getIsUtilizado() {
		return isUtilizado;
	}

	public void setIsUtilizado(String isUtilizado) {
		this.isUtilizado = isUtilizado;
	}

	@Override
	public String toString() {
		return "TaUsuarioCupon [taUsuarioCuponPK=" + taUsuarioCuponPK + ", isUtilizado=" + isUtilizado + "]";
	}
	
}
