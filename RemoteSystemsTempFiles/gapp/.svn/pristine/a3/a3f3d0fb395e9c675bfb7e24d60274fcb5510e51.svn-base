package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.AdditionalInfo;
import springmvc.model.ApplicationStatus;
import springmvc.model.dao.ApplicationStatusDao;

@Repository
public class ApplicationStatusDaoImpl implements ApplicationStatusDao {
	
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	@Override
	public ApplicationStatus getApplicationStatus(Integer As_id) {
		
		return entityManager.find(ApplicationStatus.class, As_id);
	}

	@Override
	public List<AdditionalInfo> getApplicationStatus() {
		
		return entityManager.createQuery("from ApplicationStatus order by As_id", AdditionalInfo.class).getResultList();
	}

	@Override
	@Transactional
	public ApplicationStatus saveApplicationStatus(ApplicationStatus applicationStatus) {
		
		return entityManager.merge(applicationStatus);
	}


}
