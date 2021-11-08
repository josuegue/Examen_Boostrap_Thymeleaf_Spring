/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pagina.proend.datos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author USUARIOTC
 */
@Data//me genera los get y set
@Entity//le indico que es una entidad
@Table(name = "tb_usuarios")//le indico a que tabla me voy usar
@AllArgsConstructor//me genera ell constructor con argumentos
@NoArgsConstructor//constructor sin argumentos
public class ClassUsuarios implements Serializable {

    private static final long SERIALIZABLE = 1l;

    @Id//indica el ID de mi tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para datos autoincrementables
    private Long id_usuario;

    private Integer id_depto;
    private Integer id_profesion;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    
    @Temporal(TemporalType.DATE)//para variables tipo Date
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)//Solo obtengo la fecha 
    private Date fecha_nacimiento;
    private double longitud;
    private double latitud;

    private LocalDateTime fecha_registro;
    
    @PrePersist
    public void fechaActual(){
        fecha_registro= LocalDateTime.now();
    }

}
