package com.tlmtech.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tlmtech.pesquisamercado.domain.Convidado;

@Repository
public interface ConvidadoRepository extends MongoRepository<Convidado, Long>{
	
}
