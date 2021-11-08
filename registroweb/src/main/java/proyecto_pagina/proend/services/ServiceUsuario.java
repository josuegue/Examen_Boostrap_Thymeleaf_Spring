/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pagina.proend.services;

import java.util.List;
import proyecto_pagina.proend.datos.ClassUsuarios;

/**
 *
 * @author USUARIOTC
 */
public interface ServiceUsuario {
    public List<ClassUsuarios> listarUsuarios();
    public void guardar(ClassUsuarios usuario);
    public void eliminar(ClassUsuarios usuario);
    public ClassUsuarios encontrarUsuario(ClassUsuarios usuario);
    
}
