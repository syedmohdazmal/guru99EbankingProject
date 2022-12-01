package ebankingPracticeTest;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ebankingLoginPage.EBankingLoginPage;
import ebankingLoginTest.EBankingBaseTest;
import ebankingPracticePage.AddNewCustomerPage;
import ebankingPracticePage.EBankingLogoutPage;

public class AddNewCustomerTest extends EBankingBaseTest {
	private static final Logger logger=Logger.getLogger(AddNewCustomerTest.class.getName());
	protected AddNewCustomerPage addNewCustomerPage;
	protected EBankingLoginPage loginPage;
	protected EBankingLogoutPage logOutPage;
	
	public AddNewCustomerTest()
{
	super();
}

@Parameters({"managerid","password"})
@Test(priority=1)
public void testAddNewCustomerFieldsWithValidDetails(String uid,String password)
{
	logger.info("Starting of testAddNewCustomerFieldsWithValidDetails method");
	
	try {
		loginPage=new EBankingLoginPage(driver);
		addNewCustomerPage=new AddNewCustomerPage(driver);
		
		loginPage.setUserIdText(uid);
		loginPage.setPasswordText(password);
		loginPage.clickOnLoginButton();
		addNewCustomerPage.clickOnNewCustomerLink();
		addNewCustomerPage.setCustomerName(testData.getProperty("customer.name"));
		addNewCustomerPage.setDateOfBirth(testData.getProperty("DateOfBirth"));
		addNewCustomerPage.setAddress(testData.getProperty("address"));
		addNewCustomerPage.setCity(testData.getProperty("city"));
		addNewCustomerPage.setState(testData.getProperty("state"));
		addNewCustomerPage.setPinNo(testData.getProperty("pin"));
		addNewCustomerPage.setMobileNumber(testData.getProperty("mobile.number"));
		addNewCustomerPage.setEmail(testData.getProperty("email"));
		addNewCustomerPage.setCustomerPassword(testData.getProperty("customer.password"));
		addNewCustomerPage.clickOnSubmitButton();
		driver.switchTo().alert().accept();
		
	}
	catch(Exception e) {
		Assert.fail("Exception accured white testing testAddNewCustomerFieldsWithValidDetails:" + e.getStackTrace());
		
	}
	logger.info("Ending of testAddNewCustomerFieldsWithValidDetails method");

}

//@Test(priority=2)
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
