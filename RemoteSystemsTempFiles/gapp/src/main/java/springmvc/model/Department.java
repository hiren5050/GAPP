package springmvc.model;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "deparment")
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer d_id;

	@Column(name = "name", nullable = true)
	private String Name;

	/*
	 * @OneToMany(mappedBy = "department" , cascade =
	 * {CascadeType.MERGE,CascadeType.PERSIST} , fetch = FetchType.LAZY)
	 * List<Application> application;
	 */
	@OneToMany(mappedBy = "department", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
	List<AdditionalInfo> additional_info;

	@OneToMany(mappedBy = "department", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
	List<Program> program;

	public List<Program> getProgram() {
		return program;
	}

	public void setProgram(List<Program> program) {
		this.program = program;
	}

	@OneToMany
	@JoinColumn(name = "user_information")
	List<User> user;

	public Integer getD_id() {
		return d_id;
	}

	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	/*
	 * public List<Application> getApplication() { return application; }
	 * 
	 * 
	 * 
	 * public void setApplication(List<Application> application) {
	 * this.application = application; }
	 */

	public List<AdditionalInfo> getAdditional_info() {
		return additional_info;
	}

	public void setAdditional_info(List<AdditionalInfo> additional_info) {
		this.additional_info = additional_info;
	}

}
