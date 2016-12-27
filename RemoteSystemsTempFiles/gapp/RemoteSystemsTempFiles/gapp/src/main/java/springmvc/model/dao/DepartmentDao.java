package springmvc.model.dao;

import java.util.List;

import springmvc.model.Department;

public interface DepartmentDao {
	
	Department getDepartment(Integer d_id);
	

	List<Department> getDepartment();
	
	Department saveDepartment (Department department);
	


}
