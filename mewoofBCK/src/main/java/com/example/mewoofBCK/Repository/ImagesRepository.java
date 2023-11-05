package com.example.mewoofBCK.Repository;

import com.example.mewoofBCK.Entity.Images;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepository extends ListCrudRepository<Images, Integer> {

}
