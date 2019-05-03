import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllUIElements 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions c_options = new ChromeOptions();
		c_options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilredij//Lalkunwar//Java Docs//selenium_jar_files//chromedriver");
		WebDriver chrome = new ChromeDriver(c_options);
		
		chrome.get("https://www.cleartrip.com/");
		//Thread.sleep(1000);
		
		//chrome.switchTo().alert().dismiss();
		
		chrome.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("new");
		Thread.sleep(4000);
		chrome.findElement(By.xpath("//input[@id='FromTag']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		chrome.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("bang");
		Thread.sleep(4000);
		//chrome.findElement(By.xpath("//input[@id='ToTag']")).sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(2000);
		chrome.findElement(By.xpath("//input[@id='ToTag']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		chrome.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		Select adult = new Select(chrome.findElement(By.xpath("//select[@id='Adults']")));
		adult.selectByVisibleText("2");
		Select kids = new Select(chrome.findElement(By.xpath("//select[@id='Childrens']")));
		kids.selectByVisibleText("3");
		Select infants = new Select(chrome.findElement(By.xpath("//select[@id='Infants']")));
		infants.selectByVisibleText("0");
		Thread.sleep(1000);
		chrome.findElement(By.xpath(" //input[@id='SearchBtn']")).click();
		Thread.sleep(1000);
		//chrome.close();
		

	}

}
