package springmvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "degree_type")
public class Degreetype implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer de_id;

	@Column(name = "name", nullable = false)
	private String Name;

	@Column(name = "degree_type", nullable = false)
	private String DegreeType;

	@Column(name = "major", nullable = false)
	private String Major;

	@Column(name = "s_date", nullable = false)
	private Date StartDate;

	@Column(name = "e_date", nullable = false)
	private Date EndDate;

	/*@OneToOne
	 private Student student ;*/
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "student_id" , nullable = true )
	Student student;
	

	public Integer getDe_id() {
		return de_id;
	}

	public void setDe_id(Integer de_id) {
		this.de_id = de_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDegreeType() {
		return DegreeType;
	}

	public void setDegreeType(String degreeType) {
		DegreeType = degreeType;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

/*	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
*/
}
