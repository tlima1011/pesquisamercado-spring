package com.tlmtech.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlmtech.pesquisamercado.domain.Empresa;
import com.tlmtech.pesquisamercado.domain.Recrutamento;
import com.tlmtech.pesquisamercado.dto.EmpresaDTO;
import com.tlmtech.pesquisamercado.dto.RecrutamentoDTO;
import com.tlmtech.pesquisamercado.exception.ObjectNotFoundException;
import com.tlmtech.pesquisamercado.repositories.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository repository;
	
	public List<Empresa> findAll(){
		return repository.findAll(); 
	}
	
	public Empresa findById(Integer id) {
		Optional<Empresa> obj = repository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Recrutamento não encontrado"));
	}
	
	public Empresa insert(Empresa obj) {
		return repository.insert(obj); 
	}
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Empresa update(Empresa obj) {
		Empresa newObj = findById(obj.getIdEmpresa());
		updateData(newObj, obj);
		return repository.save(newObj);
	}
	
	
	private void updateData(Empresa newObj, Empresa obj) {
		newObj.setNomeEmpresa(obj.getNomeEmpresa());	
		newObj.setNomeContato(obj.getNomeContato());		
		newObj.setEmail(obj.getEmail());
		newObj.setStatus(obj.getStatus());
	}
	
	public Empresa fromDTO(EmpresaDTO objdto) {
		return new Empresa(
				 objdto.getId(),
				 objdto.getNomeEmpresa() 
				, objdto.getNomeContato()
				, objdto.getEmail()
				, objdto.getStatus()); 
	}
//	this.numProjeto = numProjeto;
//	this.descProjeto = descProjeto;
//	this.dataRecrutamento = dataRecrutamento;
//	this.valorPagar = valorPagar;
//	this.beneficio = beneficio;

}
