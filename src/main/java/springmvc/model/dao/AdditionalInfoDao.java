package springmvc.model.dao;

import java.util.List;

import springmvc.model.AdditionalInfo;

public interface AdditionalInfoDao {
	
	AdditionalInfo getAdditionalInfo(Integer ad_id);
	
	List<AdditionalInfo> getAdditionalInfo(); 
	
	AdditionalInfo saveAdditionalinfo (AdditionalInfo additionalinfo);
	
	void removeAdditionalinfo (AdditionalInfo additionalinfo);
	
	
}
