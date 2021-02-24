package com.tlmtech.pesquisamercado.domain;

public class CriterioBrasil {
	
	private Integer id; 
	private String classeEconomica;
	private int pontuacao; 
	
	private Convidado convidado;

	public CriterioBrasil(Integer id, Convidado convidado) {
		super();
		this.id = id;
		this.convidado = convidado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	} 
	
	
	
	
}
