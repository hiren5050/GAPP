package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Department;
import springmvc.model.dao.DepartmentDao;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public EntityManager entityManager;

	@Override
	public Department getDepartment(Integer d_id) {
	
		return entityManager.find(Department.class, d_id);
	}

	@Override
	public List<Department> getDepartment() {
	
		return entityManager.createQuery("from Department order by d_id", Department.class).getResultList();
	}
	
	public List<Department> department()
	{
		return  entityManager.createQuery("from Department where Department.Name = 'Accounting Department'", Department.class).getResultList();
		
	}

	@Override
	@Transactional
	public Department saveDepartment(Department department) {
	
		return entityManager.merge(department);
	}


}