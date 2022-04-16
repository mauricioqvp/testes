package com.example.teste.dto;

import com.example.teste.entities.Pessoa;

public class PessoaDTO {
	
	public Long id;
	public String nome;
	public String sobreNome;
	public Float salario;
	
	public PessoaDTO() {
	}

	public PessoaDTO(Long id, String nome, String sobreNome, Float salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salario = salario;
	}
	
	public PessoaDTO(Pessoa entity) {
		id = entity.getId();
		nome = entity.getNome();
		sobreNome = entity.getSobreNome();
		salario = entity.getSalario();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
	
	

}
