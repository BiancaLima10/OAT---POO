package br.unincor.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class viewGUI {
	
	public void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public void exibeMsgErro(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Erro!", JOptionPane.ERROR_MESSAGE);
	}
	
	public void exibeMsgDebug(String msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(new Date()) + " [DEBUG] - " + msg);
	}
	
	public Integer exibeMenuPrincipal() {
		Object[] opcoes = {"BOLETIM", "APROV. DISCIPLINA", "MÉDIA DISCIPLINA", "MENSALIDADE"};
		Integer op = JOptionPane.showOptionDialog(null,
					"Escolha uma opção?",
					"Menu Principal",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					null,
					opcoes,
					-1);

		return op;
	}

	public String recebeTexto(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
	public Integer importarBoletim() {
				Object[] opcoes = {"SIM", "NÃO"};
				
				return JOptionPane.showOptionDialog(null, 
						"Importar Boletim", "Menu Principal",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE,
						null,
						opcoes,
						0);
	}
	public Double recebeDouble(String texto) {
			return Double.parseDouble(JOptionPane.showInputDialog(texto));
	}
		
	public Float recebeFloat(String texto) {
			return Float.parseFloat(JOptionPane.showInputDialog(texto));
	}
		
	public Boolean recebeBoolean(String texto) {
			return Boolean.parseBoolean(JOptionPane.showInputDialog(texto));
	}
}
	
	


