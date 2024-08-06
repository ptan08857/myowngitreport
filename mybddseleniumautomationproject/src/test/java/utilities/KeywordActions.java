package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class KeywordActions {
	RemoteWebDriver driver;

	private By getLocator(String locatorType,String locatorValue) {
		By locator=null;
		switch(locatorType) {
		case "id":
			return By.id(locatorValue);
		case "name":
			return By.name(locatorValue);
		case "xpath":
			return By.xpath(locatorValue);
		case "css":
			return By.cssSelector(locatorValue);
		case "className":
			return By.className(locatorValue);
		}
		
		return locator;
	}
	
	

	public void performOperation(String action,String locatorType,String locatorValue,String data) throws Exception {

		switch(action) {
		case "openBrowser":
			driver=BrowserUtil.getDriver();
			break;
		case "openUrl":
//			driver.navigate().to(data);
			WebActions.openUrl(driver, data);
			break;
		case "setText":
//			driver.findElement(getLocator(locatorType, locatorValue)).sendKeys(data);
			WebActions.setText(driver, getLocator(locatorType, locatorValue), data);
			break;
		case "click":
//			driver.findElement(getLocator(locatorType, locatorValue)).click();
			WebActions.click(driver, getLocator(locatorType, locatorValue));
			break;
		case "wait":
			Reporter.log("Wait - "+data,true);
			Thread.sleep(Long.parseLong(data));
			break;
		case "verifyTitle":
//			String actualTitle=driver.getTitle();
			String actualTitle=WebActions.getTitle(driver);
			Assert.assertEquals(actualTitle, data);
			break;
		case "closeBrowser":
//			driver.quit();
			WebActions.closeBrowser(driver);
			break;
			
		
		default:
			throw new Exception("Keyword action is not defined in the framework.");
		}
	}

}
