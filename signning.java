package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signning {
	
	public void login(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
	}


	public void setUsername(WebDriver driver) {
		
	
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("bishal642");
		
	}
	public void setPassword(WebDriver driver) {
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("aabb");
	}
	
	
	public void setUsername(WebDriver driver, String username) {
		// TODO Auto-generated method stub
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		
	}
	public void setPassword(WebDriver driver,String password) {
		// TODO Auto-generated method stub
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
        
		
	}


	public void clickLogin(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
	}


}
