package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Entity.Mascotas;
import com.example.mewoofBCK.Service.MascotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mascotas")
public class MascotasController {

    private final MascotasService mascotasService;

    @Autowired
    public MascotasController(MascotasService mascotasService){
        this.mascotasService = mascotasService;
    }

    @GetMapping
    public List<Mascotas> getMascotas(){
        return mascotasService.getMascotas();
    }

}
