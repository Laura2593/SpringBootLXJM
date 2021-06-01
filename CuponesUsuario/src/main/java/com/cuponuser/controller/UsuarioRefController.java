/**
 * 
 */
package com.cuponuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cuponuser.repository.UsuarioRefRepository;

/**
 * @author LX
 *
 */
@Controller
@RequestMapping("/usuarioRef")//http:localhost:8080/usuarioRef	
public class UsuarioRefController {
	
	@Autowired
	private UsuarioRefRepository usuarioRefRepository;
	
	@GetMapping("")
	public String home2(Model model) {
		
		model.addAttribute("usuarioRef", usuarioRefRepository.findAll());
		return "";
	}
	

}
