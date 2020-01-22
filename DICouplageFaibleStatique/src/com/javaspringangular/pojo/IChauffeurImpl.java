package com.javaspringangular.pojo;

public class IChauffeurImpl implements IChauffeur {

	private String name;
	private IVoiture voiture;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* on n'aps besoin de getter */
//	public IVoitureImpl getVoiture() {
//		return iVoitureImpl;
//	}

	public void setVoiture(IVoiture IVoiture) {
		this.voiture = IVoiture;
	}

	@Override
	public void Conduire(int vitesseAcceleration) {
		System.out.println("Demarrage avec une vitesse de " + vitesseAcceleration);
		voiture.Accelerer(vitesseAcceleration);

	}

	@Override
	public String toString() {
		return "IChauffeurImpl [name=" + name + ", iVoitureImpl=" + voiture + "]";
	}

}
