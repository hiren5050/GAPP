package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.EducationBackground;
import springmvc.model.dao.EducationBackgroundDao;

@Repository
public class EducationBackgroundDaoImpl implements EducationBackgroundDao {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public EntityManager entityManager;

	@Override
	public EducationBackground getEducationBackground(Integer E_id) {

		return entityManager.find(EducationBackground.class, E_id);
	}

	@Override
	public List<EducationBackground> getEducationBackgroud() {
		return entityManager.createQuery("from EducationBackground order by E_id", EducationBackground.class)
				.getResultList();
	}

	@Override
	@Transactional
	public EducationBackground saveEducationBackground(EducationBackground educationBackground) {
		
		return entityManager.merge(educationBackground);
	}

}
