package Test.Calculator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Arithmetic_operators extends setup {
	@Test
	void addition() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		Thread.sleep(1000);
		System.out.println("Addition Completed");
		driver.findElement(By.xpath("//span[text()='AC']")).click();
	}
	
	@Test
	void subtraction() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//span[text()='–']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		Thread.sleep(1000);
		System.out.println("Subtraction Completed");
		driver.findElement(By.xpath("//span[text()='AC']")).click();
	}
	
	@Test
	void mul() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		System.out.println("Multiplication Completed");
		driver.findElement(By.xpath("//span[text()='AC']")).click();
	}
	
	@Test
	void div() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='/']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		Thread.sleep(1000);
		System.out.println("Division Completed");
		driver.findElement(By.xpath("//span[text()='AC']")).click();
	}
}
