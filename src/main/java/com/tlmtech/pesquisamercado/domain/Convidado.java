package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tlmtech.pesquisamercado.enums.EstadoCivil;
import com.tlmtech.pesquisamercado.enums.Instrucao;
import com.tlmtech.pesquisamercado.enums.Status;

public class Convidado implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private Long idConvidado;
	private String nomeConvidado; 
	private String rg; 
	private Date dataNascimento; 
	private String cpf; 
	private String email; 
	private String nacionalidade; 
	private String tempoMoradia; 
	private Integer idade; 
	private EstadoCivil estadoCivil; 
	private Character trabalha;
	private String profissao; 
	private Character estuda; 
	private String curso; 
	private String faculdade; 
	private Integer [] banheiros = {0,3,7,10,14};
	private Integer pontosBanheiro; 
	private Integer contBanheiro; 
	private Integer [] mensalistas = {0,3,7,10,13};
	private Integer pontosMensalistas;
	private Integer contMensalistas;
	private Integer [] automoveis = {0,3,5,8,11};
	private Integer pontosAutomoveis; 
	private Integer contAutomoveis; 
	private Integer [] microcomputador = {0, 3, 6, 8, 11};	
	private Integer pontosMicrocomputador; 
	private Integer contMicrocomputador; 
	private Integer [] lavaLoucas = {0,	3, 6, 6, 6}; 
	private Integer pontosLavaloucas; 
	private Integer contLavaLoucas; 
	private Integer [] geladeira = {0,	2, 3, 5, 5}; 	
	private Integer pontosGeladeira;
	private Integer contGeladeira; 
	private Integer [] freezer = {0, 2, 4, 6, 6}; 
	private Integer pontosFreezer;
	private Integer contFreezer; 
	private Integer [] lavaRoupa = {0, 2, 4, 6, 6};
	private Integer pontosLavaRoupa;
	private Integer contLavaRoupa;
	private Integer [] dvd = {0, 1,	3, 4, 6};
	private Integer pontosDvd; 
	private Integer contDvd; 
	private Integer [] microondas = {0,	2,	4,	4,	4}; 
	private Integer pontoMicroondas; 
	private Integer contMicroondas; 
	private Integer [] motocicleta =  {0, 1, 3,	3, 3};
	private Integer pontosMotocicleta; 
	private Integer contMotocicleta; 
	private Integer [] secadoraDeRoupas = {0,	2,	2,	2,	2}; 
	private Integer pontosSecadoraDeRoupas; 
	private Integer contSecadoraRoupas; 
	private Integer aguaEncanada; 
	private Integer pontoAgua; 
	private Character ruaPavimentada; 
	private Integer rua;
	private Instrucao instrucao; 
	private Integer pontoInstrucao; 
	private String empresa; 
	private Integer totalPontos; 
	private Status status; 
	
	private List<Telefone> telefones = new ArrayList<>(); 
	
	private List<Endereco> enderecos = new ArrayList<>();
	
	private List<IdadeFilhos> idadeFilhos = new ArrayList<>(); 
	
	private List<CarroMarcaAnoModelo> carroMarcaAnoModelo = new ArrayList<>(); 
		
	private Recrutamento recrutamento; 
	
	private CriterioBrasil criterioBrasil; 
	
	public Convidado() { 
		
	}

	public Convidado(Long idConvidado, String nomeConvidado, String rg, Date dataNascimento, String cpf, String email,
			String nacionalidade, String tempoMoradia, Integer idade, EstadoCivil estadoCivil, Character trabalha,
			String profissao, Character estuda, String curso, String faculdade, Integer[] banheiros,
			Integer pontosBanheiro, Integer contBanheiro, Integer[] mensalistas, Integer pontosMensalistas,
			Integer contMensalistas, Integer[] automoveis, Integer pontosAutomoveis, Integer contAutomoveis,
			Integer[] microcomputador, Integer pontosMicrocomputador, Integer contMicrocomputador, Integer[] lavaLoucas,
			Integer pontosLavaloucas, Integer contLavaLoucas, Integer[] geladeira, Integer pontosGeladeira,
			Integer contGeladeira, Integer[] freezer, Integer pontosFreezer, Integer contFreezer, Integer[] lavaRoupa,
			Integer pontosLavaRoupa, Integer contLavaRoupa, Integer[] dvd, Integer pontosDvd, Integer contDvd,
			Integer[] microondas, Integer pontoMicroondas, Integer contMicroondas, Integer[] motocicleta,
			Integer pontosMotocicleta, Integer contMotocicleta, Integer[] secadoraDeRoupas,
			Integer pontosSecadoraDeRoupas, Integer contSecadoraRoupas, Integer aguaEncanada, Integer pontoAgua,
			Character ruaPavimentada, Integer rua, Instrucao instrucao, Integer pontoInstrucao, String empresa,
			Integer totalPontos, Status status, Recrutamento recrutamento, CriterioBrasil criterioBrasil) {
		super();
		this.idConvidado = idConvidado;
		this.nomeConvidado = nomeConvidado;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.tempoMoradia = tempoMoradia;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.trabalha = trabalha;
		this.profissao = profissao;
		this.estuda = estuda;
		this.curso = curso;
		this.faculdade = faculdade;
		this.banheiros = banheiros;
		this.pontosBanheiro = pontosBanheiro;
		this.contBanheiro = contBanheiro;
		this.mensalistas = mensalistas;
		this.pontosMensalistas = pontosMensalistas;
		this.contMensalistas = contMensalistas;
		this.automoveis = automoveis;
		this.pontosAutomoveis = pontosAutomoveis;
		this.contAutomoveis = contAutomoveis;
		this.microcomputador = microcomputador;
		this.pontosMicrocomputador = pontosMicrocomputador;
		this.contMicrocomputador = contMicrocomputador;
		this.lavaLoucas = lavaLoucas;
		this.pontosLavaloucas = pontosLavaloucas;
		this.contLavaLoucas = contLavaLoucas;
		this.geladeira = geladeira;
		this.pontosGeladeira = pontosGeladeira;
		this.contGeladeira = contGeladeira;
		this.freezer = freezer;
		this.pontosFreezer = pontosFreezer;
		this.contFreezer = contFreezer;
		this.lavaRoupa = lavaRoupa;
		this.pontosLavaRoupa = pontosLavaRoupa;
		this.contLavaRoupa = contLavaRoupa;
		this.dvd = dvd;
		this.pontosDvd = pontosDvd;
		this.contDvd = contDvd;
		this.microondas = microondas;
		this.pontoMicroondas = pontoMicroondas;
		this.contMicroondas = contMicroondas;
		this.motocicleta = motocicleta;
		this.pontosMotocicleta = pontosMotocicleta;
		this.contMotocicleta = contMotocicleta;
		this.secadoraDeRoupas = secadoraDeRoupas;
		this.pontosSecadoraDeRoupas = pontosSecadoraDeRoupas;
		this.contSecadoraRoupas = contSecadoraRoupas;
		this.aguaEncanada = aguaEncanada;
		this.pontoAgua = pontoAgua;
		this.ruaPavimentada = ruaPavimentada;
		this.rua = rua;
		this.instrucao = instrucao;
		this.pontoInstrucao = pontoInstrucao;
		this.empresa = empresa;
		this.totalPontos = totalPontos;
		this.status = status;
		this.recrutamento = recrutamento;
		this.criterioBrasil = criterioBrasil;
	}

	public Long getIdConvidado() {
		return idConvidado;
	}

	public void setIdConvidado(Long idConvidado) {
		this.idConvidado = idConvidado;
	}

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTempoMoradia() {
		return tempoMoradia;
	}

	public void setTempoMoradia(String tempoMoradia) {
		this.tempoMoradia = tempoMoradia;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Character getTrabalha() {
		return trabalha;
	}

	public void setTrabalha(Character trabalha) {
		this.trabalha = trabalha;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Character getEstuda() {
		return estuda;
	}

	public void setEstuda(Character estuda) {
		this.estuda = estuda;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public Integer[] getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(Integer[] banheiros) {
		this.banheiros = banheiros;
	}

	public Integer getPontosBanheiro() {
		return pontosBanheiro;
	}

	public void setPontosBanheiro(Integer pontosBanheiro) {
		this.pontosBanheiro = pontosBanheiro;
	}

	public Integer getContBanheiro() {
		return contBanheiro;
	}

	public void setContBanheiro(Integer contBanheiro) {
		this.contBanheiro = contBanheiro;
	}

	public Integer[] getMensalistas() {
		return mensalistas;
	}

	public void setMensalistas(Integer[] mensalistas) {
		this.mensalistas = mensalistas;
	}

	public Integer getPontosMensalistas() {
		return pontosMensalistas;
	}

	public void setPontosMensalistas(Integer pontosMensalistas) {
		this.pontosMensalistas = pontosMensalistas;
	}

	public Integer getContMensalistas() {
		return contMensalistas;
	}

	public void setContMensalistas(Integer contMensalistas) {
		this.contMensalistas = contMensalistas;
	}

	public Integer[] getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(Integer[] automoveis) {
		this.automoveis = automoveis;
	}

	public Integer getPontosAutomoveis() {
		return pontosAutomoveis;
	}

	public void setPontosAutomoveis(Integer pontosAutomoveis) {
		this.pontosAutomoveis = pontosAutomoveis;
	}

	public Integer getContAutomoveis() {
		return contAutomoveis;
	}

	public void setContAutomoveis(Integer contAutomoveis) {
		this.contAutomoveis = contAutomoveis;
	}

	public Integer[] getMicrocomputador() {
		return microcomputador;
	}

	public void setMicrocomputador(Integer[] microcomputador) {
		this.microcomputador = microcomputador;
	}

	public Integer getPontosMicrocomputador() {
		return pontosMicrocomputador;
	}

	public void setPontosMicrocomputador(Integer pontosMicrocomputador) {
		this.pontosMicrocomputador = pontosMicrocomputador;
	}

	public Integer getContMicrocomputador() {
		return contMicrocomputador;
	}

	public void setContMicrocomputador(Integer contMicrocomputador) {
		this.contMicrocomputador = contMicrocomputador;
	}

	public Integer[] getLavaLoucas() {
		return lavaLoucas;
	}

	public void setLavaLoucas(Integer[] lavaLoucas) {
		this.lavaLoucas = lavaLoucas;
	}

	public Integer getPontosLavaloucas() {
		return pontosLavaloucas;
	}

	public void setPontosLavaloucas(Integer pontosLavaloucas) {
		this.pontosLavaloucas = pontosLavaloucas;
	}

	public Integer getContLavaLoucas() {
		return contLavaLoucas;
	}

	public void setContLavaLoucas(Integer contLavaLoucas) {
		this.contLavaLoucas = contLavaLoucas;
	}

	public Integer[] getGeladeira() {
		return geladeira;
	}

	public void setGeladeira(Integer[] geladeira) {
		this.geladeira = geladeira;
	}

	public Integer getPontosGeladeira() {
		return pontosGeladeira;
	}

	public void setPontosGeladeira(Integer pontosGeladeira) {
		this.pontosGeladeira = pontosGeladeira;
	}

	public Integer getContGeladeira() {
		return contGeladeira;
	}

	public void setContGeladeira(Integer contGeladeira) {
		this.contGeladeira = contGeladeira;
	}

	public Integer[] getFreezer() {
		return freezer;
	}

	public void setFreezer(Integer[] freezer) {
		this.freezer = freezer;
	}

	public Integer getPontosFreezer() {
		return pontosFreezer;
	}

	public void setPontosFreezer(Integer pontosFreezer) {
		this.pontosFreezer = pontosFreezer;
	}

	public Integer getContFreezer() {
		return contFreezer;
	}

	public void setContFreezer(Integer contFreezer) {
		this.contFreezer = contFreezer;
	}

	public Integer[] getLavaRoupa() {
		return lavaRoupa;
	}

	public void setLavaRoupa(Integer[] lavaRoupa) {
		this.lavaRoupa = lavaRoupa;
	}

	public Integer getPontosLavaRoupa() {
		return pontosLavaRoupa;
	}

	public void setPontosLavaRoupa(Integer pontosLavaRoupa) {
		this.pontosLavaRoupa = pontosLavaRoupa;
	}

	public Integer getContLavaRoupa() {
		return contLavaRoupa;
	}

	public void setContLavaRoupa(Integer contLavaRoupa) {
		this.contLavaRoupa = contLavaRoupa;
	}

	public Integer[] getDvd() {
		return dvd;
	}

	public void setDvd(Integer[] dvd) {
		this.dvd = dvd;
	}

	public Integer getPontosDvd() {
		return pontosDvd;
	}

	public void setPontosDvd(Integer pontosDvd) {
		this.pontosDvd = pontosDvd;
	}

	public Integer getContDvd() {
		return contDvd;
	}

	public void setContDvd(Integer contDvd) {
		this.contDvd = contDvd;
	}

	public Integer[] getMicroondas() {
		return microondas;
	}

	public void setMicroondas(Integer[] microondas) {
		this.microondas = microondas;
	}

	public Integer getPontoMicroondas() {
		return pontoMicroondas;
	}

	public void setPontoMicroondas(Integer pontoMicroondas) {
		this.pontoMicroondas = pontoMicroondas;
	}

	public Integer getContMicroondas() {
		return contMicroondas;
	}

	public void setContMicroondas(Integer contMicroondas) {
		this.contMicroondas = contMicroondas;
	}

	public Integer[] getMotocicleta() {
		return motocicleta;
	}

	public void setMotocicleta(Integer[] motocicleta) {
		this.motocicleta = motocicleta;
	}

	public Integer getPontosMotocicleta() {
		return pontosMotocicleta;
	}

	public void setPontosMotocicleta(Integer pontosMotocicleta) {
		this.pontosMotocicleta = pontosMotocicleta;
	}

	public Integer getContMotocicleta() {
		return contMotocicleta;
	}

	public void setContMotocicleta(Integer contMotocicleta) {
		this.contMotocicleta = contMotocicleta;
	}

	public Integer[] getSecadoraDeRoupas() {
		return secadoraDeRoupas;
	}

	public void setSecadoraDeRoupas(Integer[] secadoraDeRoupas) {
		this.secadoraDeRoupas = secadoraDeRoupas;
	}

	public Integer getPontosSecadoraDeRoupas() {
		return pontosSecadoraDeRoupas;
	}

	public void setPontosSecadoraDeRoupas(Integer pontosSecadoraDeRoupas) {
		this.pontosSecadoraDeRoupas = pontosSecadoraDeRoupas;
	}

	public Integer getContSecadoraRoupas() {
		return contSecadoraRoupas;
	}

	public void setContSecadoraRoupas(Integer contSecadoraRoupas) {
		this.contSecadoraRoupas = contSecadoraRoupas;
	}

	public Integer getAguaEncanada() {
		return aguaEncanada;
	}

	public void setAguaEncanada(Integer aguaEncanada) {
		this.aguaEncanada = aguaEncanada;
	}

	public Integer getPontoAgua() {
		return pontoAgua;
	}

	public void setPontoAgua(Integer pontoAgua) {
		this.pontoAgua = pontoAgua;
	}

	public Character getRuaPavimentada() {
		return ruaPavimentada;
	}

	public void setRuaPavimentada(Character ruaPavimentada) {
		this.ruaPavimentada = ruaPavimentada;
	}

	public Integer getRua() {
		return rua;
	}

	public void setRua(Integer rua) {
		this.rua = rua;
	}

	public Instrucao getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(Instrucao instrucao) {
		this.instrucao = instrucao;
	}

	public Integer getPontoInstrucao() {
		return pontoInstrucao;
	}

	public void setPontoInstrucao(Integer pontoInstrucao) {
		this.pontoInstrucao = pontoInstrucao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Integer getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(Integer totalPontos) {
		this.totalPontos = totalPontos;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Recrutamento getRecrutamento() {
		return recrutamento;
	}

	public void setRecrutamento(Recrutamento recrutamento) {
		this.recrutamento = recrutamento;
	}

	public CriterioBrasil getCriterioBrasil() {
		return criterioBrasil;
	}

	public void setCriterioBrasil(CriterioBrasil criterioBrasil) {
		this.criterioBrasil = criterioBrasil;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public List<CarroMarcaAnoModelo> getCarroMarcaAnoModelo() {
		return carroMarcaAnoModelo;
	}
	
	public Integer calcularPontosBanheiro(Integer contBanheiro) {
			this.setPontosBanheiro(banheiros[contBanheiro]); 
			return this.pontosBanheiro;
	}
	
	public Integer calcularPontosMensalistas(Integer contMensalistas) {
		this.setPontosMensalistas(mensalistas[contMensalistas]);
		return this.pontosMensalistas;
	}
	
	
	
	
	
}
