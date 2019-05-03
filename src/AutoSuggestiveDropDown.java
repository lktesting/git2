import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilredij//Lalkunwar//Java Docs//selenium_jar_files//chromedriver");
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.trivago.in/");
		Thread.sleep(2000);
		
		WebElement e = chrome.findElement(By.xpath(" //input[@id='horus-querytext']"));
		
		e.sendKeys("mum");
		Thread.sleep(1000);
		e.sendKeys(Keys.ENTER);
		e.clear();
		e.sendKeys("beng");
		Thread.sleep(2000);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ENTER);
		
		//chrome.close();
		
		
		

	}

}
