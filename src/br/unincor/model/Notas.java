package br.unincor.model;

public class Notas {
	private Aluno aluno;
	private Disciplinas disciplina;
	private int mat_aluno;
	private int id_disc;
	private double nota;
	
	//construtor
	public Notas(int mat_aluno, int id_disc, double nota) {
		super();
		this.mat_aluno = mat_aluno;
		this.id_disc = id_disc;
		this.nota = nota;
		this.aluno = null;
		this.disciplina = null;
	
	}
	
	
	//get-set

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplinas getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}

	public int getMat_aluno() {
		return mat_aluno;
	}

	public void setMat_aluno(int mat_aluno) {
		this.mat_aluno = mat_aluno;
	}

	public int getId_disc() {
		return id_disc;
	}

	public void setId_disc(int id_disc) {
		this.id_disc = id_disc;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}


	//verdados
	public String verDados() {
		return "Notas [aluno=" + aluno + ", disciplina=" + disciplina + ", mat_aluno=" + mat_aluno + ", id_disc="
				+ id_disc + ", nota=" + nota + "]";
	}
	
}
