package com.example.mewoofBCK.Service;

import com.example.mewoofBCK.Entity.Images;
import com.example.mewoofBCK.Repository.ImagesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class ImagesService {

    private static final List<String> tiposDeImagenPermitidos = Arrays.asList("image/jpeg", "image/png");
    private final ImagesRepository imagesRepository;

    @Autowired
    public ImagesService(ImagesRepository imagesRepository){
        this.imagesRepository = imagesRepository;
    }

    public Boolean comprobarSiElArchivoEsUnaImagen(MultipartFile archivo) throws IOException{
        return tiposDeImagenPermitidos.contains(archivo.getContentType());
    }

    @Transactional
    public void guardarImagen(byte[] datos){
        Images imagen = new Images();
        imagen.setDatos(datos);
        imagesRepository.save(imagen);
    }

    public byte[] obtenerImagen(int id){
        return imagesRepository.findById(id).orElseThrow( () -> new IllegalStateException("La imagen con id " + id + " no existe") ).getDatos();

    }

}
