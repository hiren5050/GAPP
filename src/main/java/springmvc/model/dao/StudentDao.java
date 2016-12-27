package springmvc.model.dao;

import java.util.List;

import springmvc.model.Student;

public interface StudentDao {

	Student getStudent(Integer s_id);

	List<Student> getStudent();
	
	Student saveStudent (Student student);

}