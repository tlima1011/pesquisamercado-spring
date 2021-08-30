package com.tlmtech.pesquisamercado.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.tlmtech.pesquisamercado.domain.Endereco;
import com.tlmtech.pesquisamercado.domain.Recrutamento;
import com.tlmtech.pesquisamercado.domain.Telefone;
import com.tlmtech.pesquisamercado.repositories.ConvidadoRepository;
import com.tlmtech.pesquisamercado.repositories.RecrutamentoRepository;

public class TestConfig2 implements CommandLineRunner{

	@Autowired 
	private ConvidadoRepository convidadoRepository;
	
	@Autowired
	private RecrutamentoRepository recrutamentoRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Telefone telefone1 = new Telefone(null, "4441233");
		Telefone telefone2 = new Telefone(null, "9998888"); 
		Endereco endEmpresa1 = new Endereco(null, "Rua Gomes de Carvalho","88","Vila Olimpia","774769");
		
		
		
		
		
		
		Recrutamento r2 = new Recrutamento("555/22","Chocolate", sdf.parse("03/02/2021"), 120.0, 60.0);
		recrutamentoRepository.saveAll(Arrays.asList(r2));
	}
}
