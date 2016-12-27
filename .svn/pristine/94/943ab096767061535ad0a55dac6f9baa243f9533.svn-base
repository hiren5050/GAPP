package springmvc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "applicationstatus")
public class ApplicationStatus  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer As_id;

	@Column(name = "status" , nullable = true)
	@ElementCollection
	private List<String> Status;

	@Column(name = "u_date" , nullable = true )
	private Date UpdateDate;

	@Column(name = "comment", nullable = true)
	private String Comment;
	
	//@OneToOne(cascade =CascadeType.ALL)
//private Student student_info;

	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name = "student_id" , nullable = true)
	Student student;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "application_id" , nullable = true)
	Application application;
	
	public Integer getAs_id() {
		return As_id;
	}

	public void setAs_id(Integer as_id) {
		As_id = as_id;
	}

	public List<String> getStatus() {
		return Status;
	}

	public void setStatus(List<String> status) {
		Status = status;
	}

	public Date getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	
	
	/*public Student getStudent_info() {
		return student_info;
	}

	public void setStudent_info(Student student_info) {
		this.student_info = student_info;
	}*/

}
