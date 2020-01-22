package com.javaspringangular.main;

import com.javaspringangular.pojo.IChauffeurImpl;
import com.javaspringangular.pojo.IVoiture;
import com.javaspringangular.pojo.IVoitureImpl;
import com.javaspringangular.pojo.IVoitureImpl2;

public class Main {
	/* couplage faible et injection avec instatiation simple */
	public static void main(String[] args) {

		/* vous pouvez changer IVoitureImpl par IVoitureImpl2 pour tester l'injection */
		IVoiture voiture = new IVoitureImpl(30);
		IChauffeurImpl iChauffeurImpl = new IChauffeurImpl();
		iChauffeurImpl.setVoiture(voiture);
		iChauffeurImpl.Conduire(10);

	}

}
