package test;
import org.junit.Assert;
import org.junit.Test;

import application.App;

public class AppTest {
	
	@Test
	public void shouldReturnAnInstanceOfApp() {
		App app = new App();
		Assert.assertNotNull(app);
	}
	
	@Test
	public void shouldReturnConcatenatedString() {
		App app = new App();
		String first = "Darth ";
		String second = "Vader";
		String predicted = "Darth Vader";
		String result = app.addStrings(first, second);
		Assert.assertEquals(predicted, result);
	}
	
}
