package com.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.steps.CommonActions;

public class BaseClass extends CommonActions {

	public void simple() {

		PageFactory.initElements(driver, this);

	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getBuy() {
		return buy;
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement search;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement login;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	private WebElement buy;

}
