package com.clmDev.dslist_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clmDev.dslist_backend.classes.ProcessoMinDTO;
import com.clmDev.dslist_backend.services.ProcessoService;

@RestController
@RequestMapping(value = "/lists")
public class ListController {
	
	@Autowired
	private ProcessoService serv;

	

	@GetMapping(value = "/{listId}/processos")
	public List<ProcessoMinDTO> findByList(@PathVariable Long listId) {
		return serv.findByList(listId);
	}
	

	
	

}
