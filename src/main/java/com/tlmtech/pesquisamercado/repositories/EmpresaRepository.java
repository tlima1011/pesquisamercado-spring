package com.tlmtech.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tlmtech.pesquisamercado.domain.Empresa;

@Repository
public interface EmpresaRepository extends MongoRepository<Empresa, Integer>{
	
}
