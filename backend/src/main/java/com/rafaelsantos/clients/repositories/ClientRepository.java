package com.rafaelsantos.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.clients.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
