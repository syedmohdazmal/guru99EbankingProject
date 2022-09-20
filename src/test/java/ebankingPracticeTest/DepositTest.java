package ebankingPracticeTest;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ebankingLoginPage.EBankingLoginPage;
import ebankingLoginTest.EBankingBaseTest;
import ebankingPracticePage.DepositPage;

public class DepositTest extends EBankingBaseTest {
	private static final Logger logger=Logger.getLogger(DepositTest.class.getName());
	protected EBankingLoginPage loginPage;
	protected DepositPage depositPage;
	public DepositTest()
	{
		super();
		logger.info("Starting of DepositTest constructor");
		logger.info("Ending of DepositTest constructor");
	}
	
	@Parameters({"managerid","password"})
	@Test(priority=1)
	public void testDepositWithInvalidData(String mid,String password)
	{
		logger.info("Starting of testDepositWithInvalidData constructor");
		try {
			loginPage=new EBankingLoginPage(driver);
			depositPage=new DepositPage(driver);
			
			loginPage.setUserIdText(mid);
			loginPage.setPasswordText(password);
			loginPage.clickOnLoginButton();
			
			depositPage.clickOnDepositLink();
			depositPage.setAccoutNumber(testData.getProperty("Invalid_accountID"));
			depositPage.setAmmount(testData.getProperty("amount"));
			depositPage.setDescription("description");
			depositPage.clickOnSubmitButton2();
			driver.navigate().back();
			depositPage.clickOnResetButton2();
			
		}
		catch(Exception e) {
			Assert.fail("Exception while testing testDepositWithInvalidData:" + e.getMessage());
		}
		logger.info("Ending of testDepositWithInvalidData constructor");
	}
	
	
	@Test(priority=1)
	public void testDepositWithValidData()
	{
		logger.info("Starting of testDepositWithValidData constructor");
		try {
			depositPage.setAccoutNumber(testData.getProperty("accountID"));
			depositPage.setAmmount(testData.getProperty("amount"));
			depositPage.setDescription("description");
			depositPage.clickOnSubmitButton2();
			
		}
		catch(Exception e) {
			Assert.fail("Exception while testing testDepositWithValidData:" + e.getMessage());
		}
		logger.info("Ending of testDepositWithValidData constructor");
	}
}
