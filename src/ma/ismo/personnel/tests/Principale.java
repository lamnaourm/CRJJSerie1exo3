package ma.ismo.personnel.tests;

import ma.ismo.personnel.classes.Actionnaire;
import ma.ismo.personnel.classes.Cadre;
import ma.ismo.personnel.classes.Employe;
import ma.ismo.personnel.classes.Entreprise;
import ma.ismo.personnel.classes.Particulier;

public class Principale {
	
	public static void main(String[] args) {
		
		Particulier p1 = new Particulier("A12222","Nom 1", "adresse 1");
		Particulier p2 = new Particulier("B67676","Nom 2", "adresse 2");
		
		
		Entreprise e1 = new Entreprise("CGI",134343, 455);
		Entreprise e2 = new Entreprise("ATOS",676767, 378);
		
		Actionnaire ac1 = new Actionnaire("C1222","Nom 3", "Adresse3", e1, 100);
		Actionnaire ac2 = new Actionnaire(p1, e1, 100);
		
		Employe emp1 = new Employe(p1, e1);
		Employe emp2 = new Employe(p2, e2);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		Cadre c1 = new Cadre(emp1, 'C');
		
		System.out.println("Salaire : " + c1.getSalaire());
	}

}
