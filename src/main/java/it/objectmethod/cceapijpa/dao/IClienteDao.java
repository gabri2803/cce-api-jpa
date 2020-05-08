package it.objectmethod.cceapijpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceapijpa.entity.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Integer> {

}
