package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.entites.clients;

public class ClientsDao implements Iclients {

	public ClientsDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<clients> getClientsParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterClients(clients c) {
		Connection cn = singlConnection.getConnection();
		PreparedStatement ps ;
		try {
			ps = cn.prepareStatement("INSERT INTO Clients(nom,prenom,telephone,code_postale,ville,adresse,email,motPasse) VALUES (?,?,?,?,?,?,?,?");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setInt(3, c.getTelephone());
			ps.setInt(4, c.getCodePostale());
			ps.setString(5, c.getVille());
			ps.setString(6, c.getAdresse());
			ps.setString(7, c.getEmail());
			ps.setString(8, c.getMotPasse());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<clients> getAllClients() {
	 Connection cn = singlConnection.getConnection();
		return null;
	}

}
