package com.example.mewoofBCK.Repository;

import com.example.mewoofBCK.Entity.Solicitudes;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudesRepository extends ListCrudRepository<Solicitudes, Integer> {
}
