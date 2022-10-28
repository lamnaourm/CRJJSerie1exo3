package ma.ismo.personnel.classes;

public class Cadre extends Employe {

	char grade;
	private static final float SALAIRE = 60000;
	
	public Cadre(String cin, Entreprise entreprise, char grade) {
		super(cin, entreprise);
		this.grade = grade;
	}

	
	public Cadre(String cin, String nom, Entreprise entreprise, char grade) {
		super(cin, nom, entreprise);
		this.grade = grade;
	}

	

	public Cadre(String cin, String nom, String adresse, Entreprise entreprise, char grade) {
		super(cin, nom, adresse, entreprise);
		this.grade = grade;
	}

	public Cadre(Particulier p, Entreprise entreprise, char grade) {
		super(p, entreprise);
		this.grade = grade;
	}
	
	public Cadre(Employe e, char grade) {
		super(e.getCin(), e.getNom(), e.getAdresse(), e.getEntreprise());
		this.grade = grade;
	}


	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	public float getSalaire() {
		float salaire = SALAIRE; 
		
		for(int i=0;i<('E'-grade);i++)
			salaire += salaire/2;
		
		return salaire;
	}
	
}
