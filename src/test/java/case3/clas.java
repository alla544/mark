package case3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class clas {
	WebDriver driver;
	@Given("user logins")
	public void user_logins() {
		System.setProperty("webdriver.chrome.driver","C:\\Sulthan\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Lalitha");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	
	}

	@When("user clicks search bar")
	public void user_clicks_search_bar() {
driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	}

	@Then("user searches an {string}")
	public void user_searches_an(String string) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);

	}

	@Then("he found details")
	public void he_found_details() {
driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}



}
