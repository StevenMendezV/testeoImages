package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "estados_publicaciones")
public class EstadoPublicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EstadoPublicacion")
    private Integer id;
    @Column(name = "Estado")
    private String estado;
}
