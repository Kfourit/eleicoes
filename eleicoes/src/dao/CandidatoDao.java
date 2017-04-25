package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import util.JPAUtil;
import entity.Candidato;

public class CandidatoDao implements IBaseDao<Candidato> {
	
	private EntityManager entityManager = JPAUtil.getEntityManager();

	@Override
	public void saveOrUpdate(Candidato objs) {
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
		Candidato obj = retrieve(id);
		if (obj != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(obj);
			entityManager.getTransaction().commit();
		}

	}

	@Override
	public Candidato retrieve(Integer id) {
		return entityManager.find(Candidato.class, id);
	}

	@Override
	public List<Candidato> retrieveAll() {
		CriteriaQuery<Candidato> cq = entityManager.getCriteriaBuilder()
				.createQuery(Candidato.class);
		cq.distinct(true);
		cq.select(cq.from(Candidato.class));
		return entityManager.createQuery(cq).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Candidato> retrievePresidentes(){
		String busca = "select c from Candidato c inner join c.presidentes";
		Query query = entityManager.createQuery(busca);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Candidato> retrieveGovernadores(){
		String busca = "select c from Candidato c inner join c.governadores";
		Query query = entityManager.createQuery(busca);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Candidato> retrievePrefeitos(){
		String busca = "select c from Candidato c inner join c.prefeitos";
		Query query = entityManager.createQuery(busca);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Candidato> retrieveSenadores(){
		String busca = "select c from Candidato c inner join c.senadores";
		Query query = entityManager.createQuery(busca);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Candidato> retrieveVereadores(){
		String busca = "select c from Candidato c inner join c.vereadores";
		Query query = entityManager.createQuery(busca);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Candidato> retrieveDeputadosEstaduais(){
		String busca = "select c from Candidato c inner join c.deputadosEstaduais";
		Query query = entityManager.createQuery(busca);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Candidato> retrieveDeputadosFederais(){
		String busca = "select c from Candidato c inner join c.deputadosFederais";
		Query query = entityManager.createQuery(busca);
		return query.getResultList();
	}
}
