import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilredij//Lalkunwar//Java Docs//selenium_jar_files//chromedriver");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
		
		//use Select class for selecting from static dropdown boxes
		Thread.sleep(2000);
	
		//in rediff day/ month/ year dropdwn boxes keep changing their html code
		
		Select selectDay = new Select(chrome.findElement(By.xpath("//select[contains(@name,'DOB_D')]")));
		selectDay.selectByValue("09");
		
		Select selectMonth = new Select(chrome.findElement(By.xpath("//select[contains(@name,'DOB_M')]")));
		selectMonth.selectByIndex(10);

		Select selectYear = new Select(chrome.findElement(By.xpath("//select[contains(@name,'DOB_Y')]")));
		selectYear.selectByVisibleText("1988");
		
		//chrome.close();

	}

}
