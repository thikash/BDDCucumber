package org.steps;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileStepsDefinition {

	public static WebDriver driver;

	@Given("user close the login page in flipKart")
	public void user_close_the_login_page_in_flipKart() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();

		try {
			WebElement login = driver.findElement(By.xpath("//button[text()='✕']"));
			login.isDisplayed();
			login.click();
		} catch (Exception e) {
			System.out.println("Login page is not displayed");
		}

	}

	String mob;

	@When("user search the mobile")

	public void user_search_the_mobile() {
		mob = "Redmi";
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(mob, Keys.ENTER);

	}

	@And("user select required mobile")
	public void user_select_required_mobile() {

	}

	@When("user select payment method in UPI")
	public void user_select_payment_method_in_UPI() {

	}

	@Then("user got the confirmation")
	public void user_got_the_confirmation() {

	}

	@When("user search the mobile one dimensional list")
	public void user_search_the_mobile_one_dimensional_list(DataTable listTable) {
		List<String> data = listTable.asList();
		mob = data.get(0);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(mob, Keys.ENTER);

	}

	@When("user search the mobile two dimensional map")
	public void user_search_the_mobile_two_dimensional_map(DataTable mapTable) {
		Map<String, String> m = mapTable.asMap(String.class, String.class);
		mob = m.get("mob3");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(mob, Keys.ENTER);

	}

	@When("user search the mobile {string}")
	public void user_search_the_mobile(String phone) {
		mob = phone;
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(mob, Keys.ENTER);

	}

}
