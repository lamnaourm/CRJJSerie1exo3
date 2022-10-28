package ma.ismo.personnel.classes;

public class Particulier {

	private String cin;
	private String nom;
	private String adresse;
	
	public Particulier(String cin) {
		super();
		this.cin = cin;
	}
	public Particulier(String cin, String nom) {
		super();
		this.cin = cin;
		this.nom = nom;
	}
	public Particulier(String cin, String nom, String adresse) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.adresse = adresse;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCin() {
		return cin;
	}
	
	@Override
	public String toString() {
		return "Particulier [cin=" + cin + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
}
