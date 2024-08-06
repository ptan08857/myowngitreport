package utilities;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserUtil {
	
	public static void quitDriver(RemoteWebDriver driver) {
		driver.quit();
	}
	
	public static RemoteWebDriver getDriver() {
		//String browser=null;
		String browser=System.getProperty("browsername");
		System.out.println("Browser value:="+browser);
		Logger log=LoggerUtil.getLogger("BrowserUtil.getDriver()");
		log.debug("Browser value:="+browser);
		if(browser==null) {
			browser="chrome";
		}
		
		RemoteWebDriver driver;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		log.debug("Return the driver object");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		return driver;
	}

}
