package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlazeHomePage {
	//Driver and it's initilazation
	RemoteWebDriver driver;
	
	public DemoBlazeHomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//Element Locators
	By linkLogin=By.xpath("//a[@id='login2']");
	By linkLaptops=By.xpath("//a[text()='Laptops']");
	By linkLogout=By.id("logout2");
	
	//Page functionality
	public void clickOnLoginLink() {
		
		driver.findElement(linkLogin).click();
	}
	
	public void clickOnLaptopsLink() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkLaptops));
		driver.findElement(linkLaptops).click();
	}

	public boolean isLogoutLinkDisplayed() {
		return driver.findElement(linkLogout).isDisplayed();
	}
}
