package com.clmDev.dslist_backend.classes;

import java.util.Objects;

import org.springframework.beans.BeanUtils;


public class ProcessoDTO {

	private long id;
	private String nome;
	private String nroProcesso;
	private String descricaoCurta;
	private String imgUrl;
	private String descricaoLonga;
	
	
	public ProcessoDTO() {

	}


	public ProcessoDTO(Processo processo) {
		try {
		BeanUtils.copyProperties(processo, this); // copia de processo para o ojeto atual
		}
		catch (Exception e) {
			ProcessoDTO proc = new ProcessoDTO();
			proc.setDescricaoCurta("PROCESSO NAO ENCONTRADO!!!");
		}
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
	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDescricaoLonga() {
		return descricaoLonga;
	}
	public void setDescricaoLonga(String descricaoLonga) {
		this.descricaoLonga = descricaoLonga;
	}

	public String getNroProcesso() {
		return nroProcesso;
	}
	public void setNroProcesso(String nroProcesso) {
		this.nroProcesso = nroProcesso;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nroProcesso);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessoDTO other = (ProcessoDTO) obj;
		return Objects.equals(nroProcesso, other.nroProcesso);
	}




	
	
	
}
