package com.clmDev.dslist_backend.classes;

import java.util.Objects;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processos")
public class Processos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String nroProcesso;
	private String descricaoCurta;
	private String imgUrl;
	private String descricaoLonga;
	
	
	public Processos() {
		super();
	}


	public Processos(long id, String nome, String nroProcesso,  String descricaoCurta, String imgUrl, String descricaoLonga) {
		this.id = id;
		this.nome = nome;
		this.descricaoCurta = descricaoCurta;
		this.imgUrl = imgUrl;
		this.descricaoLonga = descricaoLonga;
		this.nroProcesso = nroProcesso;
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
		Processos other = (Processos) obj;
		return Objects.equals(nroProcesso, other.nroProcesso);
	}




	
	
	
}
