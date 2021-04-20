package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import entidade.Sorvete;
import util.JpaUtil;

public class SorveteDAOImpl implements SorveteDAO {

	private EntityManager ent;
	private EntityTransaction tx;

	@Override
	public void inserir(Sorvete sorvete) {
		try {
			ent = JpaUtil.getEntityManager();
			tx = ent.getTransaction();
			tx.begin();
			ent.persist(sorvete);
			tx.commit();

		} catch (Exception e) {
			if (ent.isOpen()) {
				tx.rollback();
			}
		} finally {
			if (ent.isOpen()) {
				ent.close();
			}
		}

	}

	@Override
	public List<Sorvete> listarSorvetes() {
		ent = JpaUtil.getEntityManager();
		
		List<Sorvete> listarSorvetes = new ArrayList<Sorvete>();

		Query consulta = ent.createQuery("from Sorvete u");

		listarSorvetes = consulta.getResultList();

		return listarSorvetes;
	}

	@Override
	public void remover(String nome) {
		try {
			ent = JpaUtil.getEntityManager();
			Sorvete sorveteRemover = ent.find(Sorvete.class, nome);
			tx = ent.getTransaction();
			tx.begin();
			ent.remove(sorveteRemover);
			tx.commit();

		} catch (Exception e) {
			if (ent.isOpen()) {
				tx.rollback();
			}
		} finally {
			if (ent.isOpen()) {
				ent.close();
			}
		}

	}

}
