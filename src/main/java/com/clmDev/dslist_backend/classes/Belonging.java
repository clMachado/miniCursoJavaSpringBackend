package com.clmDev.dslist_backend.classes;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	// como a chave sera composta de 2 informaçoes, preciso agrupalas em um ID 
	// por isso a tab auxiliar
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer position;

	public Belonging(Processo processo, TipoProcesso tipo, Integer position) {
		this.id.setProcesso(processo);
		this.id.setTipo(tipo);
		this.position = position;
	}
	
	
	
	public Belonging() {
	}
	public BelongingPK getId() {
		return id;
	}
	public void setId(BelongingPK id) {
		this.id = id;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
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
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	


}
