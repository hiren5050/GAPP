package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Student;
import springmvc.model.dao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	@Override
	public Student getStudent(Integer s_id) {
		return entityManager.find(Student.class, s_id);
	}

	@Override
	public List<Student> getStudent() {
		return entityManager.createQuery("from Student order by s_id", Student.class).getResultList();
	}

	@Override
	@Transactional
	public Student saveStudent(Student student) {
		
		return entityManager.merge( student );
	}

}
