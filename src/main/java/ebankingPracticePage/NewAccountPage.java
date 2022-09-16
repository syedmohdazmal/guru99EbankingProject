package ebankingPracticePage;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ebankingLoginPage.EBankingBasePage;

public class NewAccountPage extends EBankingBasePage {
	private static Logger logger=Logger.getLogger("NewAccountPage.class.getName()");

	@FindBy(xpath="//a[text()='New Account']")
	protected WebElement lnkNewAccount;
	
	@FindBy(xpath="//input[@name='cusid']")
	protected WebElement txtCustId;
	
	@FindBy(xpath="//select[@name='selaccount']")
	protected WebElement selectAccountType;
	
	@FindBy(xpath="//input[@name='inideposit']")
	protected WebElement txtInitialDeposit;
	
	@FindBy(xpath="//input[@name='button2']")
	protected WebElement btnSubmit2;
	
	@FindBy(xpath="//input[@name='reset']")
	protected WebElement btnReset2;
	
	@FindBy(xpath="//label[@id='message14']")
	protected WebElement lblMessage10;
	
	
	
	public NewAccountPage(WebDriver driver) {
		super(driver);
		logger.info("Starting of NewAccountPage constructor");
		logger.info("Ending of NewAccountPage constructor");
	}
	
	public void clickOnNewAccountLink()
	{
		logger.info("Starting of clickOnNewAccountLink method");
		lnkNewAccount.click();
		logger.info("Ending of clickOnNewAccountLink method");
	}
	
	public void setCustomerId(String cid)
	{
		logger.info("Starting of setCustomerId method");
		txtCustId.sendKeys(cid);
		logger.info("Ending of setCustomerId method");
	}
	
	public void selectAccountType()
	{
		logger.info("Starting of selectAccountType method");
		selectDropDown(selectAccountType);
		logger.info("Ending of selectAccountType method");
	}
	
	public void setInitialDeposit(String initialDep)
	{
		logger.info("Starting of setInitialDeposit method");
		txtInitialDeposit.sendKeys(initialDep);
		logger.info("Ending of setInitialDeposit method");
	}
	
	public void clickOnSubmitButton2()
	{
		logger.info("Starting of clickOnSubmitButton2 method");
		btnSubmit2.click();
		logger.info("Ending of clickOnSubmitButton2 method");
	}
	
	public void clickOnResetButton2()
	{
		logger.info("Starting of clickOnResetButton2 method");
		btnReset2.click();
		logger.info("Ending of clickOnResetButton2 method");
	}
	
	public void alertOK()
	{
		logger.info("Starting of alertMethod method");
		driver.switchTo().alert().accept();
		logger.info("Starting of alertMethod method");
	}
	
	public String getMessage10()
	{
		logger.info("Starting of getMessage10 method");
		logger.info("Ending of getMessage10 method");
		return lblMessage10.getText();
	}

}
