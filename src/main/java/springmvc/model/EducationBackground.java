package springmvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "education_background") 
public class EducationBackground implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	private Integer E_id;
	
	@OneToOne
	private Student student_info;
	
	
	@Column (name = "tofel", nullable = true  ) 
	private Integer Toefl;
	
	@Column (name = "gre" , nullable = true)
	private Integer Gre;
	
	@Column (name ="gpa" , nullable = true)
	private Double Gpa;
	
	@Column (name = "transcript" , nullable = true )
	private String Transcript;

	public Integer getE_id() {
		return E_id;
	}

	public void setE_id(Integer e_id) {
		E_id = e_id;
	}

	
	public Integer getToefl() {
		return Toefl;
	}

	public void setToefl(Integer toefl) {
		Toefl = toefl;
	}

	public Integer getGre() {
		return Gre;
	}

	public void setGre(Integer gre) {
		Gre = gre;
	}

	public Double getGpa() {
		return Gpa;
	}

	public void setGpa(Double gpa) {
		Gpa = gpa;
	}

	public String getTranscript() {
		return Transcript;
	}

	public void setTranscript(String transcript) {
		Transcript = transcript;
	}

	public Student getStudent_info() {
		return student_info;
	}

	public void setStudent_info(Student student_info) {
		this.student_info = student_info;
	}
	

}
