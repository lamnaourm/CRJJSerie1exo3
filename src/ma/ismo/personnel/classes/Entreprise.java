package ma.ismo.personnel.classes;

public class Entreprise {

	private String raison;
	private double capital;
	private int nb_actions;

	public Entreprise(String raison) {
		super();
		this.raison = raison;
	}

	public Entreprise(String raison, double capital) {
		super();
		this.raison = raison;
		this.capital = capital;
	}

	public Entreprise(String raison, double capital, int nb_actions) {
		super();
		this.raison = raison;
		this.capital = capital;
		this.nb_actions = nb_actions;
	}

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getNb_actions() {
		return nb_actions;
	}

	public void setNb_actions(int nb_actions) {
		this.nb_actions = nb_actions;
	}
	
	public double Prix_action() {
		return this.capital/this.nb_actions;
	}

	@Override
	public String toString() {
		return "Entreprise [raison=" + raison + ", capital=" + capital + ", nb_actions=" + nb_actions + "]";
	}

}
