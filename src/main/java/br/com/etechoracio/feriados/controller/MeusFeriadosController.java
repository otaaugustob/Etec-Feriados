package br.com.etechoracio.feriados.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.feriados.dao.MeusFeriadosDAO;
import br.com.etechoracio.feriados.model.MeusFeriados;

@RestController
@RequestMapping("/meusferiados")
public class MeusFeriadosController {
	
	@Autowired
	private MeusFeriadosDAO dao;
	
	@GetMapping
	public List<MeusFeriados> listar(){
		return dao.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MeusFeriados> buscar(@PathVariable long id){
		Optional<MeusFeriados> resultado = dao.findById(id);
		
		if(resultado.isPresent()) {
			return ResponseEntity.ok(resultado.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@ResponseStatus
	@PostMapping
	public void Inserir(@RequestBody MeusFeriados f) {
		dao.save(f);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable long id) {
		Optional<MeusFeriados> resultado = dao.findById(id);
		if(resultado.isPresent()) {
			
			dao.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
}
	
	@PutMapping("/{id}")
	public ResponseEntity<MeusFeriados> update (@PathVariable long id, @RequestBody MeusFeriados f) {
		Optional<MeusFeriados> resultado = dao.findById(id);
		
		if(resultado.isPresent()) {
			f.setId(id);
			dao.save(f);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	
	
}
