package slavik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import slavik.domain.User;
import slavik.services.UserService;

import javax.servlet.http.HttpSession;

/**
 * Created by v.petrushkin on 05.11.2014.
 */
@Controller
@RequestMapping("/action")
@Scope("session")
public class ActionController {
	@Autowired
	private UserService userService;

//	@Autowired
	private User user;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String signIn(Model model, @RequestParam String username, @RequestParam String password, HttpSession session) {
		if (username.equals("test") && password.equals("test")) {
			if (userService.checkUserPassword(username, password))
				user = userService.getUserByUsername(username);
		 	return "redirect:/";
		} else {
			model.addAttribute("message", "Incorrect login or password, try again!");
			return "redirect:/login";
		}
	}
}
