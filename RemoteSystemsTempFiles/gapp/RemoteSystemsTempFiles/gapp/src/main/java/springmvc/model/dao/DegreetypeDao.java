package springmvc.model.dao;

import java.util.List;

import springmvc.model.Degreetype;

public interface DegreetypeDao {
	
	Degreetype getDegreetype(Integer de_id);
	
	List<Degreetype> getDegreetype();
	
	Degreetype saveDegreetype (Degreetype degreetype);
	

}
