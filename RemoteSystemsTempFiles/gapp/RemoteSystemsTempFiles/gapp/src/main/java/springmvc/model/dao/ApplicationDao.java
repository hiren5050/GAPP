package springmvc.model.dao;

import java.util.List;

import springmvc.model.Application;

public interface ApplicationDao {

	Application getApplication(Integer a_id);

	List<Application> getApplication();
	
	Application saveApplication(Application application);

}
