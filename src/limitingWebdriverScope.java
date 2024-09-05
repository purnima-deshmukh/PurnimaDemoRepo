import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitingWebdriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//gives the count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting scope to footer and count the links present in footer only
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
	
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//limiting scope to column and count the links present in the 1st column of footer
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//opening each link in new tab
		for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink = Keys.chord(Keys.COMMAND, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		}
		
	}
}
	