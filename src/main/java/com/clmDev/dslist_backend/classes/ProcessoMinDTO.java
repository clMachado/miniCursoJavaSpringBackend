package com.clmDev.dslist_backend.classes;

import com.clmDev.dslist_backend.projection.ProcessoMinProjection;

public class ProcessoMinDTO {

		private long id;
		private String nome;
		private String nroProcesso;
		private String descricaoCurta;
		private String imgUrl;
		private Integer position;
		
		
		public ProcessoMinDTO() {
		}

		public ProcessoMinDTO(Processo processos) {
			id = processos.getId();
			nome = processos.getNome();
			nroProcesso = processos.getNroProcesso();
			descricaoCurta = processos.getDescricaoCurta();
			imgUrl = processos.getImgUrl();
		}
		
		public ProcessoMinDTO(ProcessoMinProjection proj) {
			this.id = proj.getId();
			this.nroProcesso = proj.getNroProcesso();
			this.nome = proj.getNome();
			this.descricaoCurta = proj.getDescricaoCurta();
			this.position = proj.getPosition();
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
		public int getPosition() {
			return position;
		}
	
		
		
		

}
