package com.clmDev.dslist_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clmDev.dslist_backend.classes.TipoProcesso;
import com.clmDev.dslist_backend.classes.TipoProcessoDTO;
import com.clmDev.dslist_backend.repositories.TipoProcessoRepository;

@Service
public class TipoProcessoService {
	
	@Autowired
	private TipoProcessoRepository repo;
	
	@Transactional(readOnly = true)
	public List<TipoProcessoDTO> findAll() {
		List<TipoProcesso> lista = repo.findAll();
		
		return lista.stream().map(x -> new TipoProcessoDTO(x)).toList();
	}
	

	
	
	

}
