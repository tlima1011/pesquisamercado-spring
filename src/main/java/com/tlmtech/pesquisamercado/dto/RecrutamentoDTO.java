package com.tlmtech.pesquisamercado.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.tlmtech.pesquisamercado.domain.Recrutamento;

public class RecrutamentoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id; 
	private String numProjeto; 
	private String descProjeto; 
	private Date dataRecrutamento; 
	private Double valorPagar; 
	private Double beneficio;
	
	public RecrutamentoDTO() {
		
	}

	public RecrutamentoDTO(Recrutamento obj) {
		//this.id = obj.getId();
		this.numProjeto = obj.getNumProjeto(); 
		this.descProjeto = obj.getDescProjeto(); 
		this.dataRecrutamento = obj.getDataRecrutamento(); 
		this.valorPagar = obj.getValorPagar(); 
		this.beneficio = obj.getBeneficio(); 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
