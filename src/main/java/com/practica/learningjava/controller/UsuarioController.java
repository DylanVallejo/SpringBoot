package com.practica.learningjava.controller;

//import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.learningjava.model.Usuario;


////@RestController
//@org.springframework.stereotype.Controller //enviar los datos a una vista 
//@RequestMapping("/")
//public class UsuarioController {
//
//	@GetMapping("/prueba") //mapeo de la ruta con el servicio 
//	public List<String> prueba() {
//		return List.of("manzana", "Kiwi", "Banana");
//	}
//	
//
//}
@RestController
public class UsuarioController {

	@RequestMapping(value = "usuario/{id}") //mapeo de la ruta con el servicio 
		public Usuario getUsuario(@PathVariable Long id) {
			Usuario usuario = new Usuario(); //new usuario from class Usuario
			usuario.setId(id);
			usuario.setNombre("Dylan");
			usuario.setApellido("Vallejo");
			usuario.setEmail("dylan@gmail.com");
			usuario.setTelefono("1221212");
			return usuario;
			
		}
	
//	@RequestMapping(value = "prueba") //mapeo de la ruta con el servicio 
//	public Usuario getUsuario() {
//		Usuario usuario = new Usuario(); //new usuario from class Usuario
//		usuario.setNombre("Dylan");
//		usuario.setApellido("Vallejo");
//		usuario.setEmail("dylan@gmail.com");
//		usuario.setTelefono("1221212");
//		return usuario;
//		
//	}
//	@RequestMapping(value = "prueba") //mapeo de la ruta con el servicio 
//	public Usuario getUsuario() {
//		Usuario usuario = new Usuario(); //new usuario from class Usuario
//		usuario.setNombre("Dylan");
//		usuario.setApellido("Vallejo");
//		usuario.setEmail("dylan@gmail.com");
//		usuario.setTelefono("1221212");
//		return usuario;
//		
//	}
//	@RequestMapping(value = "prueba") //mapeo de la ruta con el servicio 
//	public Usuario getUsuario() {
//		Usuario usuario = new Usuario(); //new usuario from class Usuario
//		usuario.setNombre("Dylan");
//		usuario.setApellido("Vallejo");
//		usuario.setEmail("dylan@gmail.com");
//		usuario.setTelefono("1221212");
//		return usuario;
//		
//	}
}
	
