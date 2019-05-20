package com.formation.exercice2;

public class CMoteur {

	private int m_nPuissanceMoteur ;
	private double m_fPoidsMoteur;

	public CMoteur() {
		this(55,100);
	}

	public CMoteur(int m_nPuissanceMoteur, double m_fPoidsMoteur) {
		super();
		this.m_nPuissanceMoteur = m_nPuissanceMoteur;
		this.m_fPoidsMoteur = m_fPoidsMoteur;
	}

	public void affiche(){
	    System.out.println();
	    System.out.println(	"Infos Moteur");
	    System.out.println(	"Poids: " + m_fPoidsMoteur);
	    System.out.println(	"Puissance: " + m_nPuissanceMoteur + " ch");
	}

	public int getPuissance(){
		return m_nPuissanceMoteur;
	}

	public double getPoids(){
		return m_fPoidsMoteur;
	}

}
