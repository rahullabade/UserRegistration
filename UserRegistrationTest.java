package UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class UserRegistrationTest {
	private Assertions Assert;

	@Test
	public void givenFirstNameWhenShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean userTest = userRegistration.passwordSpecialCharacter();
		Assert.assertTrue(userTest);
	}
}