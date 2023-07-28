package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class catelog {
	public void pictures(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
	}
	
	public void lleftcatelog(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[1]/td/img"));
		driver.findElement(By.xpath("//*[@id=\"LogoContent\"]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
	}
	
	public void quicklink(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
	}

}
