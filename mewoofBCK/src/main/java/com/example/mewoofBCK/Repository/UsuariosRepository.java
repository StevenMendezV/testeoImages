package com.example.mewoofBCK.Repository;

import com.example.mewoofBCK.Entity.Usuarios;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends ListCrudRepository<Usuarios, Integer> {
    //Metodo para traer usuario por nombre
    Usuarios findByNombre(String nombre);
    //Metodo para traer usuario por correo
    Usuarios findByCorreo(String correo);
}
