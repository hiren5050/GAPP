package springmvc.web.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import springmvc.model.User;
import springmvc.model.dao.UserDao;

@Component
public class UserValidator implements Validator {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean supports(Class<?> clazz) {

		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;

		if (!StringUtils.hasText(user.getFirstName())) {
			errors.rejectValue("FirstName", "error.field.empty");
		}

		if (!StringUtils.hasText(user.getLastName())) {
			errors.rejectValue("LastName", "error.field.empty");
		}
		if (!StringUtils.hasText(user.getEmail())) {
			errors.rejectValue("Email", "error.field.empty");
		}
		if (!StringUtils.hasText(user.getPassWord())) {
			errors.rejectValue("PassWord", "error.field.empty");
		}

		for (User users : userDao.getUser()) {
			if (user.getEmail().equalsIgnoreCase(users.getEmail())) {
				errors.rejectValue("Email", "error.field.mismatch");
				break;
			}

		}

	}

}
