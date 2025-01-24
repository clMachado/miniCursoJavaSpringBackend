package com.clmDev.dslist_backend.classes;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoas")
public class Pessoas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	private String nome;
	private String CPF_CNPJ;
	private String telefone;
	private String email;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF_CNPJ() {
		return CPF_CNPJ;
	}
	public void setCPF_CNPJ(String cPF_CNPJ) {
		CPF_CNPJ = cPF_CNPJ;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CPF_CNPJ);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoas other = (Pessoas) obj;
		return Objects.equals(CPF_CNPJ, other.CPF_CNPJ);
	}
	
	public Pessoas(Long iD, String nome, String cPF_CNPJ, String telefone, String email) {
		ID = iD;
		this.nome = nome;
		CPF_CNPJ = cPF_CNPJ;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Pessoas() {
		super();
	}
	
	
	
	

}
