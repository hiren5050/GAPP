package springmvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Program")
public class Program implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue
	private Integer p_id;
	
	@Column (name = "program_name" , nullable = true)
	private String P_Name;

	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name = "departmentId" , nullable = false)
	Department department;
	

	
	@OneToMany(mappedBy = "Programs" , cascade = {CascadeType.MERGE , CascadeType.PERSIST},fetch = FetchType.LAZY)
	List<Application> applications;
	
	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getP_Name() {
		return P_Name;
	}

	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	
	
}
