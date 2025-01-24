package com.clmDev.dslist_backend.classes;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_docs")
public class Documentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	@Column(columnDefinition = "TEXT")
	private String url;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Documentos(Long iD, String descricao, String url) {
		ID = iD;
		this.descricao = descricao;
		this.url = url;
	}
	public Documentos() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(url);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documentos other = (Documentos) obj;
		return Objects.equals(url, other.url);
	}
	
	

	
	
	
	
	
	
	

}
