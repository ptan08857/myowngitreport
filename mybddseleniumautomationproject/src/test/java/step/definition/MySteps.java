package step.definition;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoBlazeHomePage;
import pages.DemoBlazeLoginPage;
import utilities.BrowserUtil;
import utilities.WebActions;

public class MySteps {
	RemoteWebDriver driver;
	
	@Given("user opened the browser")
	public void user_opened_the_browser() {
	   driver=BrowserUtil.getDriver();
	}

	@When("user navigated to DemoBlaze Application URL")
	public void user_navigated_to_demo_blaze_application_url() {
	   WebActions.openUrl(driver, "https://www.demoblaze.com/index.html");
	}

	@When("clicks on Login link")
	public void clicks_on_login_link() {
	   DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
	   homePage.clickOnLoginLink();
	}

	@When("user enters user name {string} and password as {string}")
	public void user_enters_user_name_and_password_as(String userName, String password) {
	    DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
	    loginPage.setUserName(userName);
	    loginPage.setPassword(password);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		 DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		 loginPage.clickLoginButton();
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
		 DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
		 boolean flag=homePage.isLogoutLinkDisplayed();
		 Assert.assertEquals(flag, true);
	}
	
	@Then("error popup is displayed")
	public void errorPopupDisplayed() {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		boolean flag=loginPage.isAlertPresent();
		Assert.assertEquals(flag, true);
	}


}
