package com.tlmtech.pesquisamercado.resources;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tlmtech.pesquisamercado.domain.Convidado;
import com.tlmtech.pesquisamercado.services.ConvidadoService;

@RestController
@RequestMapping(value="/convidado")
public class ConvidadoResource {

	@Autowired
	private ConvidadoService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Convidado>> findAll() throws ParseException{
		
		List <Convidado> list = service.findAll();
		return ResponseEntity.ok().body(list);
				
	}
}
