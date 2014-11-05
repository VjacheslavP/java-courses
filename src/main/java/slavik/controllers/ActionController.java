package slavik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by v.petrushkin on 05.11.2014.
 */
@Controller
@RequestMapping("/action")
public class ActionController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String signIn(Model model, @RequestParam String username, @RequestParam String password) {
		if (username.equals("test") && password.equals("test"))
			return "redirect:/";
		else {
			model.addAttribute("message", "Incorrect login or password, try again!");
			return "redirect:/login";
		}
	}
}
