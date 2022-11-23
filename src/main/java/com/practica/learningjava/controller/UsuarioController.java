package com.practica.learningjava.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "usuarios") //mapeo de la ruta con el servicio 
	public List<Usuario> getUsuarios() {
		
		List<Usuario> usuarios = new ArrayList<>();
		Usuario usuario = new Usuario(); //new usuario from class Usuario
		usuario.setId(12L);
		usuario.setNombre("Dylan");
		usuario.setApellido("Vallejo");
		usuario.setEmail("dylan@gmail.com");
		usuario.setTelefono("12324");
		
		Usuario usuario2 = new Usuario(); //new usuario from class Usuario
		usuario2.setId(1234L);
		usuario2.setNombre("qwerq");
		usuario2.setApellido("Vallejo");
		usuario2.setEmail("dylan@gmail.com");
		usuario2.setTelefono("12341234");
		
		Usuario usuario3 = new Usuario(); //new usuario from class Usuario
		usuario3.setId(12341234L);
		usuario3.setNombre("qwerqwer");
		usuario3.setApellido("Vallejo");
		usuario3.setEmail("dylan@gmail.com");
		usuario3.setTelefono("444123412");
		

		usuarios.add(usuario);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		

		return usuarios;
		
	}
	@RequestMapping(value = "usuario123") //mapeo de la ruta con el servicio 
	public Usuario editar() {
		Usuario usuario = new Usuario(); //new usuario from class Usuario
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
}
	
