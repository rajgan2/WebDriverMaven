import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning Java\\WebDriverMaven\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin(){
		
		//Test
		driver.get("https://www.zoho.eu/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='zh-login']")).click();
		driver.findElement(By.xpath("//input[@id='lid']")).sendKeys("rajgan2@gmail.com");;
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Mani@123");
		driver.findElement(By.xpath("//div[@id='signin_submit']")).click();
				
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.quit();
	}
	
}
