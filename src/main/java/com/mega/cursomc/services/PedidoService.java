package com.mega.cursomc.services;

import com.mega.cursomc.domain.Pedido;
import com.mega.cursomc.repositories.PedidoRepository;
import com.mega.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"object not found! ID: " + id + ", Type: " + Pedido.class.getName()));
	}
}
