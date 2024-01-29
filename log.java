import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class log {

	public WebDriver driver1;
	public WebDriver driver2;
	public WebDriver driver3;

	@BeforeTest

	public void login() {

		WebDriverManager.chromedriver().setup();

		driver1 = new ChromeDriver();

		driver1.get("https://github.com/login");
		driver1.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("");
		driver1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
		driver1.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]")).click();
	}

	@Test()

	public void Test_The_Title() {
		
		
		String actual = driver1.getTitle();
		String expected = "get";
		
		Assert.assertEquals(actual, expected);

	}

	@Test()

	public void Test_The_Logout() {
		System.out.println("hi");

	}

}
