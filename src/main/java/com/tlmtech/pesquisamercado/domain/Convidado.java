package com.tlmtech.pesquisamercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	private Integer pontosLavaLoucas; 
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
	private Integer pontosMicroondas; 
	private Integer contMicroondas; 
	private Integer [] motocicleta =  {0, 1, 3,	3, 3};
	private Integer pontosMotocicleta; 
	private Integer contMotocicleta; 
	private Integer [] secadoraDeRoupas = {0, 2, 2, 2, 2}; 
	private Integer pontosSecadoraDeRoupas; 
	private Integer contSecadoraRoupas; 
	private Character aguaEncanada; 
	private Integer pontoAgua; 
	private Character ruaPavimentada; 
	private Integer rua;
	private Instrucao instrucao; 
	private Integer pontoInstrucao; 
	private String empresa; 
	private String profissaoChefe; 
	private Integer totalPontos; 
	private String criterio; 
	private Status status; 
	
	private List<Telefone> telefones = new ArrayList<>(); 
	
	private List<Endereco> enderecos = new ArrayList<>();
	
	private List<IdadeFilhos> idadeFilhos = new ArrayList<>(); 
	
	private List<CarroMarcaAnoModelo> carroMarcaAnoModelo = new ArrayList<>(); 
		
	private Recrutamento recrutamento; 
		
	public Convidado() { 
		
	}

	public Convidado(Long idConvidado, String nomeConvidado, String rg, Date dataNascimento, 
			String cpf, String email, 
			String nacionalidade, String tempoMoradia, Integer idade, EstadoCivil estadoCivil, 
			Character trabalha, 
			String profissao, Character estuda, String curso, String faculdade,
			Integer contBanheiro, Integer contMensalistas, Integer contAutomoveis,
			Integer contMicrocomputador, 
			Integer contLavaLoucas, Integer contGeladeira, Integer contFreezer,
			Integer contLavaRoupa, Integer contDvd,Integer contMicroondas, 
			Integer contMotocicleta, Integer contSecadoraRoupas, 
			Character aguaEncanada, Character ruaPavimentada, Instrucao instrucao, 
			String empresa, String profissaoChefe, Status status, Recrutamento recrutamento) {
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
		this.contBanheiro = contBanheiro;
		this.pontosBanheiro = calcularPontosBanheiro(contBanheiro);
		this.contMensalistas = contMensalistas;
		this.pontosMensalistas = calcularPontosMensalistas(contMensalistas);
		this.contAutomoveis = contAutomoveis;
		this.pontosAutomoveis = calcularPontosAutomoveis(contAutomoveis);
		this.contMicrocomputador = contMicrocomputador;
		this.pontosMicrocomputador = calcularPontosMicrocomputador(contMicrocomputador);
		this.contLavaLoucas = contLavaLoucas;
		this.pontosLavaLoucas = calcularPontosLavaLoucas(contLavaLoucas);
		this.contGeladeira = contGeladeira;
		this.pontosGeladeira = calcularPontosGeladeira(contGeladeira);
		this.contFreezer = contFreezer;
		this.pontosFreezer = calcularPontosFreezer(contFreezer);
		this.contLavaRoupa = contLavaRoupa;
		this.pontosLavaRoupa = calcularPontosLavaRoupa(contLavaRoupa);
		this.contDvd = contDvd;
		this.pontosDvd = calcularPontosDvd(contDvd);
		this.contMicroondas = contMicroondas;
		this.pontosMicroondas = calcularPontosMicroondas(contMicroondas);
		this.contMotocicleta = contMotocicleta;
		this.pontosMotocicleta = calcularPontosMotocicleta(contMotocicleta);
		this.contSecadoraRoupas = contSecadoraRoupas;
		this.pontosSecadoraDeRoupas = calcularPontosSecadoraRoupas(contSecadoraRoupas);
		this.aguaEncanada = aguaEncanada;
		this.pontoAgua = calcularPontoAgua(aguaEncanada);
		this.ruaPavimentada = ruaPavimentada;
		this.rua = calcularPontoRua(ruaPavimentada);
		this.instrucao = instrucao;
		this.pontoInstrucao = calcularPontoInstrucao(); 
		this.empresa = empresa;
		this.profissaoChefe = profissaoChefe;
		this.status = status;
		this.recrutamento = recrutamento;
		this.calcularPontosTotal(); 
		this.criterio();
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

	public Integer getPontosLavaLoucas() {
		return pontosLavaLoucas;
	}

	public void setPontosLavaLoucas(Integer pontosLavaLoucas) {
		this.pontosLavaLoucas = pontosLavaLoucas;
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

	public Integer getPontosMicroondas() {
		return pontosMicroondas;
	}

	public void setPontosMicroondas(Integer pontoMicroondas) {
		this.pontosMicroondas = pontoMicroondas;
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

	public Character getAguaEncanada() {
		return aguaEncanada;
	}

	public void setAguaEncanada(Character aguaEncanada) {
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
	
	public String getProfissaoChefe() {
		return profissaoChefe;
	}

	public void setProfissaoChefe(String profissaoChefe) {
		this.profissaoChefe = profissaoChefe;
	}

	public Integer getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(Integer totalPontos) {
		this.totalPontos = totalPontos;
	}
	
	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
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

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public List<CarroMarcaAnoModelo> getCarroMarcaAnoModelo() {
		return carroMarcaAnoModelo;
	}
	
	public List<IdadeFilhos> getIdadeFilhos() {
		return idadeFilhos;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	
	public Integer calcularPontosBanheiro(Integer contBanheiro) {
			this.setPontosBanheiro(banheiros[this.contBanheiro]); 
			return this.pontosBanheiro;
	}
	
	public Integer calcularPontosMensalistas(Integer contMensalistas) {
		this.setPontosMensalistas(mensalistas[this.contMensalistas]);
		return this.pontosMensalistas;
	}
	
	public Integer calcularPontosAutomoveis(Integer contAutomoveis) {
		this.setPontosAutomoveis(automoveis[this.contAutomoveis]);
		return getPontosAutomoveis();
	}
	
	public Integer calcularPontosMicrocomputador(Integer contMicrocomputador) { 
		this.setPontosMicrocomputador(microcomputador[this.contMicrocomputador]);
		return getPontosMicrocomputador(); 
	}
	
	public Integer calcularPontosLavaLoucas(Integer contLavaLoucas) { 
		this.setPontosLavaLoucas(lavaLoucas[this.contLavaLoucas]);
		return getPontosLavaLoucas(); 
	}
	
	public Integer calcularPontosGeladeira(Integer contGeladeira) { 
		this.setPontosGeladeira(geladeira[this.contGeladeira]);
		return getPontosGeladeira(); 
	}
	
	public Integer calcularPontosFreezer(Integer contFreezer) {
		this.setPontosFreezer(freezer[this.contFreezer]);
		return getPontosFreezer();
	}
	
	public Integer calcularPontosLavaRoupa(Integer contLavaRoupa) {
		this.setPontosLavaRoupa(lavaRoupa[this.contLavaRoupa]);
		return getPontosLavaRoupa(); 
	}
	
	public Integer calcularPontosDvd(Integer contDvd) {
		this.setPontosDvd(dvd[this.contDvd]);
		return getPontosDvd(); 
	}
	
	
	public Integer calcularPontosMicroondas(Integer contMicroondas) {
		this.setPontosMicroondas(microondas[this.contMicroondas]);
		return getPontosMicroondas();
	}
	
	public Integer calcularPontosMotocicleta(Integer contMotocicleta) { 
		this.setPontosMotocicleta(motocicleta[this.contMotocicleta]);
		return getPontosMotocicleta();
	}
	
	public Integer calcularPontosSecadoraRoupas(Integer contSecadoraRoupas) {
		this.setPontosSecadoraDeRoupas(secadoraDeRoupas[this.contSecadoraRoupas]);
		return getPontosSecadoraDeRoupas(); 
	}
	
	public int calcularPontoAgua(Character aguaEncanada) {
		this.setAguaEncanada(Character.toUpperCase(this.aguaEncanada));
		this.pontoAgua = 4; 
		if (this.getAguaEncanada() != 'S') {
			 this.pontoAgua = 0;
		}
		return this.pontoAgua;
	}
		
	public int calcularPontoRua(Character ruaPavimentada) { 
		this.setRuaPavimentada(Character.toUpperCase(this.ruaPavimentada));
		this.rua = 2;
		if(this.getRuaPavimentada() != 'S') {
			this.rua = 0;
		}
		return this.rua;
	}
	
	public int calcularPontoInstrucao() { 
		if(this.getInstrucao() == Instrucao.ANALFABETO_FUNDAMENTAL_I_INCOMPLETO) {
			return this.pontoInstrucao = 0;
		}
		else if(this.getInstrucao() == Instrucao.FUNDAMENTAL_I_COMPLETO_FUNDAMENTAL_II_COMPLETO) {
			return this.pontoInstrucao = 1; 
		}
		else if(this.getInstrucao() == Instrucao.FUNDAMENTAL_II_COMPLETO_MEDIO_INCOMPLETO) {
			return this.pontoInstrucao = 2; 
		}
		else if(this.getInstrucao() == Instrucao.MEDIO_COMPLETO_SUPERIOR_INCOMPLETO) {
			return this.pontoInstrucao = 4;
		}
		else if(this.getInstrucao() == Instrucao.SUPERIOR_COMPLETO) {
			return this.pontoInstrucao = 7;
		}
		return this.pontoInstrucao;
	}
	
	public int calcularPontosTotal() { 
		return this.totalPontos = this.pontosBanheiro + this.pontosMensalistas + this.pontosAutomoveis
				+ this.pontosMicrocomputador + this.pontosLavaLoucas + this.pontosGeladeira
				+ this.pontosGeladeira + this.pontosFreezer + this.pontosLavaRoupa + this.pontosDvd
				+ this.pontosMicroondas + this.pontosMotocicleta + this.pontosSecadoraDeRoupas
				+ this.pontoAgua + this.rua + this.pontoInstrucao;
	}
	
	public String criterio() { 
		if(this.getTotalPontos() <= 16) {
			this.criterio = "D/E"; 
		}
		else if(this.getTotalPontos() <= 22) {
			this.criterio = "C2"; 
		}
		else if(this.getTotalPontos() <= 28) {
			this.criterio = "C1"; 
		}
		else if(this.getTotalPontos() <= 37) {
			this.criterio = "B2"; 
		}
		else if(this.getTotalPontos() <= 44) {
			this.criterio = "B1";
		}
		else {
			this.criterio = "A"; 
		}
		return criterio; 
	}
}
