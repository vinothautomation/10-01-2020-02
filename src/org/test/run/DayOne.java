package org.test.run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\GIT\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:www.gmail.com/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.quit();
}
}
