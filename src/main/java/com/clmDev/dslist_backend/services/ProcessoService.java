package com.clmDev.dslist_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clmDev.dslist_backend.classes.Processo;
import com.clmDev.dslist_backend.classes.ProcessoDTO;
import com.clmDev.dslist_backend.classes.ProcessoMinDTO;
import com.clmDev.dslist_backend.projection.ProcessoMinProjection;
import com.clmDev.dslist_backend.repositories.ProcessoRepository;

@Service
public class ProcessoService {
	
	@Autowired
	private ProcessoRepository repo;
	
	@Transactional(readOnly = true)
	public List<ProcessoMinDTO> findAll() {
		return repo.findAll().stream().map(x -> new ProcessoMinDTO(x)).toList();
	}
	
	
	@Transactional(readOnly = true)
	public ProcessoDTO findById(Long id) {
		ProcessoDTO proc;
		try {
			proc = new ProcessoDTO(repo.findById(id).get());
		}catch (Exception e) {
			proc = new ProcessoDTO();
			proc.setDescricaoCurta("PROCESSO DE ID " + id + " NAO ENCONTRADO!!");
		}
		
		return proc;
	}
	
	@Transactional(readOnly = true)
	public List<ProcessoMinDTO> findByList(Long ListId) {
		return repo.searchByList(ListId).stream().map(x -> new ProcessoMinDTO(x)).toList();
	}
	
	@Transactional()
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		
		List<ProcessoMinProjection> list = repo.searchByList(listId);
		
		ProcessoMinProjection obj = list.remove(sourceIndex); // remove da posicao inicial e guarda em variavel
		list.add(destinationIndex, obj); // pega da variavel e joga para nova posicao
		
		var min = (sourceIndex < destinationIndex ? sourceIndex : destinationIndex);
		var max = (sourceIndex < destinationIndex ? destinationIndex : sourceIndex);
		
		for(int i = min; i<= max; i++) {			
			repo.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	
		
	}



}
