package ebankingPracticeTest;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ebankingLoginPage.EBankingLoginPage;
import ebankingLoginTest.EBankingBaseTest;
import ebankingPracticePage.NewAccountPage;

public class NewAccountTest extends EBankingBaseTest {
	private static final Logger logger = Logger.getLogger(NewAccountTest.class.getName());
	EBankingLoginPage loginPage;
	NewAccountPage newAccountPage;
	public NewAccountTest() {
		super();
		logger.info("Starting of NewAccountTest constructor");
		logger.info("Ending of NewAccountTest constructor");

	}
	@Parameters({"managerid","password"})
	@Test(priority=1)
	public void testNewAccountWithInvalidData(String mid,String password)
	{
		logger.info("Starting of testNewAccountWithInvalidData method ");
		try {
			loginPage=new EBankingLoginPage(driver);
			newAccountPage=new NewAccountPage(driver);
			
			loginPage.setUserIdText(mid);
			loginPage.setPasswordText(password);
			loginPage.clickOnLoginButton();
			newAccountPage.clickOnNewAccountLink();
			newAccountPage.setCustomerId(testData.getProperty("invalidcutomerID"));
			newAccountPage.selectAccountType();
			newAccountPage.setInitialDeposit(testData.getProperty("initial.invaliddepositAmt"));
			newAccountPage.clickOnSubmitButton2();
			newAccountPage.alertOK();
			newAccountPage.clickOnResetButton2();
			String actualMsg=newAccountPage.getMessage10();
			Assert.assertEquals(actualMsg, expectedAssertion.getProperty("message10"));
		}
		catch(Exception e)
		{
			Assert.fail("Exception occured while testing testNewAccountWithInvalidData:" + e.getStackTrace());
		}
		logger.info("Ending of testNewAccountWithInvalidData method ");

	}
	
	@Parameters({"managerid","password"})
	@Test(priority=2)
	public void testNewAccountWithValidData(String mid,String password)
	{
		logger.info("Starting of testNewAccountWithValidData method ");
		try {
			/*
			 * loginPage=new EBankingLoginPage(driver); newAccountPage=new
			 * NewAccountPage(driver);
			 * 
			 * loginPage.setUserIdText(mid); loginPage.setPasswordText(password);
			 * loginPage.clickOnLoginButton(); newAccountPage.clickOnNewAccountLink();
			 */
			newAccountPage.setCustomerId(testData.getProperty("cutomerID"));
			newAccountPage.selectAccountType();
			newAccountPage.setInitialDeposit(testData.getProperty("initial.depositAmt"));
			newAccountPage.clickOnSubmitButton2();
			newAccountPage.alertOK();
			
		}
		catch(Exception e)
		{
			Assert.fail("Exception occured while testing testNewAccountWithValidData:" + e.getStackTrace());
		}
		logger.info("Ending of testNewAccountWithValidData method ");

	}
}
