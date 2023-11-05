package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("images")
public class ImagesController {

    private final ImagesService imagesService;

    @Autowired
    public ImagesController(ImagesService imagesService){
        this.imagesService = imagesService;
    }

    @PostMapping("cargar")
    public ResponseEntity<?> guardarImagen(@RequestParam("file")MultipartFile archivo){
        try{
            if(imagesService.comprobarSiElArchivoEsUnaImagen(archivo)){
                imagesService.guardarImagen(archivo.getBytes());
                return ResponseEntity.ok().build();
            }
            return ResponseEntity.badRequest().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<byte[]> obtenerImagen(@PathVariable int id){
        try{
            byte[] imagen = imagesService.obtenerImagen(id);
            return ResponseEntity.ok().body(imagen);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
