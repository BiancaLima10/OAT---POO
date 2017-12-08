package br.unincor.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unincor.connection.DBConnection;


public class DisciplinaDAO {
	private DisciplinaDAO disc;
	private  DBConnection dbConnection;
	
	public DisciplinaDAO(int id, String nome) {
		disc = null;
		dbConnection = new DBConnection();
	}
	
	public List<DisciplinaDAO> selectAllDisciplina(){
		List<DisciplinaDAO> disciplinas = new ArrayList<DisciplinaDAO>();
		String sql = "SELECT * FROM disciplinas";
		
		try {
			dbConnection.openDBConnection();
			PreparedStatement pStatement = dbConnection.CON.prepareStatement(sql);
			ResultSet rs = pStatement.executeQuery();
			
			while(rs.next()) {
				DisciplinaDAO disc = new DisciplinaDAO(
					rs.getInt("id"),
					rs.getString("nome")
				);
				
				((List<DisciplinaDAO>) disc).add(disc);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}	
		
		return disciplinas;
	}
}