package com.clmDev.dslist_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clmDev.dslist_backend.classes.Documento;
import com.clmDev.dslist_backend.repositories.DocumentoRepository;

@Service
public class DocumentoService {
	
	@Autowired
	private DocumentoRepository repo;
	
	public List<Documento> findAll() {
			
		//return repo.findAll().stream().map(x -> new Pessoas(x)).toList();
		return repo.findAll();
	}

}
