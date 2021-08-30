package com.tlmtech.pesquisamercado.dto;

import java.io.Serializable;
import java.util.Date;

import com.tlmtech.pesquisamercado.domain.Empresa;
import com.tlmtech.pesquisamercado.enums.Status;

public class EmpresaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String nomeEmpresa; 
	private String nomeContato; 
	private String email; 
	private Status status; 
	
	public EmpresaDTO() {
		
	}

	public EmpresaDTO(Empresa obj) {
		this.nomeEmpresa = obj.getNomeEmpresa(); 
		this.nomeContato = obj.getNomeContato(); 
		this.email = obj.getEmail();  
		this.status = obj.getStatus(); 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
	
}
