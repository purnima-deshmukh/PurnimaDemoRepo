import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passengersDropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
	}
}