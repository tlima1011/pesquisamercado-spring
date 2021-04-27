package com.tlmtech.pesquisamercado.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tlmtech.pesquisamercado.domain.Recrutamento;
import com.tlmtech.pesquisamercado.dto.RecrutamentoDTO;
import com.tlmtech.pesquisamercado.services.RecrutamentoService;

@RestController
@RequestMapping(value="/recrutamentos")
public class RecrutamentoResource {

	@Autowired
	private RecrutamentoService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<RecrutamentoDTO>> findAll(){
		
		List <Recrutamento> list = service.findAll();
		List<RecrutamentoDTO> listDto = list.stream().map(x -> new RecrutamentoDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
}
