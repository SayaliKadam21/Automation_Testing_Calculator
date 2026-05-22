package Test.Calculator;

import java.time.Duration;
import org.testng.annotations.BeforeTest;


public class setup implements Driver{
	
	@BeforeTest
void launch() {
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	

		System.out.println("Calculator Website Opened");
	}
}
