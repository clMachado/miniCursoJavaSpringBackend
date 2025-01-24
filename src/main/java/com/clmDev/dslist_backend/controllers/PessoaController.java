package com.clmDev.dslist_backend.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clmDev.dslist_backend.classes.Pessoa;
import com.clmDev.dslist_backend.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService serv;
	
	@GetMapping
	public List<Pessoa> findAll() {
		List<Pessoa> Pessoas =  serv.findAll();
		return Pessoas;
	}
	
	

}
