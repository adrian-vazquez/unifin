package com.acigroup.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acigroup.examen.entity.Cusuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Cusuario, Integer> {

}
