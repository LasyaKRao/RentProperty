package nobroker.RentProperty.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public WebDriver driver;
	By rent = By.xpath("//button[@id='rentSelector']");
	By locDropdown = By.xpath("//div[@id='nbCitySelector']");
	By selectLoc = By.linkText("Bangalore");
	By selectLocality = By.xpath("//*[text()='HSR Layout']");
	By clickBHktype =  By.id("nbBHKSelector");
	By selctBhk = By.cssSelector("#bhk2");
	By searchBtn = By.xpath("//span[@id='searchButtonHomePage']");
	
	public SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement rentTab() {
		return driver.findElement(rent);
	}
	
	public WebElement locationDrpDown() {
		return driver.findElement(locDropdown);
	}
	
	public WebElement selectLocation() {
		return driver.findElement(selectLoc);
	}
	public WebElement selectLocality() {
		return driver.findElement(selectLocality);
	}
	public WebElement BHKType() {
		return driver.findElement(clickBHktype);
	}
	public WebElement selectBhk() {
		return driver.findElement(selctBhk);
	}
	
	public WebElement SearchButton() {
		return driver.findElement(searchBtn);
	}
	
}
