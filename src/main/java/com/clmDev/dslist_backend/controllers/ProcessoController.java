package com.clmDev.dslist_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clmDev.dslist_backend.classes.ProcessoDTO;
import com.clmDev.dslist_backend.classes.ProcessoMinDTO;
import com.clmDev.dslist_backend.classes.ProcessoreplacementDTO;
import com.clmDev.dslist_backend.services.ProcessoService;

@RestController
@RequestMapping(value = "/processos")
public class ProcessoController {
	
	@Autowired
	private ProcessoService serv;

	
	@GetMapping
	public List<ProcessoMinDTO> findAll() {
		List<ProcessoMinDTO> processos =  serv.findAll();
		return processos;
	}
	
	@GetMapping(value = "/{id}")
	public ProcessoDTO findById(@PathVariable Long id) {
		return serv.findById(id);
	}
	
	@PostMapping(value = "/{id}/replacement")
	public void replacement(@PathVariable Long id, @RequestBody ProcessoreplacementDTO body) {
		serv.move(id, body.getIndexOrigem(), body.getIndexDestino());
	}
	

	
	

}
