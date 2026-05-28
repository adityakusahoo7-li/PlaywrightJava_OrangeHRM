package text;

import org.testng.annotations.Test;

import base.baseTest;

public class FirstTest extends baseTest {
	@Test
	public void verifyTitel() {
		page.navigate("https://google.com");
		if (page.isVisible("button:has-text('Accept all')")) {
			page.click("button:has-text('Accept all')");
		}
		System.out.print("The Page titel is :" + page.title());
	}


}
