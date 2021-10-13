package com.acigroup.examen.response;

import com.acigroup.examen.dto.UsuarioDto;

public class UsuarioResponse {
	
	private Integer idUsuario;
	private String nombre;
	private String apellidos;
	private String mail;
	private String password;
	private UsuarioDto usuarioReferido;
	
	public UsuarioResponse(Integer idUsuario, String nombre, String apellidos, String mail, String password,
			UsuarioDto usuarioReferido) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mail = mail;
		this.password = password;
		this.usuarioReferido = usuarioReferido;
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

	public UsuarioDto getUsuarioReferido() {
		return usuarioReferido;
	}

	public void setUsuarioReferido(UsuarioDto usuarioReferido) {
		this.usuarioReferido = usuarioReferido;
	}
}
