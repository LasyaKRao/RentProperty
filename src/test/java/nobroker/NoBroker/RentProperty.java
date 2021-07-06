package nobroker.NoBroker;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import nobroker.RentProperty.pages.PropertyListingPage;
import nobroker.RentProperty.pages.PropertyPage;
import nobroker.RentProperty.pages.SearchPage;

public class RentProperty {

	@Test
	public void verifyAbuseReport_RentProperty() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\NoBrokerAssignment\\NoBroker\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		SearchPage sp = new SearchPage(driver);
		sp.rentTab().click();
		sp.locationDrpDown().click();
		sp.selectLocation().click();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("HSR");
		sp.selectLocality().click();
		sp.BHKType().click();
		sp.selectBhk().click();
		sp.SearchButton().click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1200)");

		PropertyListingPage pl = new PropertyListingPage(driver);
		pl.selectProperty().click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		it.next();
		driver.switchTo().window(it.next());
		
		PropertyPage pp = new PropertyPage(driver);
		pp.WrongInfo().click();
		pp.phoneNumberTextBox().sendKeys("1237567899");
		Thread.sleep(2000);
		pp.selectPasswordRadioBtn().click();
		pp.passwordTextbox().sendKeys("nobroker123");
		pp.submit().click();
		pp.selectBhkType().click();
		pp.reportButton().click();
		pp.ConfigDrpdwn().click();
		pp.selectConfiguration().click();
		String msg = pp.verifyMsg().getText();
		Assert.assertEquals(msg, "Thank you for the feedback");
		pp.saveChangesBtn().click();

		driver.quit();
	}
	
}
