package ebankingPracticePage;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ebankingLoginPage.EBankingBasePage;

public class EBankingLogoutPage extends EBankingBasePage {
	private static final Logger logger=Logger.getLogger(EBankingLogoutPage.class.getName());
	
	@FindBy(xpath="//a[text()='Log out']")
	protected WebElement lnkLogout;
	
	public EBankingLogoutPage(WebDriver driver) {
		super(driver);
		logger.info("Starting of EBankingLogoutPage constructor");
		logger.info("Ending of EBankingLogoutPage constructor");
	}
	
	public void clickOnLogoutLink()
	{
		logger.info("Starting of clickOnLogoutLink method");
		lnkLogout.click();
		driver.switchTo().alert().accept();
		logger.info("Ending of clickOnLogoutLink method");
	}

}
