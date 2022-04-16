package com.example.teste.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.teste.dto.PessoaDTO;
import com.example.teste.entities.Pessoa;
import com.example.teste.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Page<PessoaDTO> findAllPaged(PageRequest pageRequest) {
		Page<Pessoa> list = pessoaRepository.findAll(pageRequest);
		return list.map(x -> new PessoaDTO(x));
	}
}
