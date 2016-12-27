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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "student_info")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer s_id;

	@Column(name = "l_name", nullable = false)
	private String LastName;

	@Column(name = "f_name", nullable = false)
	private String FirstName;

	@Column(name = "cin", nullable = true)
	private Integer CIN;

	@Column(name = "phone", nullable = false)
	// @ElementCollection
	private String Phone;

	@Column(name = "email", nullable = false)
	private String Email;

	@Column(name = "gender", nullable = false)
	private char Gender;

	@Column(name = "dob", nullable = false)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date Dateofbirth;

	@Column(name = "citizenship", nullable = false)
	private String citizenship;

	/*
	 * @OneToMany(cascade = CascadeType.ALL) private List<Application>
	 * application_details;
	 */
	/*@ManyToMany(cascade = {CascadeType.MERGE ,CascadeType.PERSIST} )
	@JoinTable(name = "student_info",joinColumns=@JoinColumn(name = "application_id",nullable =true),inverseJoinColumns=@JoinColumn(name= "s_id"))
	List<Application> application_details;*/
	
	
	@OneToMany(mappedBy = "student", cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	List<ApplicationStatus> applicationstatus;
	
/*	@OneToOne
	@JoinColumn(name = "de_id")
	Degreetype degreetype;
*/
	
	@OneToMany(mappedBy = "student" , cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	List<Degreetype> degreetype;
	
	@OneToOne
	private User user_info;

	@OneToOne
	@JoinColumn (name = "ed_id")
	EducationBackground educationBackground;
	
	@OneToOne
	@JoinColumn(name = "application_id")
	Application application;

	
	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public Integer getCIN() {
		return CIN;
	}

	public void setCIN(Integer cIN) {
		CIN = cIN;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		Gender = gender;
	}

	public Date getDateofbirth() {
		return Dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		Dateofbirth = dateofbirth;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	/*
	 * public List<Application> getApplication_details() { return
	 * application_details; }
	 * 
	 * public void setApplication_details(List<Application> application_details)
	 * { this.application_details = application_details; }
	 */
	public User getUser_info() {
		return user_info;
	}

	public void setUser_info(User user_info) {
		this.user_info = user_info;
	}

	public List<ApplicationStatus> getApplicationstatus() {
		return applicationstatus;
	}

	public void setApplicationstatus(List<ApplicationStatus> applicationstatus) {
		this.applicationstatus = applicationstatus;
	}
	
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	/*public List<Application> getApplication_details() {
		return application_details;
	}

	public void setApplication_details(List<Application> application_details) {
		this.application_details = application_details;
	}
*/
	public EducationBackground getEducationBackground() {
		return educationBackground;
	}

	public void setEducationBackground(EducationBackground educationBackground) {
		this.educationBackground = educationBackground;
	}

/*	public Degreetype getDegreetype() {
		return degreetype;
	}

	public void setDegreetype(Degreetype degreetype) {
		this.degreetype = degreetype;
	}
*/
	public List<Degreetype> getDegreetype() {
		return degreetype;
	}

	public void setDegreetype(List<Degreetype> degreetype) {
		this.degreetype = degreetype;
	}

	
}
