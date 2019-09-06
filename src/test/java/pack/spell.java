package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class spell {
	WebDriver driver;
        @When("user gives {string}")
	public void user_gives(String string) {
			System.setProperty("webdriver.chrome.driver","C:\\Sulthan\\Drivers\\chromedriver.exe");
			   driver=new ChromeDriver();
			   driver.get("http://10.232.237.143:443/TestMeApp/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
	    
	}

	@Then("users gives {string}")
	public void users_gives(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

@Given("login page is displayed")
public void login_page_is_displayed() {
System.out.println("login is displayed");
}



}
