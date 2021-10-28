package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean email() {
		boolean matchesString = Pattern.matches("^[A-Za-z._]+[@]{1}[a-zA-Z]+[.a-z]{4}([.a-zA-Z]{3})*$",
				"rahullabade05@gmail.com");
		return matchesString;
	}
}