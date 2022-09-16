package ebankingPracticePage;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ebankingLoginPage.EBankingBasePage;
import ebankingLoginPage.EBankingLoginPage;

public class AddNewCustomerPage extends EBankingBasePage {
	private static final Logger logger=Logger.getLogger(AddNewCustomerPage.class.getName());

	@FindBy(xpath="//a[text()='New Customer']")
	protected WebElement lnkNewCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	protected WebElement txtCutomerName;
	
	@FindBy(xpath="//input[@id='dob']")
	protected WebElement txtDob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	protected WebElement txtAddress;
	
	@FindBy(xpath="//input[@name='city']")
	protected WebElement txtCity;
	
	@FindBy(xpath="//input[@name='state']")
	protected WebElement txtState;
	
	@FindBy(xpath="//input[@name='pinno']")
	protected WebElement txtPinNo;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	protected WebElement txtMobileNumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	protected WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='password']")
	protected WebElement txtCustPassword;
	
	@FindBy(xpath="//input[@name='sub']")
	protected WebElement btnSubmit;
	
	@FindBy(xpath="//input[@name='res']")
	protected WebElement btnResetDetails;
	
	public AddNewCustomerPage(WebDriver driver) {
		super(driver);
		logger.info("Starting of AddNewCustomerPage constructor");
		logger.info("Ending of AddNewCustomerPage constructor");

	}
	
	public void clickOnNewCustomerLink()
	{
		logger.info("Starting of clickOnNewCustomerLink method ");
		lnkNewCustomer.click();
		logger.info("Ending of clickOnNewCustomerLink method ");
	}
	
	public void setCustomerName(String cname)
	{
		logger.info("Starting of setCustomerName method ");
		txtCutomerName.sendKeys(cname);
		logger.info("Ending of setCustomerName method ");

	}
	
	public void setDateOfBirth(String dob)
	{
		logger.info("Starting of setDateOfBirth method ");
		txtDob.sendKeys(dob);
		logger.info("Ending of setDateOfBirth method ");
	}
	
	public void setAddress(String addr)
	{
		logger.info("Starting of setAddress method ");
		txtAddress.sendKeys(addr);
		logger.info("Ending of setAddress method ");
	}
	
	public void setCity(String city)
	{
		logger.info("Starting of setCity method ");
		txtCity.sendKeys(city);
		logger.info("Ending of setCity method ");
	}
	

		public void setState(String state)
	{
		logger.info("Starting of setState method ");
		txtState.sendKeys(state);
		logger.info("Ending of setState method ");
	}
		
		public void setPinNo(String pin)
	{
		logger.info("Starting of setPinNo method ");
		txtPinNo.sendKeys(pin);
		logger.info("Ending of setPinNo method ");
	}
		
		public void setMobileNumber(String mobile)
	{
		logger.info("Starting of setMobileNumber method ");
		txtMobileNumber.sendKeys(mobile);
		logger.info("Ending of setMobileNumber method ");
	}
		
		public void setEmail(String email)
	{
		logger.info("Starting of setEmail method ");
		txtEmail.sendKeys(email);
		logger.info("Ending of setEmail method ");
	}
		
		public void setCustomerPassword(String pwd)
	{
		logger.info("Starting of setCustomerPassword method ");
		txtCustPassword.sendKeys(pwd);
		logger.info("Ending of setCustomerPassword method ");
	}
		
		public void clickOnSubmitButton()
		{
			logger.info("Starting of clickOnSubmitButton method ");
			btnSubmit.click();
			logger.info("Ending of clickOnSubmitButton method ");
		}
		
		public void clickOnResetCustDetailsButton()
		{
			logger.info("Starting of clickOnResetCustDetailsButton method ");
			btnResetDetails.click();
			logger.info("Ending of clickOnResetCustDetailsButton method ");
		}
	
	

}
