package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "estados_solicitudes")
public class EstadosSolicitudes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EstadoSolicitud")
    private Integer id;
    @Column(name = "Estado")
    private String estado;
}
