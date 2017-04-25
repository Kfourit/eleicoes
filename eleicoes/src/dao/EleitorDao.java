package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import util.JPAUtil;
import entity.Eleitor;

public class EleitorDao implements IBaseDao<Eleitor> {

	private EntityManager entityManager = JPAUtil.getEntityManager();

	@Override
	public void saveOrUpdate(Eleitor objs) {
		if (objs.getId() == null) {
			entityManager.getTransaction().begin();
			entityManager.persist(objs);
			entityManager.getTransaction().commit();
		} else {
			entityManager.getTransaction().begin();
			entityManager.merge(objs);
			entityManager.getTransaction().commit();
		}
	}

	@Override
	public void delete(Integer id) {
		Eleitor obj = retrieve(id);
		if (obj != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(obj);
			entityManager.getTransaction().commit();
		}

	}

	@Override
	public Eleitor retrieve(Integer id) {
		return entityManager.find(Eleitor.class, id);
	}

	@Override
	public List<Eleitor> retrieveAll() {
		CriteriaQuery<Eleitor> cq = entityManager.getCriteriaBuilder()
				.createQuery(Eleitor.class);
		cq.distinct(true);
		cq.select(cq.from(Eleitor.class));
		return entityManager.createQuery(cq).getResultList();
	}

}
