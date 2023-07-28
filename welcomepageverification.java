package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomepageverification {
	public void verification(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"WelcomeContent\"]"));
	}
}

