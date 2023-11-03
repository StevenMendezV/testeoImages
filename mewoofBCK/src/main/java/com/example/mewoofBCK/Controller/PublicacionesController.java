package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Entity.Publicaciones;
import com.example.mewoofBCK.Service.PublicacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("publicaciones")
public class PublicacionesController {

    private final PublicacionesService publicacionesService;

    @Autowired
    public PublicacionesController(PublicacionesService publicacionesService){
        this.publicacionesService = publicacionesService;
    }

    @GetMapping
    public List<Publicaciones> obtenerPublicaciones(){
        return publicacionesService.obtenerPublicaciones();
    }

    @GetMapping("/{id}")
    public Publicaciones obtenerPublicacionPorId(@PathVariable int id){
        return publicacionesService.obtenerPublicacionPorId(id);
    }

    @PostMapping("/crearPublicacion")
    public Publicaciones crearPublicacion(@RequestBody Publicaciones publicacion){
        return publicacionesService.crearPublicacion(publicacion);
    }

    @GetMapping("/eliminarPublicacion/{id}")
    public void eliminarPublicacion(@PathVariable int id){
        publicacionesService.eliminarPublicacion(id);
    }
    
}
