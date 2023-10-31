package com.example.mewoofBCK.Repository;

import com.example.mewoofBCK.Entity.Publicaciones;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionesRepository extends ListCrudRepository<Publicaciones, Integer> {
}
