package br.unincor.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unincor.connection.DBConnection;


public class AlunoDAO {
	 private AlunoDAO alunos;
	 private DBConnection dbConncection;
	 
	 public AlunoDAO(){
		 alunos = null;
		 dbConncection = new DBConnection();
		 
	 }
	 public List<AlunoDAO> selectAllAluno(){
		 List<AlunoDAO> alunos = new ArrayList<AlunoDAO>();
		 String sql = "SELECT * FROM aluno";
		 
		try{
			dbConncection.openDBConnection();
			PreparedStatement pStatement = dbConncection.CON.prepareStatement(sql);
			ResultSet rs = pStatement.executeQuery();
			
			while(rs.next()){
				AlunoDAO aluno1 = new AlunoDAO(
					);
					
					alunos.add(aluno1);
				}		
				
				dbConncection.closeDBConnection();
			}catch(SQLException e){
				e.printStackTrace();
			}	
			
			return alunos;
		}
	}
