package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addupdateandremove {
	
	public void fish(WebDriver driver){
		
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();//fish
	}
	public void angelfish(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();//angelfish
	}
	
	public void add1(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();//addtocart
		driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();
	}	
	
	
	public void dogs(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img")).click();//dogs
	}
		
	public void poodle(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
	}
		
	public void add2(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();	
	}
		
	public void update(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[4]/td[1]/input")).click();
	}
	
	public void removing(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
	}	
}
		
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();//proceed to checkout
	    //driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table/tbody/tr[14]/td/input")).click();
	    //driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
	    //driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
	    //driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
	    //driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();	
		

