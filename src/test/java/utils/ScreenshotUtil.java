package utils;

import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.microsoft.playwright.Page;

public class ScreenshotUtil {
	
	public static String takeScreenshot(Page page, String testName) {
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(0));
		String path = "test-out/screenshots/"+ testName + "_"+ timestamp + ".png";
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
		return path;
		
	}

}
