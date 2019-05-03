import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilredij//Lalkunwar//Java Docs//selenium_jar_files//chromedriver");
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("http://qaclickacademy.com/practice.php");
		WebElement option = chrome.findElement(By.xpath("//input[@value='option1']"));
		option.click();
		Assert.assertTrue(option.isSelected());
		System.out.println("test case pass");
		
		option.click();
		Assert.assertFalse(option.isSelected());
		System.out.println("test case pass");
		
		int size = chrome.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(size);
		
		chrome.close();

	}

}
