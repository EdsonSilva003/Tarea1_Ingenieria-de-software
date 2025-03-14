package com.edson.tarea1_Silva_Rodriguez.service;

import com.edson.tarea1_Silva_Rodriguez.Entity.Usuario;
import com.edson.tarea1_Silva_Rodriguez.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    // 🔹 Inyectamos el repositorio para obtener usuarios
    public CustomUserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByNombre(nombre);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado: " + nombre);
        }
        return new CustomUserDetails(usuario);
    }
}
