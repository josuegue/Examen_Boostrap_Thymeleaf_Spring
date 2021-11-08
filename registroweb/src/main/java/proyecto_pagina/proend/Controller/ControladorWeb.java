/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pagina.proend.Controller;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import proyecto_pagina.proend.dao.UsuariosDAO;
import proyecto_pagina.proend.datos.ClassUsuarios;
import proyecto_pagina.proend.services.ServiceDepartament;
import proyecto_pagina.proend.services.ServiceProfesion;
import proyecto_pagina.proend.services.ServiceUsuario;

/**
 *
 * @author USUARIOTC
 */
@Controller
@Slf4j
public class ControladorWeb {
    @Autowired
    private ServiceUsuario serviceUsuario;
    
    @Autowired//me sirve para la inyeccion de datos 
    private ServiceProfesion serviceProfesion;
    
    @Autowired
    private ServiceDepartament serviceDepartament;

    @GetMapping("/index")
    public String index(Model modelo){
        return "index";
    }
    @GetMapping("/lista")
    public String lista(Model modelo){
        var lista = serviceUsuario.listarUsuarios();
        modelo.addAttribute("listUsers", lista);
        return "lista";
    }
    @GetMapping("/eliminar/{id_usuario}")
    public String eliminar(ClassUsuarios usuario){
        serviceUsuario.eliminar(usuario);
        
        return "redirect:/lista";
    }
    @GetMapping("/editar/{id_usuario}")
    public String editar( ClassUsuarios usuario, Model modelo){
       var persona = serviceUsuario.encontrarUsuario(usuario);
       var dptos=serviceDepartament.listarDptos();
       var profesiones=serviceProfesion.listarProfesiones();
       modelo.addAttribute("departamentos", dptos);
       modelo.addAttribute("profesiones", profesiones);
       modelo.addAttribute("usuario", persona);
        
        return "crear";
    }
    
    @GetMapping("/crear")
    public String crear(Model modelo){
        ClassUsuarios newUser= new ClassUsuarios();
        var dptos=serviceDepartament.listarDptos();
        var profesiones=serviceProfesion.listarProfesiones();
        modelo.addAttribute("profesiones", profesiones);
        modelo.addAttribute("departamentos", dptos);
        modelo.addAttribute("usuario", newUser);
        return "crear";
    }
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("usuario") ClassUsuarios usuario){
        serviceUsuario.guardar(usuario);
        return "redirect:/lista";
    }
    
}

/*
Tenes que hacer el menu
Luego hacer la insecion de datos 
Usar combobox
Usar boostrap

*/
