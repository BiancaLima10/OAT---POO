package br.unincor.control;

import java.util.ArrayList;
import java.util.List;
import br.unincor.DAO.AlunoDAO;
import br.unincor.DAO.DisciplinaDAO;
import br.unincor.DAO.NotasDAO;
import br.unincor.model.Aluno;
import br.unincor.model.Disciplinas;
import br.unincor.model.Notas;
import br.unincor.view.viewGUI;

public class Main {

	public static void main(String[] args) {
		AlunoDAO ad = new AlunoDAO();
		DisciplinaDAO dd = new DisciplinaDAO(0, null);
		NotasDAO nd = new NotasDAO(0, 0, 0);
		Operacoes op = new Operacoes();
		viewGUI gui = new viewGUI();
	
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
		List<Notas> notas = new ArrayList<Notas>();
		
		alunos = alunos.selectAllAlunos();
		disciplinas = disciplinas.selectAllDisciplinas();
		notas = notas.selectAllNotas();
		
		op.associarNotas(alunos, disciplinas, notas);
		
		try{
			while(true){
				int opcao = gui.exibeMenuPrincipal();
				String disciplina = "";
				
				if(opcao == -1){
					break;
				}
				
				switch(opcao){
					case 0:
						String nomeBoletim = gui.recebeTexto("Nome do aluno:");
						op.boletim(nomeBoletim, notas);
						break;
					case 1:
						disciplina = gui.recebeTexto("Nome da disciplina:");
						gui.exibeMsg(op.aproveitamentoDisciplina(disciplina, notas));
						break;
					case 2:
						disciplina = gui.recebeTexto("Nome da disciplina:");
						gui.exibeMsg(op.mediaDisciplina(disciplina, notas));
						break;
					case 3:
						gui.exibeMsg(op.calculoMensalidades(alunos));
						break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
