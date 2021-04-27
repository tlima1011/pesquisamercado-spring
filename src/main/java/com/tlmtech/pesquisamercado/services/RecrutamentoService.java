package com.tlmtech.pesquisamercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlmtech.pesquisamercado.domain.Recrutamento;
import com.tlmtech.pesquisamercado.repositories.RecrutamentoRepository;

@Service
public class RecrutamentoService {
	
	@Autowired
	private RecrutamentoRepository repository;
	
	public List<Recrutamento> findAll(){
		return repository.findAll(); 
	}
	
	public Recrutamento insert(Recrutamento obj) {
		return repository.insert(obj); 
	}
}
