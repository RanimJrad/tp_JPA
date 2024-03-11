package com.ranim.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.ranim.entities.Supermarche;
import com.ranim.util.JPAutil;

public class SupermarcheDao {
	private EntityManager entityManager = JPAutil.getEntityManager("MonProjetSup");

	public void ajouter(Supermarche s) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(s);
		tx.commit();
	}

	public void modifier(Supermarche s) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(s);
		tx.commit();
	}

	public void supprimer(Supermarche s) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		s = entityManager.merge(s); // important
		entityManager.remove(s);
		tx.commit();
	}

	public Supermarche consulter(Supermarche s, Object id) {
		return entityManager.find(s.getClass(), id);
	}

	public List<Supermarche> listerTous() {
		List<Supermarche> supers = entityManager.createQuery("select s from Supermarche s").getResultList();

		return supers;
	}

	public List<Supermarche> listerParNom(String nomSupermarche) {
		List<Supermarche> supers = entityManager.createQuery("select s from Supermarche s where s.nomSupermarche like :pnom").setParameter("pnom", "%" + nomSupermarche + "%").getResultList();

		return supers;
	}

}
