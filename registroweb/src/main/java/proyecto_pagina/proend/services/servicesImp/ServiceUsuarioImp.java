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
import proyecto_pagina.proend.dao.UsuariosDAO;
import proyecto_pagina.proend.datos.ClassUsuarios;
import proyecto_pagina.proend.services.ServiceUsuario;

/**
 *
 * @author USUARIOTC
 */
@Service
public class ServiceUsuarioImp implements ServiceUsuario{
    @Autowired
    private UsuariosDAO userDao;

    @Override
    @Transactional(readOnly = true)
    public List<ClassUsuarios> listarUsuarios() {
         return (List<ClassUsuarios>) userDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(ClassUsuarios usuario) {
        userDao.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(ClassUsuarios usuario) {
        userDao.delete(usuario);
         
    }

    @Override
    @Transactional(readOnly = true)
    public ClassUsuarios encontrarUsuario(ClassUsuarios usuario) {
        return userDao.findById(usuario.getId_usuario()).orElse(null);
    }
    
}
