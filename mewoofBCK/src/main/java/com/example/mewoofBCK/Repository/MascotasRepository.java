package com.example.mewoofBCK.Repository;

import com.example.mewoofBCK.Entity.Mascotas;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotasRepository extends ListCrudRepository<Mascotas, Integer>{
}
