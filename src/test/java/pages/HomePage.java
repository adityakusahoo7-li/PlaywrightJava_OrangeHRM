package pages;

import com.microsoft.playwright.Page;

public class HomePage{
		private Page page;
		private final String timeLink = "//span[text()='Time']";
		

		public HomePage(Page page) {
			this.page = page;
		}
		
		public void clickTimeLink() {
			page.click(timeLink);
		}
		
		
		
		
}
