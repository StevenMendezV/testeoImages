package com.example.mewoofBCK.Service;

import com.example.mewoofBCK.Entity.Usuarios;
import com.example.mewoofBCK.Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {
    private final UsuariosRepository usuariosRepository;

    @Autowired
    public UsuariosService(UsuariosRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuarios> obtenerUsuarios(){

        return usuariosRepository.findAll();
    }

    public Usuarios obtenerUsuarioPorId(int id){
        return usuariosRepository.findById(id).orElse(null);
    }

    public Usuarios obtenerUsuarioPorEmail(String email){
        if(usuariosRepository.findByEmail(email) == null){
            return null;
        }else{
            return usuariosRepository.findByEmail(email);
        }
    }

    public Usuarios crearUsuario(Usuarios usuario){
        return usuariosRepository.save(usuario);
    }

    public void eliminarUsuario(int id){
        usuariosRepository.deleteById(id);
    }

    /*public Usuarios actualizarUsuario(int id, Usuarios usuarioModificado){
        return this.usuariosRepository.findById(id).map(personaActual -> {
            personaActual.
        })
    }*/
}
