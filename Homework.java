import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Homework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driverr\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com");

		String username = "standard_user";
		String pass = "secret_sauce";

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
//		driver.manage().window().fullscreen();

		int expectedItems = 6;

		List<WebElement> myBottons = driver.findElements(By.className("btn"));                                                // list to store all the buttons

		for (int i = 0; i < myBottons.size(); i++) {                                                                          //loop to click on the buttons 
			myBottons.get(i).click();
		}

		String actualItems = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();           //this  string to find the cart saved number of items after the clicking
        int therealnum = Integer.parseInt(actualItems);                                                                       // convert the string to integer
		
		Assert.assertEquals(therealnum, expectedItems);

	}

}
