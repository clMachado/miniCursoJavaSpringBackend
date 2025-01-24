package com.clmDev.dslist_backend.classes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProcessoMinDTO {

		private long id;
		private String nome;
		private String nroProcesso;
		private String descricaoCurta;
		private String imgUrl;
		
		public ProcessoMinDTO() {
			super();
		}

		public ProcessoMinDTO(Processo processos) {
			id = processos.getId();
			nome = processos.getNome();
			nroProcesso = processos.getNroProcesso();
			descricaoCurta = processos.getDescricaoCurta();
			imgUrl = processos.getImgUrl();
		}

		public long getId() {
			return id;
		}
		public String getNome() {
			return nome;
		}
		public String getNroProcesso() {
			return nroProcesso;
		}
		public String getDescricaoCurta() {
			return descricaoCurta;
		}
		public String getImgUrl() {
			return imgUrl;
		}
	
		
		
		

}
