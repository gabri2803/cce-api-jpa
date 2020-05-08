package it.objectmethod.cceapijpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.cceapijpa.entity.Cliente;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

}
