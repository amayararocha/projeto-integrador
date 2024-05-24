package com.generation.alimentacaosolidaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull(message = "O Atributo Nome é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo Nome deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nomeCategoria; 
	
	@NotNull(message = "O Atributo Descrição é obrigatório")
	@Size(min = 3, max = 100, message = "O atributo Descrição deve conter no mínimo 03 e no máximo 100 caracteres")
	private String descricaoCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	
}