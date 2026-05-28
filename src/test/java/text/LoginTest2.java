package text;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.baseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends baseTest {

	@Test
	public void logintest1() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		test.info("Navigate To Login Page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addUsername("Admi");
		test.info("Adding password");
		loginpage.addpassword("admin123");
		test.info("Click on login button");
		loginpage.clickLoginButton();
		test.info("Check Dasboard");
		homepage.clickTimeLink();
		test.info("All Step Complited!");

	}
	
	@Test
	public void logintest2() {
		
		test.skip("Skipping this test");
		throw new SkipException("Skipping this test");
	
	}
	
	@Test
	public void logintest3() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		test.info("Navigate To Login Page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username");
		loginpage.addUsername("Admin");
		test.info("Adding password");
		loginpage.addpassword("admin123");
		test.info("Click on login button");
		loginpage.clickLoginButton();
		test.info("Check Dasboard");
		homepage.clickTimeLink();
		test.info("All Step Complited!");

	}
}
