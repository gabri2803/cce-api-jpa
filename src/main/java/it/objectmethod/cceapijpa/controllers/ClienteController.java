package it.objectmethod.cceapijpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.cceapijpa.entity.Cliente;
import it.objectmethod.cceapijpa.repo.ClienteRepo;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepo cliRepo;

	@GetMapping("/list")
	public ResponseEntity<List<Cliente>> getAll() {
		List<Cliente> cli = null;
		ResponseEntity<List<Cliente>> resp = null;
		try {
			cli = cliRepo.findAll();
			resp = new ResponseEntity<>(cli, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}

	@GetMapping("/{id}/by-id")
	public ResponseEntity<Optional<Cliente>> findClienteById(@PathVariable("id") Integer id) {
		ResponseEntity<Optional<Cliente>> resp = null;
		try {
			Optional<Cliente> cli = cliRepo.findById(id);
			resp = new ResponseEntity<>(cli, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return resp;
	}

	@PostMapping("/create")
	public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente c) {
		ResponseEntity<Cliente> resp = null;
		try {
			cliRepo.save(c);
			resp = new ResponseEntity<>(c, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@PostMapping("{id}/update")
	public ResponseEntity<Cliente> updateCliente(@PathVariable("id") int id, @RequestBody Cliente c) {
		ResponseEntity<Cliente> resp = null;
		c.setId(id);
		try {
			cliRepo.save(c);
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@DeleteMapping("{id}/delete")
	public ResponseEntity<Cliente> deleteCliente(@PathVariable("id") int id) {
		ResponseEntity<Cliente> resp = null;
		try {
			cliRepo.deleteById(id);
			resp = new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
