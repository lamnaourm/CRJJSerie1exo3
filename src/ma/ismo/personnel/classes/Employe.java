package ma.ismo.personnel.classes;

public class Employe extends Particulier {
	
	private static int cp=0;
	private static char code ='A';
	private String matricule;
	private Entreprise entreprise;
	
	
	public Employe(String cin, Entreprise entreprise) {
		super(cin);
		++cp;
		if(cp>9999) {
			code = (char) (code + 1);
			cp = 1;
		}
		matricule = String.format("%c%04d",code, cp);
		this.entreprise = entreprise;
	}

	public Employe(String cin, String nom, Entreprise entreprise) {
		super(cin, nom);
		++cp;
		if(cp>9999) {
			code = (char) (code + 1);
			cp = 1;
		}
		matricule = String.format("%c%04d",code, cp);
		this.entreprise = entreprise;
	}
	
	public Employe(String cin, String nom, String adresse, Entreprise entreprise) {
		super(cin, nom, adresse);
		++cp;
		if(cp>9999) {
			code = (char) (code + 1);
			cp = 1;
		}
		matricule = String.format("%c%04d",code, cp);
		this.entreprise = entreprise;
	}
	
	public Employe(Particulier p, Entreprise entreprise) {
		super(p.getCin(), p.getNom(), p.getAdresse());
		++cp;
		if(cp>9999) {
			code = (char) (code + 1);
			cp = 1;
		}
		matricule = String.format("%c%04d",code, cp);
		this.entreprise = entreprise;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public String getMatricule() {
		return matricule;
	}

	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", entreprise=" + entreprise + ", getNom()=" + getNom()
				+ ", getAdresse()=" + getAdresse() + ", getCin()=" + getCin() + "]";
	}
	
	

}
