/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pagina.proend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto_pagina.proend.datos.ClassUsuarios;

/**
 *
 * @author USUARIOTC
 */
@Repository//indica que la clase es un repositorio, encapsula el comportamiento del almacenamiento
public interface UsuariosDAO extends CrudRepository<ClassUsuarios, Long> {
    //roporciona métodos para operaciones CRUD, por lo que le permite crear, leer, actualizar y 
    //eliminar registros sin tener que definir sus propios métodos.
}
