package springmvc.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.AdditionalInfo;
import springmvc.model.Department;
import springmvc.model.Program;
import springmvc.model.dao.AdditionalInfoDao;
import springmvc.model.dao.DepartmentDao;
import springmvc.model.dao.ProgramDao;

@Controller

public class DepartmentController {
	
	//int id = 0;

	@Autowired
	private DepartmentDao departmentDao;
	
	@Autowired
	private AdditionalInfoDao additionalinfoDao;

	@Autowired
	ProgramDao programDao;

	@RequestMapping(value = "admin.html", method = RequestMethod.GET)
	public String Department(ModelMap models) {
		List<Department> departments = departmentDao.getDepartment();

		models.put("departments", departments);
		return "admin";

	}

	@RequestMapping(value = "viewdepartment.html", method = RequestMethod.GET)
	public String viewdepartment(ModelMap models, @RequestParam Integer id) {
		Department department = departmentDao.getDepartment(id);
		models.put("department", department);
		models.put("programs", department.getProgram());
		// models.put("additionalfiled", department.getAdditional_info());
		models.put("additionals", department.getAdditional_info());
		return "viewdepartment";
	}

	@RequestMapping(value = "Adddepartment.html", method = RequestMethod.GET)
	public String Adddepartment(ModelMap models) {
		models.put("department", new Department());
		return "Adddepartment";

	}

	@RequestMapping(value = "Adddepartment.html", method = RequestMethod.POST)
	public String Adddepartment(@RequestParam String Name) {
		Department department = new Department();
		department.setName(Name);

		// save department
		department = departmentDao.saveDepartment(department);

		return "redirect:AddProgram.html?d_id=" + department.getD_id();

	}

	@RequestMapping(value = "AddProgram.html", method = RequestMethod.GET)
	public String AddProgram(ModelMap modls) {

		List<Department> departmens = departmentDao.getDepartment();

		modls.put("departments", departmens);

		return "AddProgram";

	}

	@RequestMapping(value = "AddProgram.html", method = RequestMethod.POST)
	public String AddProgram(@RequestParam String P_Name, @RequestParam int department_id, @RequestParam String Text,
			@RequestParam(required = false) boolean Required) {

		// System.out.println(department_id);
		Department department = departmentDao.getDepartment(department_id);
		Program program = new Program();

		AdditionalInfo additionalinfo = new AdditionalInfo();

		program.setP_Name(P_Name);

		program.setDepartment(department);
		// save Program
		program = programDao.saveProgram(program);

		additionalinfo.setText(Text);
		additionalinfo.setRequired(Required);
		additionalinfo.setDepartment(department);

		// save Additional Info
		additionalinfo = additionalinfoDao.saveAdditionalinfo(additionalinfo);

		return "redirect:admin.html";

	}

	@RequestMapping(value = "Editdepartment.html", method = RequestMethod.GET)
	public String Editdepartment(ModelMap models, @RequestParam Integer id, @ModelAttribute Department departmnet) {

		//Department department = departmentDao.saveDepartment(departmnet);

		Department departments = departmentDao.getDepartment(id);
		models.put("department", departments);
		models.put("department", departments.getName());
		models.put("department", departmentDao.getDepartment(id));
		models.put("programs", departments.getProgram());
		models.put("additionals", departments.getAdditional_info());
		
		return "Editdepartment";
		
	}

	@RequestMapping(value = "Editdepartment.html", method = RequestMethod.POST)
	public String Editdepartment(@ModelAttribute Department department , @RequestParam Integer id ) {

		Department d1 = departmentDao.getDepartment(id);
		
		d1.setD_id(id);
		d1.setName(department.getName());	
		department.setD_id(id);
		// save department
		department = departmentDao.saveDepartment(department);
		return "redirect:admin.html";
	}	
	
	@RequestMapping(value="delete.html" , method = RequestMethod.GET)
	public String UpdateProgram(@ModelAttribute Program progam , @RequestParam Integer id , ModelMap models)
	{
		
		Department department = departmentDao.getDepartment(id);
		models.put("department", department);
		models.put("department", department);
		return "EditDepartment.html";
		
	}

	
}
