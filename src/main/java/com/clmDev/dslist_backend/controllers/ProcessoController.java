package com.clmDev.dslist_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clmDev.dslist_backend.classes.Processos;
import com.clmDev.dslist_backend.services.ProcessoService;

@RestController
@RequestMapping(value = "/processos")
public class ProcessoController {
	
	@Autowired
	private ProcessoService serv;
	
	@GetMapping
	public List<Processos> findAll() {
		List<Processos> processos =  serv.findAll();
		return processos;
	}
	
	

}
