package com.clmDev.dslist_backend.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clmDev.dslist_backend.classes.Pessoa;
import com.clmDev.dslist_backend.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoa> findAll() {
			
		//return repo.findAll().stream().map(x -> new Pessoas(x)).toList();
		return repo.findAll();
	}

}
