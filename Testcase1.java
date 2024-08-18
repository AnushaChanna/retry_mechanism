package retry_mechanism;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 
{
	@Test(retryAnalyzer=retry_mechanism.RetryLogic.class)
	public void amazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("twtabsearchtextbox"));
		search.sendKeys("shoe" + Keys.ENTER);
	}
	
	
}
