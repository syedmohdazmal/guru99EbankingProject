package ebankingLoginTest;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import ebankingLoginPage.EBankingLoginPage;

public class EBankingLoginTest extends EBankingBaseTest{
	private static Logger logger=Logger.getLogger("EBankingLoginTest.class.getName()");
	EBankingLoginPage loginPage;
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

}
