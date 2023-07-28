package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searching {
	public void search(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("Angelfish");
		driver.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		
	}

}
