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

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "additional_info")
public class AdditionalInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 @ManyToOne (fetch = FetchType.EAGER)
	 Department department;
	
	
	
	
	
	@Id
	@GeneratedValue
	private Integer ad_id;

	@Column(name = "text", nullable = true)
	private String Text;

	@Column(name = "required", nullable = true)
	private boolean Required;

	@Column(name = "file", nullable = true)
	private String File;

	

	@OneToOne
	Application application;

	public Integer getAd_id() {
		return ad_id;
	}

	public void setAd_id(Integer ad_id) {
		this.ad_id = ad_id;
	}

	public boolean isRequired() {
		return Required;
	}

	public void setRequired(boolean required) {
		Required = required;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public String getFile() {
		return File;
	}

	public void setFile(String file) {
		File = file;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	 public Department getDepartment() {
	 return department;
	 }

	 public void setDepartment(Department department) {
	 this.department = department;
	 }

}
