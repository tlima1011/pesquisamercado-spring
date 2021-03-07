package com.tlmtech.pesquisamercado.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tlmtech.pesquisamercado.domain.CarroMarcaAnoModelo;
import com.tlmtech.pesquisamercado.domain.Convidado;
import com.tlmtech.pesquisamercado.domain.Endereco;
import com.tlmtech.pesquisamercado.domain.IdadeFilhos;
import com.tlmtech.pesquisamercado.domain.Recrutamento;
import com.tlmtech.pesquisamercado.domain.Telefone;
import com.tlmtech.pesquisamercado.enums.EstadoCivil;
import com.tlmtech.pesquisamercado.enums.Instrucao;
import com.tlmtech.pesquisamercado.enums.Status;

@RestController
@RequestMapping(value="/convidados")
public class ConvidadoResource {

	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Convidado>> findAll() throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Recrutamento r1 = new Recrutamento(1, "9987/30","BomBom BomD+", sdf.parse("12/02/2021"), 120.0, 60.0);
				
		Convidado c1 = new Convidado(1L, "Luis Astolfo", "777777888888", sdf.parse("25/03/2000"), 
				"9969944568", "luismane@gkmail.net", "Brasileiro", "21 anos", 
				21, EstadoCivil.CASADO, 'S', 
				"Auxiliar Administrativo", 'S', "Medicina", "21 anos",
				3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
				'S', 'S', Instrucao.MEDIO_COMPLETO_SUPERIOR_INCOMPLETO, 
				"Itaú", "Gerente", Status.ATIVO, r1); 
				
		IdadeFilhos i1 = new IdadeFilhos("3", c1);
		IdadeFilhos i2 = new IdadeFilhos("2", c1); 
			
		//c1.getIdadeFilhos().add(i1);
		//c1.getIdadeFilhos().add(i2);
		
		//Endereco e1 = new Endereco(1,"Rua Joao Cabreuva", "2222","Cidade Tiradentes","8888889999", c1);
			
		
		List<Convidado> list = new ArrayList<>(); 
		
		list.addAll(Arrays.asList(c1));
		
		return ResponseEntity.ok().body(list);
				
	}
}
