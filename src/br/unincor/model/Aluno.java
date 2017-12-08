package br.unincor.model;

import java.util.Date;

public class Aluno {
	private int matricula;
	private String nome;
	private Date dt_Nasc;
	private String cpf;
	private Double mensalidade;
	
	//construtor
	public Aluno(int matricula, String nome, Date dt_Nasc, String cpf, Double mensalidade) {
		super();
		if(matricula>=0){
			this.matricula = matricula;			
		}else{
			this.matricula=0;
		}
		this.nome = nome;
		this.dt_Nasc = dt_Nasc;
		if(cpf.length()==11){
			this.cpf = cpf;
		}else{
			this.cpf=null;
		}
		this.mensalidade = mensalidade;
	}

	//get-set
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if(matricula>=0){
			this.matricula = matricula;			
		}else{
			this.matricula=0;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Nasc() {
		return dt_Nasc;
	}

	public void setDt_Nasc(Date dt_Nasc) {
		this.dt_Nasc = dt_Nasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length()==11){
			this.cpf = cpf;
		}else{
			this.cpf=null;
		}
	}

	public Double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}

	//verdados
	public String verDados() {
		return "**** DADOS DO ALUNO *****" +
				"Aluno [matricula=" + matricula + ", nome=" + nome + ", dt_Nasc=" + dt_Nasc + ", cpf=" + cpf
				+ ", mensalidade=" + mensalidade + "]";
	}
	
	
	
}