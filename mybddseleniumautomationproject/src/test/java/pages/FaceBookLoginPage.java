package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilities.WebActions;

public class FaceBookLoginPage {
	
	RemoteWebDriver driver;
	
	public FaceBookLoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//1. Locators of the page
	//2. Operations that are supported by the page
	
	//Locators that required for the test cases needs to be defined as below
	By inputEmail=By.id("email");
	By inputPassword=By.id("pass");
	By buttonLogin=By.name("login");
	By linkForgotPassword=By.xpath("//a[text()='Forgotten password?']");
	
	
	public void clickForgotPasswordLink() {
		//driver.findElement(linkForgotPassword).click();
		WebActions.click(driver, linkForgotPassword);
	}
	
	public void setEmailId(String emailId) {
		//driver.findElement(inputEmail).sendKeys(emailId);
		WebActions.setText(driver, inputEmail, emailId);
	}

	public void setPassword(String password) {
		//driver.findElement(inputPassword).sendKeys(password);
		WebActions.setText(driver, inputPassword, password);
	}
	
	public void clickLoginButton() {
		//driver.findElement(buttonLogin).click();
		WebActions.click(driver, buttonLogin);
	}
	
	public void login(String emailId,String password) {
		this.setEmailId(emailId);
		this.setPassword(password);
		//Additional step over here
		this.clickLoginButton();
	}
}
