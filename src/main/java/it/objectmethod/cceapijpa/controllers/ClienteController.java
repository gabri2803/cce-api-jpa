package it.objectmethod.cceapijpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cceapijpa.dao.IClienteDao;
import it.objectmethod.cceapijpa.entity.Cliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	IClienteDao clienteDao;

	@GetMapping("/all")
	public ResponseEntity<List<Cliente>> getAll() {
		List<Cliente> cli = null;
		ResponseEntity<List<Cliente>> resp = null;
		try {
			cli = clienteDao.findAll();
			resp = new ResponseEntity<>(cli, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
}
