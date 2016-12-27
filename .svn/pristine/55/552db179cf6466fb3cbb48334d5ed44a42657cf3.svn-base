package springmvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author hiren
 *
 */
@Entity
@Table(name = "application_details")
public class Application implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer a_id;


	@Column(name = "term", nullable = false)
	private String Term;

	@OneToMany(mappedBy = "application", cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
	List<ApplicationStatus> applicationstatus;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "program_id")
	Program Programs;

	@OneToOne
	@JoinColumn(name = "student_id")
	Student student;
	
	public Integer getD_id() {
		return a_id;
	}

	public void setD_id(Integer a_id) {
		this.a_id = a_id;
	}

	public Integer getA_id() {
		return a_id;
	}

	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}

	/*public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}*/

	public String getTerm() {
		return Term;
	}

	public void setTerm(String term) {
		Term = term;
	}

	public List<ApplicationStatus> getApplicationstatus() {
		return applicationstatus;
	}

	public void setApplicationstatus(List<ApplicationStatus> applicationstatus) {
		this.applicationstatus = applicationstatus;
	}

/*	public List<Student> getStudent_info() {
		return student_info;
	}

	public void setStudent_info(List<Student> student_info) {
		this.student_info = student_info;
	}
*/
	public Program getPrograms() {
		return Programs;
	}

	public void setPrograms(Program programs) {
		Programs = programs;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


}
