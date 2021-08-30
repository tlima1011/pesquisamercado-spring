package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="recrutamento")
public class Recrutamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id; 
	private String numProjeto; 
	private String descProjeto; 
	private Date dataRecrutamento; 
	private Double valorPagar; 
	private Double beneficio; 
	
	@DBRef(lazy = true)
	private List<Convidado> convidados = new ArrayList<>(); 
		
	public Recrutamento() { 
		
	}

	public Recrutamento(String numProjeto, String descProjeto, Date dataRecrutamento,
			Double valorPagar, Double beneficio) {
		//this.id = id;
		this.numProjeto = numProjeto;
		this.descProjeto = descProjeto;
		this.dataRecrutamento = dataRecrutamento;
		this.valorPagar = valorPagar;
		this.beneficio = beneficio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer idRecrutamento) {
		this.id = idRecrutamento;
	}

	public String getNumProjeto() {
		return numProjeto;
	}

	public void setNumProjeto(String numProjeto) {
		this.numProjeto = numProjeto;
	}

	public String getDescProjeto() {
		return descProjeto;
	}

	public void setDescProjeto(String descProjeto) {
		this.descProjeto = descProjeto;
	}

	public Date getDataRecrutamento() {
		return dataRecrutamento;
	}

	public void setDataRecrutamento(Date dataRecrutamento) {
		this.dataRecrutamento = dataRecrutamento;
	}

	public Double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public Double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(Double beneficio) {
		this.beneficio = beneficio;
	}

	public List<Convidado> getConvidados() {
		return convidados;
	}
	
}
