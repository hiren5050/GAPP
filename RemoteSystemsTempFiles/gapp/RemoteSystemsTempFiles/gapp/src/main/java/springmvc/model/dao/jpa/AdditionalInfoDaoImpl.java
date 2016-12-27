package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.AdditionalInfo;
import springmvc.model.dao.AdditionalInfoDao;

@Repository
public class AdditionalInfoDaoImpl implements AdditionalInfoDao{
	
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	@Override
	public AdditionalInfo getAdditionalInfo(Integer ad_id) {
		
		return entityManager.find(AdditionalInfo.class, ad_id);
	}

	@Override
	public List<AdditionalInfo> getAdditionalInfo() {
		
		return entityManager.createQuery("from AdditionalInfo order by ad_id", AdditionalInfo.class).getResultList();
	}

	@Override
	@Transactional
	public AdditionalInfo saveAdditionalinfo(AdditionalInfo additionalinfo) {
	
		return entityManager.merge(additionalinfo);
	}

	@Override
	public void removeAdditionalinfo(AdditionalInfo additionalinfo) {
	
		entityManager.remove(additionalinfo);
	}

}
