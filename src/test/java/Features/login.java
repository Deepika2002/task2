package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver; 

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/deepika/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	    driver= new ChromeDriver();					
	    driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
	}

	@When("User navigate to Login Page")
	public void user_navigate_to_login_page() {
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
	}

	@Then("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        WebElement emailField = driver.findElement(By.id("Email"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
    }

	@Then("Keeping case as Valid")
	public void keeping_case_as_valid() {
		
	}

	@Then("User should get logged in")
	public void user_should_get_logged_in() {
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        loginButton.click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		 WebElement logoutLink = driver.findElement(By.linkText("Log out"));
	        assert(logoutLink.isDisplayed());
	        driver.quit();
	}

	@Then("Keeping case as Invalid")
	public void keeping_case_as_invalid() {
		
	}
}
