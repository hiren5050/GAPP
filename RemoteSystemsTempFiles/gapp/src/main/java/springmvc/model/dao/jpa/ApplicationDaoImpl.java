package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Application;
import springmvc.model.dao.ApplicationDao;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;


	@Override
	public Application getApplication(Integer a_id)

	{
		return entityManager.find(Application.class, a_id);

	}
	@Override
	public List<Application> getApplication() {
		return entityManager.createQuery("from Application order by a_id", Application.class).getResultList();
	}
	
	@Override
	@Transactional
	public Application saveApplication(Application application) {
		
		return entityManager.merge(application);
	}
}


