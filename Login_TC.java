package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import SeleniumMaven.TestSelenium.Login_Pom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Login_Pom login = new Login_Pom(driver);
		
		login.enter_username("facebook");
		login.enter_password("abcdef");
		login.click_log();
				
	}

}
