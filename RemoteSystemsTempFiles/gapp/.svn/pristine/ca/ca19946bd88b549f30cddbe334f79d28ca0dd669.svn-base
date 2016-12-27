package springmvc.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import springmvc.model.dao.ApplicationDao;
import springmvc.model.dao.ApplicationStatusDao;
import springmvc.model.dao.DegreetypeDao;
import springmvc.model.dao.DepartmentDao;
import springmvc.model.dao.EducationBackgroundDao;
import springmvc.model.dao.ProgramDao;
import springmvc.model.dao.StudentDao;
import springmvc.model.dao.UserDao;
import springmvc.model.*;

@Controller
@SessionAttributes({ "users" })
public class ApplicationController {

	@Autowired
	DepartmentDao departmentDao;

	@Autowired
	UserDao userDao;

	@Autowired
	ApplicationDao applicationDao;

	@Autowired
	StudentDao studentDao;

	@Autowired
	ProgramDao programDao;

	@Autowired
	EducationBackgroundDao educationBackgroundDao;

	@Autowired
	DegreetypeDao degreetypeDao;

	@Autowired
	ApplicationStatusDao applicationStatusDao;

	@Autowired
	private ServletContext context;

	// ***************************************************************************************************//
	// Student Application Main Page
	@RequestMapping("/Student.html")
	public String Student(ModelMap models, HttpSession session) {

		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());
		List<ApplicationStatus> applicationStatus = new ArrayList<ApplicationStatus>();
		try {
			applicationStatus = user.getStudent().getApplicationstatus();
		} catch (Exception ex) {
			// applicationStatus = new ArrayList<ApplicationStatus>();
		}

		// Application application =
		// applicationDao.getApplication(application_id);
		models.put("application", applicationStatus);
		session.setAttribute("user", user.getId());
		// applicationStatus.get(0).getApplication().getA_id();

		return "Student";

	}

	// **************************************************************************************************************//
	// View application Student
	Integer application_id2 = 0;

	@RequestMapping("/viewapplication.html")
	public String viewapplication(ModelMap models, HttpSession session, @RequestParam Integer id) {

		User users = (User) session.getAttribute("users");
		session.setAttribute("user", users.getId());
		Application application = applicationDao.getApplication(id);
		// application.getStudent().getEducationBackground().getGpa()
		// System.out.println(application.getStudent().getEducationBackground().getGre());
		models.put("applications", application);
		return "viewapplication";

	}

	// ******************************************************************************************************************//
	// create Application
	@RequestMapping(value = "/CreateApplication.html", method = RequestMethod.GET)
	public String createapplication(ModelMap models, HttpSession session) {
		List<Department> departments = departmentDao.getDepartment();
		models.put("departments", departments);
		return "CreateApplication";
	}

	@RequestMapping(value = "getProgram.html", method = RequestMethod.POST)
	public @ResponseBody String getProgram(@RequestParam Integer department, HttpServletResponse response,
			ModelMap models) {
		Department dept = departmentDao.getDepartment(department);
		List<Program> program = dept.getProgram();
		JSONObject objr = new JSONObject();
		JSONArray array = new JSONArray();

		for (Program p : program) {

			JSONObject res = new JSONObject();
			res.put("p_id", p.getP_id());
			res.put("p_name", p.getP_Name());
			array.put(res);
		}
		objr.put("programs", array);
		return objr.toString();
	}

	Integer application_id = 0;

	@RequestMapping(value = "/CreateApplication.html", method = RequestMethod.POST)
	public String createapplication(@RequestParam String term, @RequestParam String program, HttpSession session) {
		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());

		Application application = new Application();
		application.setTerm(term);
		Integer program_id = Integer.parseInt(program);
		application.setPrograms(programDao.getProgram(program_id));
		application.setStudent(user.getStudent());
		// Save Application
		application = applicationDao.saveApplication(application);
		ApplicationStatus status = new ApplicationStatus();
		status.setApplication(application);
		status.setStudent(user.getStudent());
		status = applicationStatusDao.saveApplicationStatus(status);
		application_id = application.getA_id();
		// redirect
		return "redirect:studentdetails.html";

	}

	// ***********************************************************************************************//
	// student Details like first name , last name
	@RequestMapping(value = "/studentdetails.html", method = RequestMethod.GET)
	public String studentdetails(ModelMap models, HttpSession session) {

		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());
		// Student student2 = new Student();
		Student student = user.getStudent();
		models.put("student", new Student());
		return "studentdetails";
	}

	@RequestMapping(value = "/studentdetails.html", method = RequestMethod.POST)
	public String studentdetails(@ModelAttribute Student student, HttpSession session) {
		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());

		Application application = applicationDao.getApplication(application_id);
		student.setUser_info(user);
		student.setApplication(application);
		application.setStudent(user.getStudent());
		// student.setS_id(user.getId());
		// student.setS_id(user.getStudent().getS_id());
		studentDao.saveStudent(student);

		/*
		 * ApplicationStatus status = new ApplicationStatus();
		 * status.setStudent(user.getStudent()); status =
		 * applicationStatusDao.saveApplicationStatus(status);
		 */application.setStudent(user.getStudent());
		applicationDao.saveApplication(application);

		return "redirect:Degree.html";
	}

	// *********************************************************************************************************//

	@RequestMapping(value = "/Degree.html", method = RequestMethod.GET)
	public String degreedetails(ModelMap models, HttpSession session) {
		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());
		return "Degree";
	}

	@RequestMapping(value = "/Degree.html", method = RequestMethod.POST)
	public String degreedetails(@RequestParam String Name, @RequestParam String Major, @RequestParam Date StartDate,
			@RequestParam Date EndDate, @RequestParam String type, HttpSession session) {
		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());
		Degreetype degreetype = new Degreetype();

		Student student = user.getStudent();
		student.getS_id();
		// set application

		degreetype.setName(Name);
		degreetype.setMajor(Major);
		degreetype.setStartDate(StartDate);
		degreetype.setEndDate(EndDate);
		degreetype.setDegreeType(type);
		// degreetype.setStudent(student);
		// Save To the database
		degreetypeDao.saveDegreetype(degreetype);
		return "redirect:educationdetails.html";
	}

	// ****************************************************************************************************************//
	// gre ,tofel
	@RequestMapping(value = "/educationdetails.html", method = RequestMethod.GET)
	public String educationdetails(HttpSession session, ModelMap models) {
		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());
		return "educationdetails";
	}

	@RequestMapping(value = "/fileupload.html")
	public String fileupload() {
		return "fileupload";
	}

	private String getFileDirectory() {
		String path = context.getRealPath("/WEB-INF/files");

		return path;
	}

	@RequestMapping(value = "upload.html", method = RequestMethod.POST)
	public String upload(@RequestParam MultipartFile file) throws IllegalStateException, IOException {

		file.transferTo(new File(getFileDirectory(), file.getOriginalFilename()));
		return "redirect:educationdetails.html";
	}

	@RequestMapping(value = "/download.html")
	public String download(HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setHeader("Content-Disposition", "inline; filename=home -5.txt ");

		FileInputStream in = new FileInputStream(new File(getFileDirectory(), "home -5.txt"));
		OutputStream out = response.getOutputStream();

		byte buffer[] = new byte[2048];
		int bytesRead;
		while ((bytesRead = in.read(buffer)) > 0)
			out.write(buffer, 0, bytesRead);
		in.close();
		return null;

	}

	@RequestMapping(value = "educationdetails.html", method = RequestMethod.POST)
	public String educationdetails(@RequestParam Integer Gre, @RequestParam Integer Tofel, @RequestParam Double Gpa,
			HttpSession session) {

		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());

		EducationBackground edu = new EducationBackground();
		edu.setGpa(Gpa);
		edu.setGre(Gre);
		edu.setToefl(Tofel);
		edu.setTranscript(context.getRealPath("/WEB-INF/files"));
		edu.setStudent_info(studentDao.getStudent(user.getId()));
		educationBackgroundDao.saveEducationBackground(edu);

		return "redirect:Student.html";
	}
	// **************************************Edit You
	// Application****************************//

	@RequestMapping(value = "EditApplication.html", method = RequestMethod.GET)
	public String EditApplication(ModelMap models, @RequestParam Integer id, HttpSession session,
			@ModelAttribute("student") Student student) {
		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());

		Application application = applicationDao.getApplication(id);

		// application.getStudent().getDegreetype().get(0).getDegreeType();
		models.put("applications", application);
		models.put("student", studentDao.getStudent(id));

		return "EditApplication";
	}

	@RequestMapping(value = "EditApplication.html", method = RequestMethod.POST)
	public String EditApplication(@ModelAttribute Department department, @ModelAttribute("student") Student student,
			SessionStatus status) {
		department = departmentDao.saveDepartment(department);
		return "redirect:Student.html";
	}

	@RequestMapping(value = "studentEditApplication.html", method = RequestMethod.POST)
	@Transactional
	public String EditApplication(@ModelAttribute("student") Student student, HttpSession session) {
		User user = (User) session.getAttribute("users");
		user = userDao.getUser(user.getId());
		user.setStudent(student);
		student.setS_id(user.getId());
		student = studentDao.saveStudent(student);
		return "redirect:Student.html";
	}

	@RequestMapping(value = "degreeEditApplication.html", method = RequestMethod.POST)
	public String EditApplication(@ModelAttribute Degreetype degreetype) {
		degreetype = degreetypeDao.saveDegreetype(degreetype);
		return "redirect:Student.html";
	}

	@RequestMapping(value = "rquirementEditApplication.html", method = RequestMethod.POST)
	public String additional() {

		return "redirect:Student.html";
	}
}
