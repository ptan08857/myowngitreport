package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FaceBookForgotPassword {
	
RemoteWebDriver driver;
	
	public FaceBookForgotPassword(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	By inputEmail=By.id("identify_email");
	By buttonSearch=By.id("did_submit");
	
	public void setEmail(String email) {
		driver.findElement(inputEmail).sendKeys(email);
	}
	
	public void clickSearchButton() {
		driver.findElement(buttonSearch).click();
	}

}
