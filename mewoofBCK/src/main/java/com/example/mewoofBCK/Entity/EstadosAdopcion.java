package com.example.mewoofBCK.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "estados_adopcion")
public class EstadosAdopcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Estado_Adopcion")
    private Integer id;
    @Column(name = "Estado")
    private String estado;
}
