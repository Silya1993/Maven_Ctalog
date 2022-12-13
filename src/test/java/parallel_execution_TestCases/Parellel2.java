package parallel_execution_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parellel2 {

	public static WebDriver driver;

	@Test(threadPoolSize = 3 , invocationCount =2)
	public void logic4() {
		System.out.println("this is the logic4" + Thread.currentThread().getId());
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

	}

	@Test(threadPoolSize = 3 , invocationCount =2)
	public void logic5() {
		System.out.println("this is the logic5" + Thread.currentThread().getId());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");

	}

	@Test(threadPoolSize = 3 , invocationCount =2)
	public void logic6() {
		System.out.println("this is the logic6" + Thread.currentThread().getId());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com");


	}
}
