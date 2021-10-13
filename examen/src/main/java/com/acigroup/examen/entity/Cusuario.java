package com.acigroup.examen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "c_usuarios")
public class Cusuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "id_usuario_referido")
	private Integer idUsuarioReferido;	
	
	public Cusuario() {
	}

	public Cusuario(Integer idUsuario, String nombre, String apellidos, String mail, String password,
			Integer idUsuarioReferido) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mail = mail;
		this.password = password;
		this.idUsuarioReferido = idUsuarioReferido;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIdUsuarioReferido() {
		return idUsuarioReferido;
	}

	public void setIdUsuarioReferido(Integer idUsuarioReferido) {
		this.idUsuarioReferido = idUsuarioReferido;
	}

	@Override
	public String toString() {
		return "Cusuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellidos=" + apellidos + ", mail=" + mail
				+ ", password=" + password + ", idUsuarioReferido=" + idUsuarioReferido + "]";
	}
	
	
}
