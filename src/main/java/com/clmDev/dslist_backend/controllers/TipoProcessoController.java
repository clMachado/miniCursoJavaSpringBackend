package com.clmDev.dslist_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clmDev.dslist_backend.classes.TipoProcessoDTO;
import com.clmDev.dslist_backend.services.TipoProcessoService;

@RestController
@RequestMapping(value = "/tipoProcessos")
public class TipoProcessoController {
	
	@Autowired
	private TipoProcessoService serv;

	
	@GetMapping
	public List<TipoProcessoDTO> findAll() {
		List<TipoProcessoDTO> processos =  serv.findAll();
		return processos;
	}
	/*
	@GetMapping(value = "/{id}")
	public ProcessoDTO findById(@PathVariable Long id) {
		return serv.findById(id);
	}
	*/

	
	

}
