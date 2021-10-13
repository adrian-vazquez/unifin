package com.acigroup.examen.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acigroup.examen.dto.UsuarioDto;
import com.acigroup.examen.entity.Cusuario;
import com.acigroup.examen.repository.UsuarioRepository;
import com.acigroup.examen.response.UsuarioResponse;


@RestController
@RequestMapping(UsuarioController.USUARIOS_CONTROLLER)
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	static final String USUARIOS_CONTROLLER = "/usuariosController";
	
	@GetMapping("/getAllUsuarios")
	@ResponseBody
	public List<UsuarioResponse> getAllUsuarios() {
		List<Cusuario> usuarios = new ArrayList<Cusuario>();		
		usuarioRepository.findAll().forEach(usuarios::add);		
		List<UsuarioResponse> response = new ArrayList<UsuarioResponse>();
		for(Cusuario u : usuarios) {
			UsuarioResponse ur;
			if(Objects.nonNull(u.getIdUsuarioReferido())) {
				Cusuario usuarioReferido = usuarioRepository.findById(u.getIdUsuarioReferido()).get();
				ur = new UsuarioResponse(u.getIdUsuario(), u.getNombre(), u.getApellidos(), u.getMail(), u.getPassword(), new UsuarioDto(usuarioReferido.getIdUsuario(), usuarioReferido.getNombre(),usuarioReferido.getApellidos(),usuarioReferido.getMail(),usuarioReferido.getPassword()));
			} else {
				ur = new UsuarioResponse(u.getIdUsuario(), u.getNombre(), u.getApellidos(), u.getMail(), u.getPassword(), null);
			}			
			response.add(ur);
		}		
		return response;
	}
	
	
	@PostMapping("/insertUsuario")
	@ResponseBody
	public Cusuario insertUsuario(@RequestBody Cusuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
