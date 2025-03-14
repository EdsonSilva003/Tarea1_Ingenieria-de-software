package com.edson.tarea1_Silva_Rodriguez.controller;

import com.edson.tarea1_Silva_Rodriguez.Entity.Usuario;
import com.edson.tarea1_Silva_Rodriguez.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Blob;
import java.util.Base64;

@Controller
public class LibrosController {

    @GetMapping("/libros")
    public String libros() {
        return "libros";  
    }

}