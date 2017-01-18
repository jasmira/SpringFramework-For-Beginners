package ramana.anno.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import ramana.anno.domain.Community;
import ramana.anno.domain.Country;
import ramana.anno.domain.User;
import ramana.anno.service.UserService;

@Controller
@RequestMapping("userRegistration.htm")

public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@ModelAttribute("countryList")
	public List<Country> populateCountryList() {
		return userService.getAllCountries();
	}
	
	@ModelAttribute("communityList")
	public List<Community> populateCommunityList() {
		return userService.getAllCommunities();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showUserForm(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("user") User user) {
		user.setCountryName(userService.getCountryName(user.getCountryCode()));
		userService.add(user);
		return "userSuccess";
	}
	
}
