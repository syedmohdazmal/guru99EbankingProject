package ebankingLoginPage;


import java.awt.Desktop.Action;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EBankingBasePage {
	private static Logger logger=Logger.getLogger("ManagerLoginBasePage.class.getClass()");
	protected WebDriver driver;
	public EBankingBasePage(WebDriver driver) {
		logger.info("Starting of ManagerLoginBasePage Constructor");
		this.driver=driver;
		PageFactory.initElements(driver, this);
		logger.info("Ending of ManagerLoginBasePage Constructor");

	}
	
	public void selectDropDown(WebElement element)
	{
		logger.info("Starting of selectDropDown method");
		Select select=new Select(element);
		select.selectByIndex(1);
		logger.info("Ending of selectDropDown method");

	}
	


}
