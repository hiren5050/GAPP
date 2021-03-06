package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Degreetype;
import springmvc.model.Department;
import springmvc.model.Program;
import springmvc.model.dao.ProgramDao;

@Repository
public class ProgramDaoImpl implements ProgramDao {
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public EntityManager entityManager;

	@Override
	public Program getProgram(Integer p_id) {
		
		return entityManager.find(Program.class, p_id);
	}

	@Override
	public List<Program> getProgram() {
		
		return entityManager.createQuery("from Program order by p_id", Program.class).getResultList();
	}

	@Override
	@Transactional
	public Program saveProgram(Program program) {
		
		return entityManager.merge(program);
	}

	@Override
	public void  removeProgra(Program program) {
		
		entityManager.remove(program);
		
	}



}



