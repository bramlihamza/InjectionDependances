package com.javaspringangular.pojo;

public class Chauffeur {

	private String name;
	private Voiture voiture;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public void Conduire(int vitesseAcceleration) {
		System.out.println("Demarrage avec une vitesse de " + vitesseAcceleration);
		voiture.Accelerer(vitesseAcceleration);
	}

	@Override
	public String toString() {
		return "Chauffeur [name=" + name + ", voiture=" + voiture + "]";
	}

}
