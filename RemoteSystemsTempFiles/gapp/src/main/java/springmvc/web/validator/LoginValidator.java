package springmvc.web.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.SessionAttributes;

import springmvc.model.User;
import springmvc.model.dao.UserDao;

@Component
@SessionAttributes("user")
public class LoginValidator implements Validator {

	private boolean login = false ;
	private boolean password = false;
//	Login = Login;
	
	
	@Autowired
	private UserDao userDao;

	
	@Override
	public boolean supports(Class<?> clazz) {

		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		User user = (User) target;

		if (!StringUtils.hasText(user.getEmail())) {
			errors.rejectValue("Email", "error.field.login");
		} else if (!StringUtils.hasText(user.getPassWord())) {
			errors.rejectValue("PassWord", "error.field.Password");
		}
		
		List<User> users = userDao.getUser();
		for(User user1 : users)
		{
			if(user1.getEmail().equalsIgnoreCase(user.getEmail()) && user1.getPassWord().equalsIgnoreCase(user.getPassWord()))
			{
				login = true ;
				break;
//				if(user1.getEmail().equals(user.getPassWord()))
//				{
//					password = true;
//				}
			}
		}
		if(!login)
			errors.rejectValue("LastName", "error.field.credential");
		
	//	for (User users : userDao.getUser()) {
		//	if (!users.getEmail().equals(user.getEmail())) {
			//	errors.rejectValue("Email", "error.field.Unknown");
//
		//	} else if (!users.getPcassWord().equals(user.getPassWord())) {
	//			errors.rejectValue("PassWord", "error.field.Pass");
				
			//S}
		//}
	}
}