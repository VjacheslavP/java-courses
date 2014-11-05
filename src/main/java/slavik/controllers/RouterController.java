package slavik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by v.petrushkin on 05.11.2014.
 */
@Controller
@RequestMapping("/")
public class RouterController {
	@RequestMapping("/login")
	public String loginForm() {
		return "login";
	}
}
