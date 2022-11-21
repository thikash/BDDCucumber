
package com.steps;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.steps.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TVStepsDefinition {

	public class tvpurchase extends CommonActions {
		CommonActions comm = new CommonActions();
		BaseClass t = new BaseClass();

		@Given("user login into flipkarttv")
		public void user_login_into_flipkarttv() {

			try {

				t.getLogin().click();

			} catch (Exception e) {
				System.out.println("login not required");
			}
		}

		String names;

		@When("user search required tv")
		public void user_search_required_tv() {

			names = "MITV";

			WebElement element1 = t.getSearch();

			comm.insertTextjs(element1, names);

		}

		@When("user select required  tv")
		public void user_select_required_tv() {

			comm.windowH();
		}

		@When("user search required tv by using oneD list")
		public void user_search_required_tv_by_using_oneD_list(DataTable dataTable) {
			List<String> data = dataTable.asList();

			names = data.get(2);

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(names, Keys.ENTER);

		}

		@When("user search required tv by using oneD map")
		public void user_search_required_tv_by_using_oneD_map(DataTable dataTable) {
			Map<String, String> data1 = dataTable.asMap(String.class, String.class);

			names = data1.get("TV2");

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(names, Keys.ENTER);
		}

		@When("user search required tv {string}")
		public void user_search_required_tv(String string) {

			names = string;

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(names, Keys.ENTER);

		}
	}
}
