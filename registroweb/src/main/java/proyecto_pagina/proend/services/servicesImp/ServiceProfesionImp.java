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
import proyecto_pagina.proend.dao.ProfesionDAO;
import proyecto_pagina.proend.datos.ClassProfesion;
import proyecto_pagina.proend.services.ServiceProfesion;

/**
 *
 * @author USUARIOTC
 */
@Service
public class ServiceProfesionImp implements ServiceProfesion {
    @Autowired
    private ProfesionDAO profesionDao;

    @Override
    @Transactional(readOnly = true)
    public List<ClassProfesion> listarProfesiones() {
        return (List<ClassProfesion>) profesionDao.findAll();
    }
    
    
}
