package nobroker.RentProperty.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertyListingPage {
	public WebDriver driver;
	By selectProperty = By.xpath("//div[@class='infinite-scroll-component__outerdiv']/div/div[3]/div/div[2]/div/div/a");
	
	
	
	public PropertyListingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement selectProperty() {
		return driver.findElement(selectProperty);
	}
	
	
	
}
