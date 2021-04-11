package model.entites;

public class clients {
	String Email;
	String nom;
	int telephone;
	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	String prenom;
	String adresse;
	int codePostale;
	String ville;
	int tel;
	String motPasse;

	public clients() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public clients(String email, String nom, String prenom, String adresse, int codePostale, String ville, int tel,
			String motPasse) {
		super();
		Email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.ville = ville;
		this.tel = tel;
		this.motPasse = motPasse;
	}
	

}
