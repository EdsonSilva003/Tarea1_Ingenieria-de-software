package com.edson.tarea1_Silva_Rodriguez.repository;

import com.edson.tarea1_Silva_Rodriguez.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNombre(String nombre);
    Usuario findByEmail(String email);
}
