package com.tlmtech.pesquisamercado.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tlmtech.pesquisamercado.domain.Empresa;
import com.tlmtech.pesquisamercado.dto.EmpresaDTO;
import com.tlmtech.pesquisamercado.services.EmpresaService;

@RestController
@RequestMapping(value="/empresa")
public class EmpresaResource {

	@Autowired
	private EmpresaService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EmpresaDTO>> findAll(){
		
		List <Empresa> list = service.findAll();
		List<EmpresaDTO> listDto = list.stream().map(x -> new EmpresaDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody EmpresaDTO objDto){
		Empresa obj = service.fromDTO(objDto); 
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idEmpresa}").buildAndExpand(obj.getIdEmpresa()).toUri(); 
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{idEmpresa}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id); 
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{idEmpresa}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody EmpresaDTO objDto, @PathVariable Integer idEmpresa){
		Empresa obj = service.fromDTO(objDto); 
		obj.setIdEmpresa(idEmpresa);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	
}
