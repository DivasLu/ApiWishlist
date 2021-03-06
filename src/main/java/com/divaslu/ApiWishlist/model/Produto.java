package com.divaslu.ApiWishlist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "tb_produto")

public class Produto {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private Long id;

	private String nome;
	private String descricao;
	private String cor;
	private double valor;
	
	
	
	public Produto(String nome, String descricao, String cor, Double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.cor = cor;
		this.valor = valor;
	}

	public Produto () {}

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

		
	
		
}


	
