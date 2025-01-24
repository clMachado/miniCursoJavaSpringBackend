package com.clmDev.dslist_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clmDev.dslist_backend.classes.Documentos;
import com.clmDev.dslist_backend.services.DocumentoService;

@RestController
@RequestMapping(value = "/docs")
public class DocumentoController {
	
	@Autowired
	private DocumentoService serv;
	
	@GetMapping
	public List<Documentos> findAll() {
		List<Documentos> documentos =  serv.findAll();
		return documentos;
	}
	
	

}
