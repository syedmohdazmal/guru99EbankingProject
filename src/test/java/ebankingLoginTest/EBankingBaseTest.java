package ebankingLoginTest;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EBankingBaseTest {
	private static final Logger logger = Logger.getLogger("EBankingBaseTest.class.getClass()");
	protected WebDriver driver;
	protected Properties testData;
	protected Properties expectedAssertion;

	public EBankingBaseTest() {
		logger.info("Starting of EBankingBaseTest constructor");
		try {
			testData = new Properties();
			FileReader testDataFile = new FileReader("src/test/resources/testData.properties");
			testData.load(testDataFile);
			expectedAssertion = new Properties();
			FileReader expectedAssertFile = new FileReader(
					"src\\test\\resources\\expectedAssertion.properties");
			expectedAssertion.load(expectedAssertFile);
		} catch (Exception e) {
			Assert.fail("Exception accured while loading file:" + e.getMessage());

		}

		logger.info("Ending of EBankingBaseTest constructor");
	}

	@BeforeClass
	public void initDriver() {
		try {
			logger.info("Starting of initDriver method");
			String browserName = testData.getProperty("browser");
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else {
				System.out.println("Invalid browser Name");
			}
		} catch (Exception e) {
			Assert.fail("Exception accured when browser not initialized" + e.getMessage());
			
		}
		
		driver.get(testData.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		logger.info("Ending of initDriver method");

	}

	@AfterClass
	public void quitDriver() {
		logger.info("Starting of quit driver method");
		driver.quit();
		logger.info("Ending of quit driver method");

	}

}
