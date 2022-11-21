package org.steps;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;

	public void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();

	}

	public void windowH() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();

		for (String x : child) {
			if (!parent.equals(child)) {
				driver.switchTo().window(x);
				System.out.println("window swiched");
			}
		}

	}

	public void insertText(WebElement element, String value) {

		element.sendKeys(value);
	}

	public String getvalue(WebElement element) {
		String text = element.getText();
		return text;

	}

	public void insertTextjs(WebElement element, String value) {

		element.sendKeys(value, Keys.ENTER);
	}

	public void Actions(String value) {

		Actions ac = new Actions(driver);

		ac.sendKeys(value).build().perform();
	}

	public void scrollDown(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

}
