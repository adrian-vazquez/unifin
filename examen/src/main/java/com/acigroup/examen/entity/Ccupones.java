package com.acigroup.examen.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "c_cupones")
public class Ccupones implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_cupon")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCupon;
	
	@Column(name = "restaurante")
	private String restaurante;
	
	@Column(name = "rfc")
	private String rfc;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_caducidad")
	private Date fechaCaducidad;

	public Ccupones() {
	}

	public Ccupones(Integer idCupon, String restaurante, String rfc, String descripcion, Date fechaCaducidad) {
		super();
		this.idCupon = idCupon;
		this.restaurante = restaurante;
		this.rfc = rfc;
		this.descripcion = descripcion;
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Ccupones [idCupon=" + idCupon + ", restaurante=" + restaurante + ", rfc=" + rfc + ", descripcion="
				+ descripcion + ", fechaCaducidad=" + fechaCaducidad + "]";
	}

}
