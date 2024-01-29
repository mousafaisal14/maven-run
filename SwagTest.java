import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SwagTest {

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
		driver.manage().window().fullscreen();

		
		String actuallTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		
        		Assert.assertEquals(actuallTitle, expectedTitle);
        		
        		
		
		
	}

}
