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

    public List<Mascotas> getMascotas(){
        return mascotasRepository.findAll();
    }


}
