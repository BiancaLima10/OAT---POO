package br.unincor.model;

public class Disciplinas {
	private int id;
	private String nome;
	
	//construtor
	public Disciplinas(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	//get-set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//ver dados
	public String verDados() {
		return "Disciplina [id=" + id + ", nome=" + nome + "]";
	}
}
