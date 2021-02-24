package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;

public class IdadeFilhos implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private int idade; 
	private Convidado convidado; 
	
	public IdadeFilhos() {
		
	}

	public IdadeFilhos(int idade, Convidado convidado) {
		super();
		this.idade = idade;
		this.convidado = convidado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}
	
	

}
