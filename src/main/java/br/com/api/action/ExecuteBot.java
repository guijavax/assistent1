package br.com.api.action;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/execute")
public class ExecuteBot {
	
	private String url;
	
	@Before
	private void execute(String url) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
	}
	
	@PostMapping("/open")
	public void open(@RequestBody String url) {
		
		ExecuteBot exec = new ExecuteBot();
		exec.execute(url);
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
