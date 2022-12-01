package ebankingLoginTest;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import ebankingLoginPage.EBankingLoginPage;
import ebankingPracticePage.EBankingLogoutPage;

public class EBankingLoginTest extends EBankingBaseTest{
	private static Logger logger=Logger.getLogger("EBankingLoginTest.class.getName()");
	EBankingLoginPage loginPage;
	EBankingLogoutPage logOutPage;
	public EBankingLoginTest()
	{
		super();
		logger.info("Starting of EBankingLoginTest constructor");
		logger.info("Ending of EBankingLoginTest constructor");
	}
	
	@Parameters({"managerid","password"})
	@Test(priority=2)
	public void testLoginWithValidUserIdAndPassword(String userId,String password)
	{
		logger.info("Starting of testLoginWithValidUserIdAndPassword method");
		try {
			loginPage=new EBankingLoginPage(driver);
			loginPage.setUserIdText(userId);
			loginPage.setPasswordText(password);
			loginPage.clickOnLoginButton();
			
		}
		catch(Exception e)
		{
			Assert.fail("Exception while testing testLoginWithValidUserIdAndPassword:" + e.getStackTrace());
		}
		logger.info("Starting of testLoginWithValidUserIdAndPassword method");

	}
	
	@Parameters({"Invalidmanagerid","Invalidpassword"})
	@Test(priority=1)
	public void testResetUserIdAndpassword(String uid,String password)
	{
		logger.info("Starting of testResetUserIdAndpassword method");
		try {
			loginPage=new EBankingLoginPage(driver);
			loginPage.setUserIdText(uid);
			loginPage.setPasswordText(password);
			loginPage.clickOnResetButton();
			
		}
		catch(Exception e)
		{
			Assert.fail("Exception while testing testResetUserIdAndpassword:" + e.getStackTrace());
		}
		logger.info("Starting of testResetUserIdAndpassword method");
		
	}
	
	@Test(priority=3)
	public void testLogoutFromAccount()
	{
		logger.info("Starting of testLogoutFromAccount method");
		
		try {
			logOutPage=new EBankingLogoutPage(driver);
			logOutPage.clickOnLogoutLink();
			
		}
		catch(Exception e) {
			Assert.fail("Exception accured white testing testLogoutFromAccount:" + e.getMessage());
			
		}
		logger.info("Ending of testLogoutFromAccount method");

	}

}
