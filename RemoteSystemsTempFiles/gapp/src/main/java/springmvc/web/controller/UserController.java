package springmvc.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.modelmbean.ModelMBeanInfoSupport;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import springmvc.model.User;
import springmvc.model.dao.UserDao;
import springmvc.web.validator.LoginValidator;
import springmvc.web.validator.UserValidator;

@Controller
@Validated
public class UserController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserValidator userValidator;

	@Autowired
	private LoginValidator loginValidator;

	// student html controller
/*	@RequestMapping("student.html")
	public String Student(ModelMap models) {
		return "/Student";

	}
*/
	// staff html controller
	@RequestMapping("Staff.html")
	public String Staff(ModelMap models) {
		return "Staff";

	}

	// LOGIN get method
	@RequestMapping(value = { "index.html", "/Login.html" }, method = RequestMethod.GET)
	public String Login(ModelMap models, @ModelAttribute User user) {
		models.put("user", new User());
		return "/Login";

	}

	// login post method
	@RequestMapping(value = { "index.html", "/Login.html" }, method = RequestMethod.POST)
	public String Login(@ModelAttribute User user, BindingResult result, ModelMap models, HttpSession session) {

		loginValidator.validate(user, result);

		if (result.hasErrors())
			return "/Login";

		List<String> usertype = null;

		String Email1 = user.getEmail();
		String Email = "";

		String Password1 = user.getPassWord();
		String Password = "";

		// User Validation and redirect to pages
		for (int i = 0; i < userDao.getUser().size(); i++) {
			Email = userDao.getUser().get(i).getEmail();
			Password = userDao.getUser().get(i).getPassWord();

			if (Email1.equalsIgnoreCase(Email) && Password1.equalsIgnoreCase(Password)) {
				List<User> users = userDao.getUser();
				// users.get(i).getId();
				System.out.println(users.get(i).getId());
				User obj = users.get(i);
				System.out.println(obj);
				session.setAttribute("users", users.get(i));

				usertype = userDao.getUser().get(i).getUser_type();
				if (usertype.contains("Adminstration")) {
					return "redirect:admin.html";
				}
				if (usertype.contains("Student")) {
					return "redirect:Student.html";	
				}
				if (usertype.contains("Staff")) {
					return "redirect:Staff.html";
				} else {
					models.put("error", false);

				}
			}
		}
		return "Login";
	}

	// Registration page get method
	@RequestMapping(value = "/Registration.html", method = RequestMethod.GET)
	public String Registration(ModelMap models) {
		models.put("user", new User());
		return "/Registration";

	}

	// Registration Post method
	@RequestMapping(value = "/Registration.html", method = RequestMethod.POST)
	public String Registration(@ModelAttribute User user, BindingResult result) {

		List<String> type = new ArrayList<String>();
		type.add("Student");
		
		user.setUser_type(type);
		
		
		userValidator.validate(user, result);
		if (result.hasErrors())
			return "Registration";
		
		
		
		// Save
		user = userDao.saveUser(user);

		return "redirect:Login.html";
	}

	@RequestMapping("/Gapp.html")
	public String Gapp(ModelMap models) {
		// List<User> users = userDao.getUser();
		// models.put("users", users);
		return "/Gapp";
	}

}
