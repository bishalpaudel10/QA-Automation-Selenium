package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class payment {
	public void pay(WebDriver driver) {
		Select CardType= new Select(driver.findElement(By.name("order.cardType")));
		CardType.selectByVisibleText("MasterCard");
		
		driver.findElement(By.name("order.creditCard")).clear();
		driver.findElement(By.name("order.creditCard")).sendKeys("00 99 45 34 99");
		
		driver.findElement(By.name("order.expiryDate")).clear();
		driver.findElement(By.name("order.expiryDate")).sendKeys("01/2023");
		
	}
	
	public void BillingAddress(WebDriver driver) {
		
		driver.findElement(By.name("shippingAddressRequired")).click();
		driver.findElement(By.name("newOrder")).click();
		
	}
	
	 public void NewShippingAddress(WebDriver driver) {
			  driver.findElement(By.name("order.shipAddress1")).clear();
			  driver.findElement(By.name("order.shipAddress1")).sendKeys("Lalitpur");
			  
			  driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
			  
			  driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
			  
			  driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
			 //driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]/img")).click();
			 
		}
		 
	
	}

