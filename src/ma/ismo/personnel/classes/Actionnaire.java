package ma.ismo.personnel.classes;

public class Actionnaire extends Particulier {
	
	private Entreprise entreprise;
	private int nb_actions_achetees;
	
	
	public Actionnaire(String cin, Entreprise e, int nb_actions_achetees) {
		super(cin);
		this.entreprise = e;
		this.nb_actions_achetees = nb_actions_achetees;
	} 
	
	public Actionnaire(String cin,String nom, Entreprise e, int nb_actions_achetees) {
		super(cin,nom);
		this.entreprise = e;
		this.nb_actions_achetees = nb_actions_achetees;
	} 
	
	public Actionnaire(String cin,String nom, String adresse, Entreprise e, int nb_actions_achetees) {
		super(cin,nom,adresse);
		this.entreprise = e;
		this.nb_actions_achetees = nb_actions_achetees;
	} 
	
	public Actionnaire(Particulier p, Entreprise e, int nb_actions_achetees) {
		super(p.getCin(),p.getNom(),p.getAdresse());
		this.entreprise = e;
		this.nb_actions_achetees = nb_actions_achetees;
	} 
	
	public double Total_Actions() {
		return entreprise.Prix_action() * this.nb_actions_achetees;
	}
	
	public double Pourcentage_Actions() {
		return this.nb_actions_achetees / entreprise.getNb_actions();
	}

	@Override
	public String toString() {
		return "Actionnaire [entreprise=" + entreprise + ", nb_actions_achetees=" + nb_actions_achetees + ", getNom()="
				+ getNom() + ", getAdresse()=" + getAdresse() + ", getCin()=" + getCin() + "]";
	}


	

}
