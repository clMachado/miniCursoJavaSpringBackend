package com.clmDev.dslist_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clmDev.dslist_backend.classes.Processos;
import com.clmDev.dslist_backend.classes.ProcessosDTO;
import com.clmDev.dslist_backend.repositories.ProcessoRepository;

@Service
public class ProcessoService {
	
	@Autowired
	private ProcessoRepository repo;
	
	public List<Processos> findAll() {
		
		List<Processos> result = repo.findAll();
		
		return result;
		
	}

}
