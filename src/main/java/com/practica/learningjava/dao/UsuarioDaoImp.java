package com.practica.learningjava.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.practica.learningjava.model.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional   //hace referencia en como va a armar consultas y ejecutarlas fragmentos de transaccion
public class UsuarioDaoImp implements UsuarioDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		String query = "FROM Usuario";
		return entityManager.createQuery(query).getResultList();
	}

}
