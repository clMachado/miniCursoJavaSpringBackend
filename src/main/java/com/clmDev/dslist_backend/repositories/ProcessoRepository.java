package com.clmDev.dslist_backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.clmDev.dslist_backend.classes.Processo;
import com.clmDev.dslist_backend.projection.ProcessoMinProjection;

public interface ProcessoRepository extends JpaRepository<Processo, Long> {
	
	@Query(nativeQuery = true, value = """
			SELECT bl.position, pr.id, pr.nro_processo as nroProcesso, pr.nome, pr.descricao_curta as descricaoCurta  FROM TB_PROCESSOs as pr 
			inner join tb_belonging as bl on
			pr.id = bl.processo_id
			where
			bl.tipo_id = :tipo_id
			order by bl.tipo_id
			""")
			List<ProcessoMinProjection> searchByList(Long tipo_id); 
}
