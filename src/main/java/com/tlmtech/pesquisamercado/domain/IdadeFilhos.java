package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;

public class IdadeFilhos implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String idade; 
	
	private Convidado convidado; 
	
	public IdadeFilhos() {
		
	}

	public IdadeFilhos(String idade, Convidado convidado) {
		super();
		this.idade = idade;
		this.convidado = convidado;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}
	
	

}
