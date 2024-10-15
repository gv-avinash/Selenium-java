



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) {
		
		
		//https://github.com/gv-avinash/Selenium-java.git

		FirefoxDriver d= new FirefoxDriver();
		d.get("https://google.com");
		d.findElement(By.id("lst-ib")).sendKeys("gmail register");
		d.findElement(By.id("_fZl")).click();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.partialLinkText("sign up for a Gmail account - Google")).click();
		System.out.println("Clicked");
		//add comment
		//webhook1
		//webhook updated...
	}

}
