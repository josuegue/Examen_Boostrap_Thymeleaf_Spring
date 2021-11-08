/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pagina.proend.datos;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author USUARIOTC
 */
@Data
@Entity
@Table(name = "tb_profesion")
public class ClassProfesion {
    private static final Long SerializableUID=1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_profesion;
    private String descripcion_profesion;
    
}
