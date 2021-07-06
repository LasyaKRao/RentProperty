package nobroker.RentProperty.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertyPage {
	public WebDriver driver;
	
	By wrongInfoBtn = By.xpath("//*[text()='Wrong Info'][1]");
	By enterPhoneNo = By.xpath("//input[@id='signUp-phoneNumber']");
	By pwdRadioBtn = By.xpath("//input[@id='login-signup-form-login-radio-password']");
	By pwdTextbox = By.xpath("//input[@id='login-signup-form__password-input']");
	By submit = By.xpath("//button[@class='btn btn-primary'][@type='submit']");
	By bhkType = By.xpath("//div[@class='nb__2TrE4']/div[4]/div[2]");
	By reportBtn = By.xpath("//button[contains(text(),'Report')]");
	By configDropdwn = By.xpath("//div[text()='2 BHK']");
	By configuration = By.xpath("//div[text()='3 BHK']");
	By verificationMsg = By.xpath("//div[@class='nb__31KUz']/div[1]/p[1]");
	By saveChanges = By.xpath("//button[contains(text(),'Save Changes')]");
	
	public PropertyPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement WrongInfo() {
		return driver.findElement(wrongInfoBtn);
	}
	public WebElement phoneNumberTextBox() {
		return driver.findElement(enterPhoneNo);
	}
	public WebElement selectPasswordRadioBtn() {
		return driver.findElement(pwdRadioBtn);
	}
	public WebElement passwordTextbox() {
		return driver.findElement(pwdTextbox);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	public WebElement selectBhkType() {
		return driver.findElement(bhkType);
	}
	public WebElement reportButton() {
		return driver.findElement(reportBtn);
	}
	public WebElement ConfigDrpdwn() {
		return driver.findElement(configDropdwn);
	}
	public WebElement selectConfiguration() {
		return driver.findElement(configuration);
	}
	public WebElement verifyMsg() {
		return driver.findElement(verificationMsg);
	}
	public WebElement saveChangesBtn() {
		return driver.findElement(saveChanges);
	}
	
}
