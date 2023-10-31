package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Entity.Usuarios;
import com.example.mewoofBCK.Service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public List<Usuarios> obtenerUsuarios(){
        return usuariosService.obtenerUsuarios();
    }

    @PostMapping
    public Usuarios crearUsuario(@RequestBody Usuarios usuario){
        return usuariosService.crearUsuario(usuario);
    }
}
