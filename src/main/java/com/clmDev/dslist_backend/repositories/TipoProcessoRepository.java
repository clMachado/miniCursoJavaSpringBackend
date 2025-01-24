package com.clmDev.dslist_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clmDev.dslist_backend.classes.Processo;
import com.clmDev.dslist_backend.classes.TipoProcesso;

public interface TipoProcessoRepository extends JpaRepository<TipoProcesso, Long> {

}
