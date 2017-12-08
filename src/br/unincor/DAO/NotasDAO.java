package br.unincor.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unincor.connection.DBConnection;


public class NotasDAO {
	private NotasDAO notas;
	private DBConnection dbConnection;
	
	public NotasDAO(int mat_aluno, int id_disciplina, double nota) {
		notas = null;
		dbConnection = new DBConnection();
	}
	
	public List<NotasDAO> selectAllNotas(){
		List<NotasDAO> notas = new ArrayList<NotasDAO>();
		String sql = "SELECT * FROM notas";
		
		/*public void get Primeira Nota(){
		String sql = "Select aluno From Nota where id = 1";
		dbConnection.openDBConncection ();
		ResultSet rs = super.select(sql, dbConnection.CON);
		
		*/
		try {
			dbConnection.openDBConnection();
			PreparedStatement pStatement = dbConnection.CON.prepareStatement(sql);
			ResultSet rs = pStatement.executeQuery();
			
			while(rs.next()) {
				NotasDAO nota1 = new NotasDAO(
					rs.getInt("mat_aluno"),
					rs.getInt("id_disc"),
					rs.getDouble("nota")
				);
				
				notas.add(nota1);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}	
		
		return notas;
	}
}

