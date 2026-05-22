package Test.Calculator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class trigonometricFunctions extends setup{
	
	@Test
	void sin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='sin']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		System.out.println("sin function works");
	}
	@Test
	void cos() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='cos']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		System.out.println("cos function works");
	}
	
	@Test
	void tan() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='tan']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		System.out.println("tan function works");
	}

}
