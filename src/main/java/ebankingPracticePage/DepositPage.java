package ebankingPracticePage;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ebankingLoginPage.EBankingBasePage;

public class DepositPage extends EBankingBasePage {
	private static Logger logger=Logger.getLogger(DepositPage.class.getName());
	
	
	@FindBy(xpath="//a[text()='Deposit']")
	protected WebElement lnkDeposit;
	
	@FindBy(xpath="//input[@name='accountno']")
	protected WebElement txtAccountNo2;
	
	@FindBy(xpath="//input[@name='ammount']")
	protected WebElement txtAmmount2;
	
	@FindBy(xpath="//input[@name='desc']")
	protected WebElement txtDesc;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	protected WebElement btnSubmit2;
	
	@FindBy(xpath="//input[@name='res']")
	protected WebElement btnReset2;

	public DepositPage(WebDriver driver) {
		super(driver);
		logger.info("Starting of DepositPage constructor");
		logger.info("Ending of DepositPage constructor");

	}
	
	public void clickOnDepositLink()
	{
		logger.info("Starting of clickOnDepositLink method");
		lnkDeposit.click();
		logger.info("Ending of clickOnDepositLink method");
	}
	
	public void setAccoutNumber(String accountNo)
	{
		logger.info("Starting of setAccoutNumber method");
		txtAccountNo2.sendKeys(accountNo);
		logger.info("Ending of setAccoutNumber method");
	}
	
	public void setAmmount(String ammount)
	{
		logger.info("Starting of setAmmount method");
		txtAmmount2.sendKeys(ammount);
		logger.info("Ending of setAmmount method");
	}
	
	public void setDescription(String desc)
	{
		logger.info("Starting of setDescription method");
		txtDesc.sendKeys(desc);
		logger.info("Ending of setDescription method");
	}
	
	public void clickOnSubmitButton2()
	{
		logger.info("Starting of clickOnSubmitButton method");
		btnSubmit2.click();
		logger.info("Ending of clickOnSubmitButton method");
	}
	
	public void clickOnResetButton2()
	{
		logger.info("Starting of clickOnResetButton2 method");
		btnReset2.click();
		logger.info("Ending of clickOnResetButton2 method");
	}

}
