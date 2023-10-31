package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "publicaciones")
public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Publicacion")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ID_Usuario")
    private Usuarios usuario;
    @Column(name = "Fecha")
    private Date fecha;
    @OneToOne
    @JoinColumn(name = "ID_EstadoPublicacion")
    private EstadoPublicaciones estadoPublicacion;
    @Column(name = "Nombre_Mascota")
    private String nombreMascota;
    @Column(name = "Descripcion")
    private String descripcion;


}
