package com.clmDev.dslist_backend.classes;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Processo processo;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private ProcessoList list;
	
	
	
	public BelongingPK(Processo processo, ProcessoList list) {
		this.processo = processo;
		this.list = list;
	}
	public BelongingPK() {
	}
	public Processo getProcesso() {
		return processo;
	}
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public ProcessoList getList() {
		return list;
	}
	public void setList(ProcessoList list) {
		this.list = list;
	}
	@Override
	public int hashCode() {
		return Objects.hash(list, processo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(list, other.list) && Objects.equals(processo, other.processo);
	}
	
	
	
	

}
