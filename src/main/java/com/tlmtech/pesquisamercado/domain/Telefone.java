package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;

public class Telefone implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String telefone; 
	
	public Telefone() {
		
	}
	
	public Telefone(Integer id, String telefone) {
		this.id = id;  
		this.telefone = telefone;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
