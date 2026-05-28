package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
		private Page page;
		private final String userTextboxLogin ="input[name='username']";
		private final String passwordTextbox ="input[name='password']";
		private final String loginButton ="button[type='submit']";
		
		public LoginPage(Page page) {
			this.page = page;
		}
		
		public void addUsername(String username) {
			page.fill(userTextboxLogin, username);
		}
		public void addpassword(String passowrd) {
			page.fill(passwordTextbox, passowrd);
		}
		public void clickLoginButton() {
			page.click(loginButton);
		}
		
		public void login(String username,String passowrd) {
			page.fill(userTextboxLogin, username);
			page.fill(passwordTextbox, passowrd);
			page.click(loginButton);
		}
}
