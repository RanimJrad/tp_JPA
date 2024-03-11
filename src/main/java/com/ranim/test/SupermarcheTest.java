package com.ranim.test;

import com.ranim.dao.SupermarcheDao;
import com.ranim.entities.Supermarche;

public class SupermarcheTest {

	public static void main(String[] args) {
		Supermarche s = new Supermarche();
		s.setNomSupermarche("Monoprix");
		s.setType("Supermarche");

		SupermarcheDao supDao = new SupermarcheDao();
		supDao.ajouter(s);
		
		System.out.println("Appel de la méthode listerTous");
		for (Supermarche sup: supDao.listerTous())
			System.out.println(sup.getIdSupermarche()+" "+sup.getNomSupermarche());
		
		System.out.println("Appel de la méthode listerParNom");
		for (Supermarche su : supDao.listerParNom("Mon"))
			System.out.println(su.getIdSupermarche()+" "+su.getNomSupermarche());
	}

}
