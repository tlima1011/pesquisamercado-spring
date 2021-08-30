package com.tlmtech.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlmtech.pesquisamercado.domain.Recrutamento;
import com.tlmtech.pesquisamercado.dto.RecrutamentoDTO;
import com.tlmtech.pesquisamercado.exception.ObjectNotFoundException;
import com.tlmtech.pesquisamercado.repositories.RecrutamentoRepository;

@Service
public class RecrutamentoService {
	
	@Autowired
	private RecrutamentoRepository repository;
	
	public List<Recrutamento> findAll(){
		return repository.findAll(); 
	}
	
	public Recrutamento findById(Integer id) {
		Optional<Recrutamento> obj = repository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Recrutamento não encontrado"));
	}
	
	public Recrutamento insert(Recrutamento obj) {
		return repository.insert(obj); 
	}
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Recrutamento update(Recrutamento obj) {
		Recrutamento newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}
	
	
	private void updateData(Recrutamento newObj, Recrutamento obj) {
		newObj.setName(obj.getName());	
		newObj.setEmail(obj.getEmail());
		
	}

	public Recrutamento fromDTO(RecrutamentoDTO objdto) {
		return new User(objdto.getId(), objdto.getName(), objdto.getEmail()); 
	}
}
