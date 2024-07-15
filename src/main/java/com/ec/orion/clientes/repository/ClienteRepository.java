package com.ec.orion.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ec.orion.clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
