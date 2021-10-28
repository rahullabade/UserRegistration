package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean password() {
		boolean matchesString = Pattern.matches("^[a-z]{5}$", "rahul");
		return matchesString;
	}
}