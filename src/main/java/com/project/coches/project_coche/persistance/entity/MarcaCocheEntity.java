package com.project.coches.project_coche.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 * entidad de la marca
 */
@Getter @Setter
@Entity
@Table(name="marca_coche")
public class MarcaCocheEntity {

    /**
     * id de la marca
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * descripcion de la marca
     */
    @Column(name="descripcion")
    private String description;

}
