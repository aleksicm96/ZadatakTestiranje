

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testiranje {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/milos/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		String URL = "http://automationpractice.com/index.php";
		driver.get(URL);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("BEST SELLERS")).click();
		
		WebElement treciProizvod=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[2]/li[3]/div/div[1]/div/a[1]/img"));
		Actions actions = new Actions(driver);
		actions.moveToElement(treciProizvod).click().perform();
		
		driver.findElement(By.id("color_8")).click();
		
		WebElement velicina = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select"));
		Select oznacenaVelicina = new Select(velicina);
		oznacenaVelicina.selectByVisibleText("L");
		
		driver.findElement(By.id("add_to_cart")).click();;
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[2]")).clear();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[2]")).sendKeys("4");
			
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("larocos834@jentrix.com");
		driver.findElement(By.id("passwd")).sendKeys("Aleksic199");
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.name("processAddress")).click();
		
		driver.findElement(By.id("cgv")).click();
		
		driver.findElement(By.name("processCarrier")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();			
	}
}
