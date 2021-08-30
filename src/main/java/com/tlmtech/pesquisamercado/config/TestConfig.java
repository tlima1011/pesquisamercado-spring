package com.tlmtech.pesquisamercado.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.tlmtech.pesquisamercado.domain.Recrutamento;
import com.tlmtech.pesquisamercado.repositories.ConvidadoRepository;
import com.tlmtech.pesquisamercado.repositories.RecrutamentoRepository;

public class TestConfig implements CommandLineRunner{

	@Autowired 
	private ConvidadoRepository convidadoRepository;
	
	@Autowired
	private RecrutamentoRepository recrutamentoRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		//convidadoRepository.deleteAll();
		//recrutamentoRepository.deleteAll();
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		//Recrutamento r1 = new Recrutamento(null, "9987/30","BomBom BomD+", sdf.parse("12/02/2021"), 120.0, 60.0);
		//Recrutamento r2 = new Recrutamento(null, "555/22","Chocolate", sdf.parse("03/02/2021"), 120.0, 60.0);
		/*Convidado c1 = new Convidado(null, "Luis Astolfo", "777777888888", sdf.parse("25/03/2000"), 
				"9969944568", "luismane@gkmail.net", "Brasileiro", "21 anos", 
				21, EstadoCivil.CASADO, 'S', 
				"Auxiliar Administrativo", 'S', "Medicina", "21 anos",
				3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
				'S', 'S', Instrucao.MEDIO_COMPLETO_SUPERIOR_INCOMPLETO, 
				"Itaú", "Gerente", Status.ATIVO, r1); 
				
		Convidado c2 = new Convidado(null, "ANDRIANA VARGAS DE CASTILHO", "2208229-9", 
				 sdf.parse("19/02/1971"), 
				"14604916888", "-", "Brasileira", "0 anos", 
				47, EstadoCivil.SOLTEIRO, 'S', 
				"Secretaria", 'N', "-", "-",
				3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
				'S', 'S', Instrucao.SUPERIOR_COMPLETO, 
				"-", "-", Status.ATIVO, r1); 
				
		//IdadeFilhos i1 = new IdadeFilhos("3", c1);
		//IdadeFilhos i2 = new IdadeFilhos("2", c1); 
		r1.getConvidados().add(c1); 
		r1.getConvidados().add(c2); */
		
		//recrutamentoRepository.saveAll(Arrays.asList(r1, r2)); 
		//convidadoRepository.saveAll(Arrays.asList(c1, c2));
		
		Recrutamento r2 = new Recrutamento("555/22","Chocolate", sdf.parse("03/02/2021"), 120.0, 60.0);
		recrutamentoRepository.saveAll(Arrays.asList(r2));
	}
}
