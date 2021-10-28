package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean passwordUpperCase() {
        boolean matchesString = Pattern.matches("^[A-Z{1}a-z]{5}$", "rahul");
        return matchesString;
    }
}