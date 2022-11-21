package org.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions {
	CommonActions c = new CommonActions();

	@Before
	public void before() {

		launch("https://www.flipkart.com/");

	}

	@After
	public void after() {
		driver.quit();
	}

}
