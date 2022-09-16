package ebankingLoginPage;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EBankingLoginPage extends EBankingBasePage {
	
	private static final Logger logger=Logger.getLogger(EBankingLoginPage.class.getName());

	@FindBy(xpath="//input[@name='uid']")
	protected WebElement txtUserId;
	
	@FindBy(xpath="//input[@name='password']")
	protected WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	protected WebElement btnLogin;
	
	@FindBy(xpath="//input[@name='btnReset']")
	protected WebElement btnReset;
	
	public EBankingLoginPage(WebDriver driver) {
		super(driver);
		logger.info("Starting of EBankingLoginPage constructor");
		logger.info("Ending of EBankingLoginPage constructor");

	}
	
	public void setUserIdText(String uId)
	{
		logger.info("Started of setUserIdText method ");
		txtUserId.sendKeys(uId);
		logger.info("Ending of setUserIdText method ");

	}
	
	public void setPasswordText(String pwd)
	{
		logger.info("Started of setPasswordText method ");
		txtPassword.sendKeys(pwd);
		logger.info("Ending of setPasswordText method ");

	}
	
	public void clickOnLoginButton()
	{
		logger.info("Started of clickOnLoginButton method ");
		btnLogin.click();
		logger.info("Ending of clickOnLoginButton method ");

	}
	
	public void clickOnResetButton()
	{
		logger.info("Started of clickOnResetButton method ");
		btnReset.click();
		logger.info("Ending of clickOnResetButton method ");

	}
	

}
