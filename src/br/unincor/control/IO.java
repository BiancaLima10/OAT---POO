package br.unincor.control;

import br.unincor.view.viewGUI;
//escrita
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IO {
	viewGUI gui = new viewGUI();
	
	public void escreverArquivo(String texto, String arquivo) throws FileNotFoundException{		
		try{
			PrintWriter pw = new PrintWriter(new File(arquivo));
        	StringBuilder sb = new StringBuilder();
        
        	sb.append(texto);

        	pw.write(sb.toString());
        	pw.close();
		}
		catch (Exception e) {
			gui.exibeMsgErro("Erro ao escrever o arquivo " + arquivo);
		}
	}
}
