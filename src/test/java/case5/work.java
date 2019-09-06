package case5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class work {
	WebDriver driver;
	@Given("home page")
	public void home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Sulthan\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/");
        driver.manage().window().maximize();

	}

	@When("user enters product name {string}")
	public void user_enters_product_name(String string) {
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);

	}

	@When("user clicks find element")
	public void user_clicks_find_element() {
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("user clicks add to cart")
	public void user_clicks_add_to_cart() {
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		 Assert.assertEquals(driver.getTitle(),"Login");
	}



}
