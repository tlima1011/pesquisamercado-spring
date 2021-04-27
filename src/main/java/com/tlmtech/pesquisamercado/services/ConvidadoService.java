package com.tlmtech.pesquisamercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlmtech.pesquisamercado.domain.Convidado;
import com.tlmtech.pesquisamercado.repositories.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;
	
	public List<Convidado> findAll(){
		return repository.findAll(); 
	}
}
