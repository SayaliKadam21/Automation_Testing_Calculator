package Test.Calculator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class footerLinks extends setup{
	
	@Test
	void fl() throws InterruptedException {
	List<WebElement> links =     
			driver.findElements(By.xpath("//ul[@id='hl1']//a"));

		System.out.println("Total Links: " + links.size());
  // Loop through all links
  for (int i = 0; i < links.size(); i++) {

      // Re-fetch elements after navigating back
      links = driver.findElements(By.xpath("//ul[@id='hl1']//a"));

      // Get link text
      String linkName = links.get(i).getText();

      System.out.println("Opening Link: " + linkName);

      // Click link
      links.get(i).click();

      // Wait
      Thread.sleep(2000);

      // Print current URL
      System.out.println("Current URL: " + driver.getCurrentUrl());

      // Verify page title
      System.out.println("Page Title: " + driver.getTitle());

      // Navigate back
      driver.navigate().back();

      Thread.sleep(2000);
  }
  
  
  List<WebElement> links2 = driver.findElements(
          By.xpath("//div[@class='homelisttile']//ul[contains(@class,'hl')]//a"));

  System.out.println("Total Links: " + links2.size());

  // Loop through all links
  for (int i = 0; i < links2.size(); i++) {

      // Re-fetch links after navigate back
      links2 = driver.findElements(
              By.xpath("//div[@class='homelisttile']//ul[contains(@class,'hl')]//a"));

      // Get link text
      String linkName = links2.get(i).getText();

      System.out.println("Clicking: " + linkName);

      // Click link
      links2.get(i).click();

      Thread.sleep(2000);

      // Validation
      System.out.println("Title: " + driver.getTitle());
      System.out.println("URL: " + driver.getCurrentUrl());

      // Go back
      driver.navigate().back();

      Thread.sleep(2000);
  }
	
  
  
  List<WebElement> links3 =
          driver.findElements(By.xpath("//ul[@id='hl3']//a"));

  System.out.println("Total Math Links: " + links3.size());

  for (int i = 0; i < links3.size(); i++) {

      // Re-fetch elements
      links3 = driver.findElements(By.xpath("//ul[@id='hl3']//a"));

      String linkName = links3.get(i).getText();

      System.out.println("Opening: " + linkName);

      links3.get(i).click();

      Thread.sleep(2000);

      System.out.println(driver.getTitle());

      driver.navigate().back();

      Thread.sleep(2000);
  		}
  
  
	}
}
