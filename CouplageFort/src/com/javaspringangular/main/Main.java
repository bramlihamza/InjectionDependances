package com.javaspringangular.main;



import com.javaspringangular.pojo.Chauffeur;
import com.javaspringangular.pojo.Voiture;

public class Main {

	public static void main(String[] args) {

		Voiture voiture = new Voiture(20);
		Chauffeur chauffeur = new Chauffeur();
		chauffeur.setVoiture(voiture);
		chauffeur.Conduire(10);
 }

}
