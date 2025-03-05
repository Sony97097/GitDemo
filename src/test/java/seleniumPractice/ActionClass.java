package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")));
		a.build().perform();
	}
}
