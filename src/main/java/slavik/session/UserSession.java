package slavik.session;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by skype:slavik_ok7 on 26.11.2014 20:33
 */
@Scope(value = "session", proxyMode = ScopedProxyMode.INTERFACES)
@Component
public class UserSession implements UserInterface {
	private String name;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
