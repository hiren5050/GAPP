package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Degreetype;
import springmvc.model.dao.DegreetypeDao;

@Repository
public class DegreetypeDaoImpl implements DegreetypeDao {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public EntityManager entityManager;

	@Override
	public Degreetype getDegreetype(Integer de_id) {

		return entityManager.find(Degreetype.class, de_id);
	}

	@Override
	public List<Degreetype> getDegreetype() {

		return entityManager.createQuery("from Degreetype order by de_id", Degreetype.class).getResultList();
	}

	@Override
	@Transactional
	public Degreetype saveDegreetype(Degreetype degreetype) {
		
		return entityManager.merge(degreetype);
	}

}
