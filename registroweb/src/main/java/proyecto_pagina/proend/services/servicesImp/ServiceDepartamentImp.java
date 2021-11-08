/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pagina.proend.services.servicesImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import proyecto_pagina.proend.dao.DepartamentoDAO;
import proyecto_pagina.proend.datos.ClassDepartamento;
import proyecto_pagina.proend.services.ServiceDepartament;

/**
 *
 * @author USUARIOTC
 */
@Service//indico que es un servicio
public class ServiceDepartamentImp implements ServiceDepartament{
    @Autowired//inyeccion de datos
    private DepartamentoDAO dptDao;

    @Override
    @Transactional(readOnly = true)
    public List<ClassDepartamento> listarDptos() {
       return (List<ClassDepartamento>) dptDao.findAll();
    }
    
}
