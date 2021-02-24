package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recrutamento implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	private Integer idRecrutamento; 
	private String numProjeto; 
	private String descProjeto; 
	private Date dataRecrutamento; 
	private Double valorPagar; 
	private Double beneficio; 
	
	private List<Convidado> convidados = new ArrayList<>(); 
	
	public Recrutamento() { 
		
	}

	public Recrutamento(Integer idRecrutamento, String numProjeto, String descProjeto, Date dataRecrutamento,
			Double valorPagar, Double beneficio) {
		super();
		this.idRecrutamento = idRecrutamento;
		this.numProjeto = numProjeto;
		this.descProjeto = descProjeto;
		this.dataRecrutamento = dataRecrutamento;
		this.valorPagar = valorPagar;
		this.beneficio = beneficio;
	}

	public Integer getIdRecrutamento() {
		return idRecrutamento;
	}

	public void setIdRecrutamento(Integer idRecrutamento) {
		this.idRecrutamento = idRecrutamento;
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
