package com.mega.cursomc.services;

import com.mega.cursomc.domain.Cliente;
import com.mega.cursomc.repositories.ClienteRepository;
import com.mega.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"object not found! ID: " + id + ", Type: " + Cliente.class.getName()));
	}
}
