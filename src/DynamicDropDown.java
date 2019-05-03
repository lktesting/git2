import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown 
{

	public static void main(String[] args) throws InterruptedException
	{
		// on spice jet site the arrival city dropdown will appear only when departure city is selected
		
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilredij//Lalkunwar//Java Docs//selenium_jar_files//chromedriver");
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		chrome.findElement(By.xpath("//a[@value='AMD']")).click();
		chrome.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Bhopal (BHO)')]")).click();;
		
		
		chrome.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		chrome.close();
	
	}

}
