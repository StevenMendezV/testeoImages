package com.example.mewoofBCK.Service;

import com.example.mewoofBCK.Entity.Publicaciones;
import com.example.mewoofBCK.Repository.PublicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionesService {

    private final PublicacionesRepository publicacionesRepository;

    @Autowired
    public PublicacionesService(PublicacionesRepository publicacionesRepository){
        this.publicacionesRepository = publicacionesRepository;
    }

    public List<Publicaciones> obtenerPublicaciones(){
        return publicacionesRepository.findAll();
    }

    public Publicaciones crearPublicacion(Publicaciones publicacion){
        return publicacionesRepository.save(publicacion);
    }

    public Publicaciones obtenerPublicacionPorId(int id){
        return publicacionesRepository.findById(id).orElse(null);
    }

    public void eliminarPublicacion(int id){
        publicacionesRepository.deleteById(id);
    }

}
