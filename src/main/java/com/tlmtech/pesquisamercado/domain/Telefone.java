package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;

public class Telefone implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String telefone; 
	private Convidado convidado; 
	
	public Telefone() {
		
	}
	
	public Telefone(Convidado convidado, Integer id, String telefone) {
		super();
		this.id = id; 
		this.convidado = convidado; 
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

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

	@Override
	public String toString() {
		return "Telefone [telefone=" + telefone + "]";
	}
}
