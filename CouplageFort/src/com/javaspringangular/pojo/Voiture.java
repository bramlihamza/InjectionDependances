package com.javaspringangular.pojo;

/**
 * @author hamza
 *
 */
public class Voiture {

	private int vitesseActuelle;

	public Voiture(int vitesseActuelle) {

		this.vitesseActuelle = vitesseActuelle;
	}

	public int getVitesse() {
		return vitesseActuelle;
	}

	public void setVitesse(int vitesseInitial) {
		this.vitesseActuelle = vitesseInitial;
	}

	public void Accelerer(int vitesseAcceleration) {

		this.vitesseActuelle = vitesseActuelle + vitesseAcceleration;
		System.out.println("voiture Accéléré avec une vitesse de  " + this.vitesseActuelle);
	}

	@Override
	public String toString() {
		return "Voiture [vitesseActuelle=" + vitesseActuelle + "]";
	}

}
