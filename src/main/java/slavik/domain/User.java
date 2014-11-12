package slavik.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by v.petrushkin on 12.11.2014.
 */
@Component
@Scope(value="session", proxyMode = ScopedProxyMode.INTERFACES)
public class User {
	private String name;
	private String password;
	private int id;

	public User(int id, String username, String password) {
		this.id = id;
		this.name = username;
		this.password = password;
	}

//	@Override
	public String getPassword() {
		return password;
	}

//	@Override
	public void setPassword(String password) {
		this.password = password;
	}

//	@Override
	public String getName() {
		return name;
	}

//	@Override
	public void setName(String name) {
		this.name = name;
	}
}
