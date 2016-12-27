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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


@Entity
@Table(name = "user_info")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	// private String User_name;

	@Column(name = "f_name", nullable = false)
	private String FirstName;

	@Column(name = "l_name", nullable = false)
	private String LastName;

	@Column(name = "email", nullable = false)
	private String Email;

	@Column(name = "password", nullable = false)
	private String PassWord;

	@ElementCollection
	@CollectionTable(name = "user_type", joinColumns = @JoinColumn(name = "u_id") )
	private List<String> user_type;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "deparment")
	Department departmet;
	
	@OneToOne(mappedBy = "user_info")
	@JoinColumn(name = "user_info")
	Student student;
	
	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public List<String> getUser_type() {
		return user_type;
	}

	public void setUser_type(List<String> user_type) {
		this.user_type = user_type;
	}

	public Department getDepartmet() {
		return departmet;
	}

	public void setDepartmet(Department departmet) {
		this.departmet = departmet;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


}
