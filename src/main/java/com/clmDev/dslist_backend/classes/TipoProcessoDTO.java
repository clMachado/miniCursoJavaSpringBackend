package com.clmDev.dslist_backend.classes;

import java.util.Objects;


public class TipoProcessoDTO {

	private long id;
	private String nome;

	
	public TipoProcessoDTO(TipoProcesso tipoProcesso) {
		id   = tipoProcesso.getId();
		nome = tipoProcesso.getNome();
	}
	
	public TipoProcessoDTO() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoProcessoDTO other = (TipoProcessoDTO) obj;
		return id == other.id;
	}
	
	
	
	

	
	
	
}
