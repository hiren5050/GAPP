package springmvc.model.dao;

import java.util.List;

import springmvc.model.AdditionalInfo;
import springmvc.model.ApplicationStatus;

public interface ApplicationStatusDao {
	
	
	ApplicationStatus getApplicationStatus(Integer As_id);
	
	List<AdditionalInfo> getApplicationStatus();
	
	
	ApplicationStatus saveApplicationStatus (ApplicationStatus applicationStatus);
	
	

}
