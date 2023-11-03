package com.example.mewoofBCK.Service;

import com.example.mewoofBCK.Entity.Mascotas;
import com.example.mewoofBCK.Repository.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotasService {

    private MascotasRepository mascotasRepository;

    @Autowired
    public MascotasService(MascotasRepository mascotasRepository){
        this.mascotasRepository = mascotasRepository;
    }

    public List<Mascotas> traerListaMascotas(){
        return mascotasRepository.findAll();
    }

    public Mascotas obtenerMascotaPorId(int id){
        return mascotasRepository.findById(id).orElse(null);
    }

    public Mascotas crearMascotas(Mascotas mascota){
        return mascotasRepository.save(mascota);
    }

    public void eliminarMascota(int id){
        mascotasRepository.deleteById(id);
    }


}
