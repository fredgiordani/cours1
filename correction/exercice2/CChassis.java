package com.formation.exercice2;

public class CChassis {

	private double m_fPoidsChassis;



	public CChassis() {
		this(120);
	}


	public CChassis(double m_fPoidsChassis) {
		this.m_fPoidsChassis = m_fPoidsChassis;
	}

	public void affiche(){
	    System.out.println();
	    System.out.println(	"Infos Carrosserie");
	    System.out.println(	"Poids: " + m_fPoidsChassis);
	}

	public double getPoids(){
		return m_fPoidsChassis;
	}

}
