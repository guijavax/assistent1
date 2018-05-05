package br.com.api.action;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteBot {
	
	private String url;
	@Before
	public void execute() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(this.url);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
