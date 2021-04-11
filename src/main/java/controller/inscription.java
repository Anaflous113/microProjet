package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.ClientsDao;
import model.dao.Iclients;
import model.entites.clients;

@WebServlet("/inscription")
public class inscription extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	Iclients dao;
	public void init() {
	 dao = new ClientsDao();	
		
	}
	
	 public static final String CHAMP_NOM = "nom";
	 public static final String CHAMP_PRE = "prenom";
	 public static final String CHAMP_ADRE = "adresse";
	 public static final String CHAMP_EMAIL = "email"; 
	 public static final String CHAMP_PASS = "motdepasse";
    public inscription() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("inscrire.jsp").forward( request, response );
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("Inscrire");
		if(action.equals("Inscrire")) {
			 String email = request.getParameter( CHAMP_EMAIL );
		        String motDePasse = request.getParameter(CHAMP_PASS);
		        String nom = request.getParameter( CHAMP_NOM );
		        String prenom = request.getParameter( CHAMP_PRE );
		        String adresse = request.getParameter( CHAMP_ADRE );
		        clients c = new clients(email, nom, prenom, adresse, 0, adresse, 0, motDePasse);
		        dao.ajouterClients(c);
			
		
	       
	        this.getServletContext().getRequestDispatcher("/acceil2.jsp").forward(request, response);
	       
		}    
		
	}

}
	
