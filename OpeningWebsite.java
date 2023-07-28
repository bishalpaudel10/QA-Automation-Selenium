package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpeningWebsite {
	public void landing(WebDriver driver)
	{
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.linkText("Enter the Store"));
		driver.findElement(By.xpath("/html/body/div/p[1]/a")).click();
		
		
	}


		
	}

