package com.example.teste.servicies;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.teste.repositories.PessoaRepository;

public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void findAllPaged() {
		Long totalDeItens = pessoaRepository.count();
		System.out.println("Total de intens: " + totalDeItens);
	}
	
}
