package com.formation.exercice2;

import com.formation.exercice2.CVoiture;

public class CMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CVoiture voiture=null;

		if (args.length == 2) {
			voiture=new CVoiture(args[0], Integer.parseInt(args[1]));
		} else {
			voiture=new CVoiture();
		}

		voiture.afficher();

	}

}
