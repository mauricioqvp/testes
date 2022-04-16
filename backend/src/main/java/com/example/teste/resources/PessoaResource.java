package com.example.teste.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste.dto.PessoaDTO;
import com.example.teste.servicies.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService service;
	
	@GetMapping
	public ResponseEntity<Page<PessoaDTO>> findAll(
		@RequestParam(value = "page", defaultValue = "0") Integer page,
		@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
		@RequestParam(value = "direction", defaultValue = "ASC") String direction,
		@RequestParam(value = "orderBy", defaultValue = "firstName") String orderBy
	){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		Page<PessoaDTO> list = service.findAllPaged(pageRequest);
		return ResponseEntity.ok().body(list);
	}
}
