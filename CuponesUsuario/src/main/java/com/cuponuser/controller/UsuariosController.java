/**
 * 
 */
package com.cuponuser.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cuponuser.model.Usuarios;
import com.cuponuser.repository.UsuariosRepository;

/**
 * @author LX
 *	
 */
@Controller
@RequestMapping("/usuarios")//http:localhost:8080/usuarios
public class UsuariosController {
	
	private final Logger log= LoggerFactory.getLogger(Usuarios.class);
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@GetMapping("")	
	public String home(Model model) {
		
		model.addAttribute("usuarios", usuariosRepository.findAll());
		return "home";
	}
	@GetMapping("/create")//http:localhost:8080/usuarios/create
	public String create() {
		return "create";
	}
	@PostMapping("/save")
	public String save(Usuarios usuarios) {
		
		log.info("Informacion del objeto Usuarios,{}", usuarios);
		try {
			usuariosRepository.save(usuarios);
		
		} catch (Exception e) {
			log.error("No puede repetirse correo"+e.getMessage(),100);
		}
		

			return "redirect:/usuarios";
			
		
	}
	
		
	}
	


