/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pagina.proend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto_pagina.proend.datos.ClassDepartamento;

/**
 *
 * @author USUARIOTC
 */
@Repository
public interface DepartamentoDAO extends CrudRepository<ClassDepartamento, Long>{
    
}
