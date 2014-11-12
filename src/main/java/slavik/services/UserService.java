package slavik.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slavik.domain.User;

import javax.servlet.http.HttpSession;

/**
 * Created by v.petrushkin on 12.11.2014.
 */
@Service
public class UserService {
	private User[] users = {
		new User(0, "test", "test")
	};

	@Autowired
	HttpSession httpSession;

	public boolean checkUserPassword(String username, String password) {
		for (User user : users) {
			if (username.equals(user.getName()))
				return user.getPassword().equals(password);
		}
		return false;
	}

	public User getUserByUsername(String username) {
		for (User user : users)
			if (username.equals(user.getName()))
				return user;
		return null;
	}

}
