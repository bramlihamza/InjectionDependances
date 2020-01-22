package com.javaspringangular.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import com.javaspringangular.pojo.IChauffeurImpl;
import com.javaspringangular.pojo.IVoiture;
import com.javaspringangular.pojo.IVoitureImpl;
import com.javaspringangular.pojo.IVoitureImpl2;

public class Main {
	/* couplage faible et injection avec instatiation simple */
	public static void main(String[] args)
			throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		/* Lire classesNames depuis fichier de configuration */
		Scanner fileReader = new Scanner(new File(Paths.get(args[0]).toString()));

		String voitureClasse = fileReader.next();
		String ChauffeurClass = fileReader.next();

		/* Instanciation Dynamique des classe (REFLEXION) */
		/*
		 * vous pouvez changer IVoitureImpl2 par IVoitureImpl2 dans le fichier
		 * config.txt pour tester l'injection
		 */
		Class Cvoiture = Class.forName(voitureClasse);
		IVoiture voiture = (IVoiture) Cvoiture.newInstance();

		Class CchauffeurImpl = Class.forName(ChauffeurClass);
		IChauffeurImpl chauffeur = (IChauffeurImpl) CchauffeurImpl.newInstance();
		/* DECLARATION ET EXECUSSION DES METHODES */

		// Method setvitesseActuelle pour initialiser une vitesse
		Method voituresetVitessActuelle = Cvoiture.getMethod("setVitesseActuelle", new Class[] { int.class });
		voituresetVitessActuelle.invoke(voiture, new Object[] { 10 });

		// metode Set Voiture c'est l'importante ;)
		Method chauffeurConduireMethod = CchauffeurImpl.getMethod("setVoiture", new Class[] { IVoiture.class });
		chauffeurConduireMethod.invoke(chauffeur, new Object[] { voiture });

		chauffeur.Conduire(10);

	}

}
