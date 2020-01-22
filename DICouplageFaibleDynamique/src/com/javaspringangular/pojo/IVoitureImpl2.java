package com.javaspringangular.pojo;

public class IVoitureImpl2 implements IVoiture {

	private String Model;
	private int vitesseActuelle;

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getVitesse() {
		return vitesseActuelle;
	}

	public int getVitesseActuelle() {
		return vitesseActuelle;
	}

	public void setVitesseActuelle(int vitesseActuelle) {
		this.vitesseActuelle = vitesseActuelle;
	}

	@Override
	public String toString() {
		return "IVoitureImpl [Model=" + Model + ", vitesse=" + vitesseActuelle + "]";
	}

	@Override
	public void Accelerer(int vitesseAcceleration) {
		this.vitesseActuelle = vitesseActuelle * vitesseAcceleration;
		System.out.println("voiture Avancée avec une vitesse de  " + this.vitesseActuelle);
	}

}
