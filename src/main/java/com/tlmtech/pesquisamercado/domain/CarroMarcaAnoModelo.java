package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;

public class CarroMarcaAnoModelo implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String marca; 
	private String modelo; 
	private Integer ano; 
	
	private Convidado convidado; 
	
	public CarroMarcaAnoModelo() {
		
	}

	public CarroMarcaAnoModelo(Integer id, String marca, String modelo, Integer ano, Convidado convidado) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.convidado = convidado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}
	

}
