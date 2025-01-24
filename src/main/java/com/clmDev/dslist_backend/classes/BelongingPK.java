package com.clmDev.dslist_backend.classes;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name = "processo_id")
	private Processo processo;
	
	@ManyToOne
	@JoinColumn(name = "tipo_id")
	private TipoProcesso tipo;
	
	
	
	public BelongingPK(Processo processo, TipoProcesso tipo) {
		this.processo = processo;
		this.tipo = tipo;
	}
	public BelongingPK() {
	}
	public Processo getProcesso() {
		return processo;
	}
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public TipoProcesso getTipo() {
		return tipo;
	}
	public void setTipo(TipoProcesso tipo) {
		this.tipo = tipo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(tipo, processo);
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
		return Objects.equals(tipo, other.tipo) && Objects.equals(processo, other.processo);
	}
	
	
	
	

}
