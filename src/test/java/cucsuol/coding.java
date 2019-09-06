package cucsuol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class coding {
	WebDriver driver;
	@Given("TestMeApp home page displayed")
	public void testmeapp_home_page_displayed() {
		System.setProperty("webdriver.chrome.driver","C:\\Sulthan\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/");
           driver.manage().window().maximize();
	}

	@Given("user clicks on signup")
	public void user_clicks_on_signup() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

    @When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
		driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@Then("user enetrs password as {string}")
	public void user_enetrs_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
	}

	@Then("user clicks gender as {string}")
	public void user_clicks_gender_as(String string) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@Then("user enters emailid as {string}")
	public void user_enters_emailid_as(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys(string);
	}

	@Then("user enters mobile no as {string}")
	public void user_enters_mobile_no_as(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@Then("user enters dob as {string}")
	public void user_enters_dob_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string);;
	}

	@Then("user enters address as {string}")
	public void user_enters_address_as(String string) {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string);
	}

	@Then("user selects security qn as {string}")
	public void user_selects_security_qn_as(String string) {
		WebElement ques = driver.findElement(By.xpath("//select[@name='securityQuestion']"));
		Select sel=new Select(ques);
		     sel.selectByVisibleText("What is your Birth Place?");
	}

	@Then("user enters answer as {string}")
	public void user_enters_answer_as(String string) {
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys(string);
	}
	@And("user clicks on register")
	public void user_clicks_on_register() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	     System.out.println("Registration succesfull");
	}
	
}
