package parallel_execution_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parellel3 {
	public static WebDriver driver;

	@Test
	public void logic7() {

		System.out.println("this is logic 7 " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

	}

	@Test
	public void logic8() {
		System.out.println("this is logic 8" + Thread.currentThread().getId());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");

	}

	@Test
	public void logic9() {
		System.out.println("this is logic 9" + Thread.currentThread().getId());

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com");

	}

}
