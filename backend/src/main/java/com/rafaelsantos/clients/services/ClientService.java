package com.rafaelsantos.clients.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsantos.clients.dto.ClientDTO;
import com.rafaelsantos.clients.entities.Client;
import com.rafaelsantos.clients.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageable){
		Page<Client> list = repository.findAll(pageable);
		return list.map(x -> new ClientDTO(x));
	}
}
