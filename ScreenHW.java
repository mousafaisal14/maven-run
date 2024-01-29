import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScreenHW {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driverr\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		List<WebElement> myOptions = driver.findElements(By.xpath("your_delete_button_xpath")); // Locate all delete buttons

		int totalButtons = myOptions.size();

		// Remove students with even indices
		for (int i = 0; i < totalButtons; i++) {
		    // Skip students with odd indices
		    if (i % 2 == 1) {
		    	
		    	myOptions.get(i).getText();
		    	System.err.println( "sorry i will remove " + myOptions.get(i).getText()  );
		        
		    } else {
		    	
		    	System.out.println("i will keep "+ myOptions.get(i).getText()); 
		    	
		    }

		    
		}



	}

}
