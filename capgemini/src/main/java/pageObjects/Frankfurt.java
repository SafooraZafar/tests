package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frankfurt {
	
	public static WebElement country(WebDriver driver) {
		return driver.findElement(By.linkText("DE"));
	}

	public static WebElement latitude(WebDriver driver) {
		return driver.findElement(By.linkText("50.1072"));
	}
	
	public static WebElement longitude(WebDriver driver) {
		return driver.findElement(By.linkText("8.66375"));
	}
	
	public static WebElement usernameField(WebDriver driver) {
		return driver.findElement(By.id("systemUser_userName"));
	}
	
	public static WebElement saveButton(WebDriver driver) {
		return driver.findElement(By.name("btnSave"));
	}
}
