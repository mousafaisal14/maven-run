import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScreenShots {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\driverr\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//------------to take screen shots---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Date CurrentDate = new Date();
		String actualDate = CurrentDate.toString().replace(":", "-");                                        //this method to convert the (:) that appear in the name to (-) so u can save it correctly
		TakesScreenshot  src = ((TakesScreenshot)driver);                                                    //TakesScreenshot is a data type and mainly this line to take the screenshots
		File srcFile = src.getScreenshotAs((OutputType.FILE));                                               // here we created a file to store the screenshots in it
		File Dest = new File (".\\pics\\"+actualDate+".png");                                                // here u select the destination for the file and do not forget the png    and put (.) in the destination so yoy can save the screen shots in the same project  
		FileUtils.copyFile(srcFile, Dest);       
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		
		List <WebElement> theStudents = driver.findElements(By.tagName("original path"));                                //---
		int theTotalNumberOfStudents = theStudents.size();                                                               //--- this to print the total number of the students 
		System.out.println(theTotalNumberOfStudents);                                                                    //---
		
		//----------------- i need to remove 3 student only --------------------//
		
		int howManyDeletion = 3;                                                                               //this is the only variable you change
		
		for(int i = 0 ; i <howManyDeletion ; i++ ) {                                                          //--- this loop to delete 1 student
			
			driver.findElement(By.xpath("")).click();
			
		}
		
		List <WebElement> theStudentAfterRemove = driver.findElements(By.tagName("same_old_path"));           // now this list to save the student after the delete
		int actual = theStudentAfterRemove.size();                                                            //-----to save the value after the delete
		
		int expected = theTotalNumberOfStudents - howManyDeletion ;                             
		
		Assert.assertEquals(actual, expected);
		
		
	}

}
