package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sizes")
public class Sizes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Size")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Dimension_Maxima_CM")
    private Integer dimensionMaximaCm;
}
