package com.example.mewoofBCK.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "solicitudes")
public class Solicitudes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Solicitud")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "ID_Mascota")
    private Mascotas mascota;
    @OneToOne
    @JoinColumn(name = "ID_Usuario")
    private Usuarios usuario;
    @OneToOne
    @JoinColumn(name = "ID_EstadoSolicitud")
    private EstadosSolicitudes estadoSolicitud;
    @Column(name = "Fecha")
    private Date fecha;
}
