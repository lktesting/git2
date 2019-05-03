import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveMakeMyTrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilredij//Lalkunwar//Java Docs//selenium_jar_files//chromedriver");
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.makemytrip.com");
		//String s = chrome.getWindowHandle();
		//System.out.println(s);
		
		
		//chrome.findElement(By.xpath("//button[@class='button close']")).click();
		//WebElement e = chrome.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
		
		//e.sendKeys("mum");
		
		//chrome.findElement(By.xpath("button[@id='deny']")).click();
		
		//WebElement bell = chrome.findElement(By.id("webpush-bubble"));
		//System.out.println(bell.getText());
		Thread.sleep(2000);
		
		//WebElement e = chrome.findElement(By.xpath("//input[@placeholder='From']"));
		//chrome.switchTo().window(s);
		//e.sendKeys("mum");
		
		List<WebElement> inputs = chrome.findElements(By.tagName("button"));
		System.out.println(inputs.size());
		for(WebElement e : inputs)
		{
			System.out.println(e.getText());
		}
		
		WebElement e = chrome.findElement(By.xpath("//div[@class='button-group-custom clearfix']"));
		System.out.println(e.getText());
		//chrome.close();

	}

}
