package com.tlmtech.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tlmtech.pesquisamercado.domain.Convidado;
import com.tlmtech.pesquisamercado.domain.Recrutamento;

@Repository
public interface RecrutamentoRepository extends MongoRepository<Recrutamento, Integer>{
	
}
