package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean passwordSpecialCharacter() {
		boolean matchesString = Pattern.matches("^([~!@#$%^&*()+{}]?[A-Za-z0-9]){5,}$", "Rah5@l");
		return matchesString;
	}
}