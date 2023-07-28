package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class registeration {
	public void registration(WebDriver driver)
	{
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div/a")).click();
    Random rand1=new Random();
    int rand_int1=rand1.nextInt(1000);
    String uname="bishal"+rand_int1;
    driver.findElement(By.name("username")).sendKeys(uname);
    driver.findElement(By.name("password")).sendKeys("aabb");
    driver.findElement(By.name("repeatedPassword")).sendKeys("aabb");
    for(int i=0;i<=9;i++) {
        String a[]= {"Bishal","Paudel","a@gmail.com","9860478154","Balkot","Bhaktapur","Kathmandu","Bagmati","1010","Nepal"};
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr["+(i+1)+"]/td[2]/input")).sendKeys(a[i]);
        }
    Select language=new//Language Preference
            Select(driver.findElement(By.name("account.languagePreference")));
            language.selectByVisibleText("japanese");
            
            Select category=new
            		Select(driver.findElement(By.name("account.favouriteCategoryId")));
            		category.selectByVisibleText("DOGS");
            
            driver.findElement(By.name("account.listOption")).click();
            driver.findElement(By.name("account.bannerOption")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div/form/input")).click();
            
           // driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
    		//driver.findElement(By.name("username")).sendKeys(uname);
            //driver.findElement(By.name("password")).clear();
            //driver.findElement(By.name("password")).sendKeys("aabb");
            //driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
            
            
		
	}

}
