package ma.ismo.personnel.classes;

import java.time.LocalDate;
import java.time.Period;

public class Ouvrier extends Employe{
	
	private LocalDate date_affectation; 
	private float smig;
	
	public Ouvrier(String cin, Entreprise entreprise, float smig) {
		super(cin, entreprise);
		this.smig = smig;
	}

	
	public Ouvrier(String cin, String nom, Entreprise entreprise, float smig) {
		super(cin, nom, entreprise);
		this.smig = smig;
	}

	public Ouvrier(String cin, String nom, String adresse, Entreprise entreprise, float smig) {
		super(cin, nom, adresse, entreprise);
		this.smig = smig;
	}

	public Ouvrier(Particulier p, Entreprise entreprise, float smig) {
		super(p, entreprise);
		this.smig = smig;
	}
	
	public Ouvrier(Employe e, char grade) {
		super(e.getCin(), e.getNom(), e.getAdresse(), e.getEntreprise());
		this.smig = smig;
	}


	public float getSmig() {
		return smig;
	}


	public void setSmig(float smig) {
		this.smig = smig;
	}


	public LocalDate getDate_affectation() {
		return date_affectation;
	}
	
	
	public float getSalaire() {
		float salaire;
		
		Period p = Period.between(LocalDate.now(), date_affectation);
		int nb_annee =p.getYears();
		
		salaire = smig * nb_annee * 150;
		
		return salaire;
	}


	@Override
	public String toString() {
		return "Ouvrier [date_affectation=" + date_affectation + ", smig=" + smig + ", getEntreprise()="
				+ getEntreprise() + ", getMatricule()=" + getMatricule() + ", getNom()=" + getNom() + ", getAdresse()="
				+ getAdresse() + ", getCin()=" + getCin() + "]";
	}

	
}
